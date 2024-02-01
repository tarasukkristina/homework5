package by.it.academy.homework5;

import java.util.Arrays;

public class Phone {
    public int number;
    public String model;
    public double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println("Colling " + callerName);
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall(String callerName, int callerNumber) {
        System.out.println("Colling " + callerName + "\t" + callerNumber);
    }

    public void sendMessage(int... phoneNumbers) {
        System.out.println(Arrays.toString(phoneNumbers));
    }
}
