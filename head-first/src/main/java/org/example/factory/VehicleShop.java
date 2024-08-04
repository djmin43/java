package org.example.factory;

public abstract class VehicleShop {

    Vehicle orderVehicle(String type) {
        Vehicle vehicle;
        vehicle = this.orderVehicle(type);
        return vehicle;
    }

    abstract Vehicle getVehicle(String type);
}
