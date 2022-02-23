package com.el.foodtruckinformation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.ArrayList;



public class Helper {
	public static ArrayList<FoodTruck> readFoodTruckInformation(String foodtruck_url){

		String line = "";
        String splitBy = ",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";

        FoodTruck foodtruck = null;
        ArrayList<FoodTruck> allFoodTrucks = new ArrayList<FoodTruck>();
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
        		.appendPattern("MM/dd/yyyy hh:mm:ss a")
        		.toFormatter();
        try
        {
            try (//parsing a CSV file into BufferedReader class constructor
			BufferedReader br = new BufferedReader(new FileReader(foodtruck_url))) {
				br.readLine();
				while ((line = br.readLine()) != null)   //returns a Boolean value
				{
				    String[] ft = line.split(splitBy, -1);    // use comma as separator
				    foodtruck = new FoodTruck();
				    foodtruck.setLocID(Integer.parseInt(ft[0]));
				    foodtruck.setApplicant(ft[1]);
				    foodtruck.setFacilityType(ft[2]);
				    foodtruck.setCnn(ft[3]);
				    foodtruck.setLocDesc(ft[4]);
				    foodtruck.setAddress(ft[5]);
				    foodtruck.setBlocklot(ft[6]);
				    foodtruck.setBlock(ft[7]);
				    foodtruck.setLot(ft[8]);
				    foodtruck.setPermit(ft[9]);
				    foodtruck.setStatus(ft[10]);
				    foodtruck.setFoodItems(ft[11]);
				    foodtruck.setX(ft[12]);
				    foodtruck.setY(ft[13]);
				    foodtruck.setLatitude(ft[14]);
				    foodtruck.setLongitude(ft[15]);
				    foodtruck.setSchedule(new URL(ft[16]));
				    foodtruck.setDayshours(ft[17]);
				    foodtruck.setNOISent(ft[18]);
				    foodtruck.setApproved(ft[19]);
				    foodtruck.setReceived(ft[20]);
				    foodtruck.setPriorPermit(ft[21]);
				    foodtruck.setExperationDate(ft[22]);
				    foodtruck.setLocation(ft[23]);
				    foodtruck.setFirePreventionDistrict(ft[24]);
				    foodtruck.setPoliceDistrict(ft[25]);
				    foodtruck.setSupervisorDistrict(ft[26]);
				    foodtruck.setZipcode(ft[27]);
				    foodtruck.setNeighborhood(ft[28]);
				    allFoodTrucks.add(foodtruck);
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return allFoodTrucks;
    }
}
