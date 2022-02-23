package com.el.foodtruckinformation;

import java.util.ArrayList;
import java.util.Iterator;


public class FoodTruckInformation 
{

	/**
	 * @param args path to data file, food to search for
	*/
	public static void main(String[] args) 
	{
		String file = args[0];
		String foodItem = args[1];
		ArrayList<FoodTruck> allFoodTrucks = Helper.readFoodTruckInformation(file);
		ArrayList<FoodTruck> foodTrucks = findFoodItems(allFoodTrucks, foodItem);
		if (foodTrucks.isEmpty())
		{
			System.out.println("No food trucks are serving " + foodItem);
		}
		else
		{
			printFoodTrucks(foodTrucks);
		}
		//printFoodTrucks(allFoodTrucks);
	}
	
	/**
	 * Print food truck data
	 * @param foodTrucks food truck information read from file
	*/
	public static void printFoodTrucks(ArrayList<FoodTruck> foodTrucks)
	{
		    FoodTruck ft = null;
			Iterator<FoodTruck> ftIter = foodTrucks.iterator();
			while (ftIter.hasNext())
			{
				ftIter.next().printFoodTruck();
			}
	}
	
	/**
	 * Find all food trucks that serve foodItem
	 * @param foodTrucks all food trucks from file
	 * @param foodItem foodItem to search for
	 * @return FoodTruck objects that serve foodItem
	 */
	public static ArrayList<FoodTruck> findFoodItems(ArrayList<FoodTruck> foodTrucks, String foodItem)
	{
		FoodTruck ft = null;
		ArrayList<FoodTruck> foodItemTrucks = new ArrayList<FoodTruck>();
		Iterator<FoodTruck> ftIter = foodTrucks.iterator();
		while (ftIter.hasNext())
		{
			ft = ftIter.next();
			String foodItemList = ft.getFoodItems();
			if (foodItemList.contains(foodItem))
			{
				foodItemTrucks.add(ft);
			}
				
		}
		return foodItemTrucks;
	}
	
}
