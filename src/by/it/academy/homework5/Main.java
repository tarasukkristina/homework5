package by.it.academy.homework5;

public class Main {
    public static void main(String[] args) {
        Phone xiaomi = new Phone (8575742,"Xiaomi", 0.1);
        System.out.println("First phone: " + "number is " + xiaomi.number + ", model is " + xiaomi.model + ", weight is " + xiaomi.weight + " kg");

        Phone honor = new Phone (2600507,"Honor", 0.2);
        System.out.println("Second phone: " + "number is " + honor.number + ", model is " + honor.model + ", weight is " + honor.weight + " kg");

        Phone samsung = new Phone (3154865,"Samsung", 0.3);
        System.out.println("Third phone: " + "number is " + samsung.number + ", model is " + samsung.model + ", weight is " + samsung.weight + " kg");

        xiaomi.receiveCall("Mike");
        System.out.println(xiaomi.getNumber());
        xiaomi.receiveCall("Bob", 7512850);

        honor.receiveCall("John");
        System.out.println(honor.getNumber());
        honor.receiveCall("Den", 7458565);

        samsung.receiveCall("Sonya");
        System.out.println(samsung.getNumber());
        samsung.receiveCall("Kate", 2543685);

        xiaomi.sendMessage(45485685, 7548989);
        honor.sendMessage(7564455);
        samsung.sendMessage(7745568, 7556677, 88988999);

    }
}
