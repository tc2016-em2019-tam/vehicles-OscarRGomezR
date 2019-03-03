package com.company;

public class PoliceCar extends Vehicle implements Emergency, LandVehicle{
    private int numWheels;

    public PoliceCar(String name, int maxPassengers, double maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
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
    public void soundSiren() {
        System.out.println("*Sounds of Siren*");
    }

    public void DonkeysGrave(){
        System.out.println("Push other car");
    }
}
