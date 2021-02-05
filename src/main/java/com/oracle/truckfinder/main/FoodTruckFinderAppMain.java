package com.oracle.truckfinder.main;

import com.oracle.truckfinder.beans.Response;
import com.oracle.truckfinder.service.FoodTruckFinderService;
import com.oracle.truckfinder.service.impl.FoodTruckFinderServiceImpl;

import java.util.List;

public class FoodTruckFinderAppMain {

    public static void main(String[] args) {
        FoodTruckFinderService foodTruckFinderService = new FoodTruckFinderServiceImpl();
        final List<Response> trucksByCurrentTime  = foodTruckFinderService.findTruckByCurrentTime();
        foodTruckFinderService.displayTrucks(trucksByCurrentTime);
    }
}
