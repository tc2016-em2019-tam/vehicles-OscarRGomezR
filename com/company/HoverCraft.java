package com.company;

public class HoverCraft extends Vehicle implements LandVehicle, SeaVessel{
    private int numWheels;
    private double displacement;

    public HoverCraft(String name, int maxPassengers, double maxSpeed, int numWheels, double displacement) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
        this.displacement = displacement;
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("Calling drive() method!");
    }

    @Override
    public double getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.println("Ahoy!");
    }

    public void enterLand(){
        System.out.println("");
    }

    public void enterSea(){
        System.out.println("");
    }
}