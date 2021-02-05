package com.oracle.truckfinder.service.impl;

import com.oracle.truckfinder.beans.Response;
import com.oracle.truckfinder.integration.RestClient;
import com.oracle.truckfinder.service.FoodTruckFinderService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FoodTruckFinderServiceImpl implements FoodTruckFinderService {

    public static final String DATA_SOURCE_QUERY_URL = "https://data.sfgov.org/resource/bbb8-hzi6.json?$query=";

    @Override
    public List<Response> findTruckByCurrentTime() {

        String q = "select applicant, location where dayorder=%d and (start24<='%s' and '%s'<=end24) order by applicant";

        final LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter timeIn24Hrs = DateTimeFormatter.ofPattern("HH:mm");

        final String query = String.format(q, currentTime.getDayOfWeek().getValue(), currentTime.format(timeIn24Hrs), currentTime.format(timeIn24Hrs));
        RestClient restClient = new RestClient();
        return restClient.getFoodTrucksByQuery(query,DATA_SOURCE_QUERY_URL);
    }

    @Override
    public void displayTrucks(List<Response> foodTrucks){

        if (foodTrucks.isEmpty()) {
            System.out.println("No open food trucks found !!");
            return;
        }
        String s;
        int offset = 0;
        int limit = 9;
        int start = 0;
        //Accept input from command line
        try (final BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                System.out.println(String.format("%-50s ", "NAME") + String.format("%-30s", "ADDRESS"));
                start = offset;
                for (int i = start; i <= start + limit; i++) {

                    if (foodTrucks.get(i).getApplicant().length() > 50) {
                        System.out.println(String.format("%-80s", foodTrucks.get(i).getApplicant()));
                        System.out.println(String.format("%-50s ", "") + String.format(" %-30s", foodTrucks.get(i).getLocation()));
                    } else
                        System.out.println(String.format("%-50s ", foodTrucks.get(i).getApplicant())
                                + String.format(" %-30s", foodTrucks.get(i).getLocation()));

                    if (offset < foodTrucks.size() - 1) {
                        offset++;
                    } else {
                        System.exit(0);
                    }
                }
                System.out.println(String.format("%-40s", "Press Enter/Return to view more records, or enter anything else to exit : "));
            } while ((s = in.readLine()) != null && s.length() == 0);
        }catch (final IOException ex){
            System.out.println(ex.getStackTrace());
        }
    }
}

