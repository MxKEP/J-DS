package test;

import java.util.Random;

public class Airport {
    final double LANDING_TIME = 3;
    final double TAKE_OFF_TIME = 2;
    final double LANDING_RATE = 10;
    final double TAKE_OFF_RATE = 10;
    final int ITERATIONS = 1440;
    ArrayQueue<Integer> landingQ;
    ArrayQueue<Integer> takeOffQ;

    private double avg_landq_length = 0;
    private double avg_takeoffq_length = 0;
    private double avg_time_on_landQ = 0;
    private double avg_time_on_takeoffQ = 0;

    // null for runway indicates that it is free
    private Integer runway = null;

    public Airport() {
        landingQ = new ArrayQueue<>();
        takeOffQ = new ArrayQueue<Integer>();
        for (int i = 0; i < ITERATIONS; i++) {
            simulate();
        }
        avg_time_on_landQ = avg_landq_length * LANDING_TIME / ITERATIONS;
        avg_time_on_takeoffQ = avg_takeoffq_length * TAKE_OFF_TIME / ITERATIONS;
        avg_landq_length /= ITERATIONS;
        avg_takeoffq_length /= ITERATIONS;
        System.out.println("Average landing queue length: " + avg_landq_length);
        System.out.println("Average take off queue length: " + avg_takeoffq_length);
        System.out.println("Average landing queue time: " + avg_time_on_landQ);
        System.out.println("Average take off queue time: " + avg_time_on_takeoffQ);
    }


    public void simulate() {
        Random generator = new Random(System.currentTimeMillis());


        double rand1 = generator.nextDouble();
        double rand2 = generator.nextDouble();
        if (rand1 < LANDING_RATE / 60) {
            landingQ.enqueue((int) rand1);
           // System.out.println("takeoff");
        }
        if (rand2 < TAKE_OFF_RATE / 60) {
            takeOffQ.enqueue((int) rand2);
           // System.out.println("landed");
        }
        if (runway == null) {
            // runway is free so now
            // Checking if landing queue is empty
            if (!landingQ.isEmpty()) {
                // Allow it to land
                runway = landingQ.dequeue();
            } else if (!takeOffQ.isEmpty()) {
                // Allow to take off
                runway = takeOffQ.dequeue();
            }
        } else {
            runway = null;
        }
        avg_landq_length += landingQ.count();
        //System.out.println("Land q count "+avg_landq_length);
        avg_takeoffq_length += takeOffQ.count();
    }

    public static void main(String[] args) {
        new Airport();
    }
}