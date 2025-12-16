package oop4;

public class Traffic {
    public static void movement(TrafficLight trafficLight){
        switch (trafficLight){
            case RED -> System.out.println("Stop");
            case YELLOW -> System.out.println("Ready");
            case GREEN -> System.out.println("Go");
        }
    }
}
