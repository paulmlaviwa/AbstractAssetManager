package com.pluralsight;

public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double squareFootValue;
        switch (condition) {
            case 1:
                squareFootValue = 180.00;
                break;
            case 2:
                squareFootValue = 130.00;
                break;
            case 3:
                squareFootValue = 90.00;
                break;
            case 4:
                squareFootValue = 80.00;
                break;
            default:
                squareFootValue = 0.00;
        }
        return (squareFoot * squareFootValue + 0.25 * lotSize);
    }
}
