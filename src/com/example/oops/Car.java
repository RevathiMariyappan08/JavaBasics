package com.example.oops;

public class Car {

    String color;
    String name;
    int noOfTyres;
    boolean hasSpeedControl;

    int maxSpeed() {
        if(hasSpeedControl) {
            return 100;
        } else {
            return 200;
        }
    }

    int maxNoOfGears() {
        return 5;
    }

    void print() {
        System.out.println("test");
    }

	void print1() {
        System.out.println("test");
    }
	void print2() {
		System.out.println("test");
	}

}
