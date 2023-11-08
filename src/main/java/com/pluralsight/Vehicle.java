package com.pluralsight;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = 2023; // Change this to the current year
        int age = currentYear - year;

        double value = originalCost;

        if (age >= 0 && age <= 3) {
            value -= value * age * 0.03;
        } else if (age >= 4 && age <= 6) {
            value -= value * age * 0.06;
        } else if (age >= 7 && age <= 10) {
            value -= value * age * 0.08;
        } else {
            value -= 1000.00;
        }

        if (odometer > 100000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
            value -= value * 0.25;
        }

        return value;
    }
}
