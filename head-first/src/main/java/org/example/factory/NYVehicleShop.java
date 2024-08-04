package org.example.factory;

public class NYVehicleShop extends VehicleShop {

     Vehicle getVehicle(String type) {
        if (type.equals("truck")) {
            return new Truck();
        }
        return new Bus();
    }
}
