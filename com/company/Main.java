
package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Vehicle[] myArray = new Vehicle[5];

        myArray[0] = new Jeep("Fred's Jeep",4,120,4);
        myArray[1] = new Jeep("Frank's Jeep", 2,140, 4);
        myArray[2] = new HoverCraft("Sue's Hover-craft",6,80,8,4.1);
        myArray[3] = new Frigate("Money Waster", 2,85,9.10);
        myArray[4] = new PoliceCar("Dodge charger", 4, 152, 4);

        List<Vehicle> myList = new LinkedList<Vehicle>();
        myList.add(new Jeep("Fred's Jeep",4,120,4));
        myList.add(new Jeep("Frank's Jeep", 2,140, 4));
        myList.add(new HoverCraft("Sue's Hover-craft",6,80,8,4.1));
        myList.add(new Frigate("Money Waster", 2,85,9.10));
        myList.add(new PoliceCar("Dodge charger", 4, 152, 4));



        for (int i=0; i<myArray.length; i++) {

            System.out.println(myArray[i].getName());

            if (myArray[i] instanceof LandVehicle) {
                LandVehicle lv = (LandVehicle)myArray[i];
                lv.drive();
            }

            if (myArray[i] instanceof Emergency) {
                Emergency xv = (Emergency)myArray[i];
                xv.soundSiren();
            }
        }

        for (int i = 0; i < myList.size(); i++) {

            System.out.println(myList.get(i).getName());

            if (myList.get(i) instanceof LandVehicle) {
                LandVehicle lv = (LandVehicle) myList.get(i);
                lv.drive();
            }

            if (myList.get(i) instanceof Emergency) {
                Emergency ie = (Emergency) myList.get(i);
                ie.soundSiren();
            }
        }

        Vehicle[] myVehicles = new Vehicle[5];

        myVehicles[0] = myArray[0];
        myVehicles[1] = myArray[1];
        myVehicles[2] = myArray[2];
        myVehicles[3] = myArray[3];
        myVehicles[4] = myArray[4];

        System.out.println("My vehicle list: ");

        for (int n=0; n<myVehicles.length; n++){
            System.out.println(myArray[n].getName()
            );
        }
    }
}