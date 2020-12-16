package org.example.projects.claranet.domain;

import java.util.List;

public class HighwayCompany {

    public double calculateTaking(List<Vehicle> vehicles) {
        double taking = 0.0;

        for(Vehicle vehicle: vehicles) {
            taking += vehicle.dueTollForOneKm();
        }

        return taking;
    }

    public void printReport() {

    }
}
