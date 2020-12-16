package org.example.projects.claranet.domain;

public class Car extends Vehicle{

    @Override
    public double dueTollForOneKm() {
        return 0.2;
    }
}
