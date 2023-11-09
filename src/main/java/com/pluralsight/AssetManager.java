package com.pluralsight;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("My House", "2020-01-15", 300000, "1075 Goodman Circle", 1, 2000, 5000));
        assets.add(new House("Vacation Home", "2018-05-10", 250000, "2627 Pembroke Rd", 2, 1500, 7500));
        assets.add(new Vehicle("Tom's Truck", "2019-08-20", 25000, "Ford F-150", 2018, 45000));
        assets.add(new Vehicle("My Car", "2022-03-05", 35000, "Chevrolet Sonic", 2020, 20000));
        assets.add(new Vehicle("Joy's car", "2022-07-26", 600, "Chevrolet Silverado", 2022, 100));
        assets.add(new Cash("My October Savings", "2023-10-01", 100));

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Value: $" + asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear());
            }

            System.out.println();
        }
    }
}