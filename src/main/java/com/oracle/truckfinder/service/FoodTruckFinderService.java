package com.oracle.truckfinder.service;

import com.oracle.truckfinder.beans.Response;

import java.util.List;

/**
 * This interface contains methods to fetch teh food trucks & display them in required order.
 */
public interface FoodTruckFinderService {

    /**
     *This method is used to fetch all food trucks open at current time.
     * @return
     */
    List<Response> findTruckByCurrentTime();

    /**
     *This method displays names & addresses of list of open food trucks.
     * @param foodTrucks
     */
    void displayTrucks(List<Response> foodTrucks);
}
