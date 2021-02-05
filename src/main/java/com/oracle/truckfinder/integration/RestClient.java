package com.oracle.truckfinder.integration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.truckfinder.beans.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

/**
 * This class is used to get data from remote - source.
 */
public class RestClient {

    /**
     * This method is used to call data source api.
     * @param query
     * @param DATA_SOURCE_QUERY_URL
     * @return
     */
    public List<Response> getFoodTrucksByQuery(final String query, final String DATA_SOURCE_QUERY_URL){

        HttpURLConnection conn = null;
        List<Response> foodTrucks = Collections.EMPTY_LIST;
        ObjectMapper mapper = new ObjectMapper();
        StringBuilder result = new StringBuilder();
        try {
            final URL url = new URL(DATA_SOURCE_QUERY_URL + URLEncoder.encode(query, StandardCharsets.UTF_8.toString()).replaceAll("\\+", "%20"));
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            rd.close();
            foodTrucks = mapper.readValue(result.toString(), new TypeReference<List<Response>>() {});
        } catch (final IOException e) {
            System.out.println(e.getStackTrace());
        } catch (final Exception e) {
            System.out.println(e.getStackTrace());
        } finally {
            conn.disconnect();
        }
        return foodTrucks;
    }
}
