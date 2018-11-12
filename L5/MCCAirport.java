package L5;

import java.util.Random;

public class MCCAirport
{
    public static void main(String[] args)
    {
        new MCCAirport();
        System.exit(0);
    }

    final double LANDING_TIME = 3;  // minutes to land
    final double TAKE_OFF_TIME = 2; // minutes to take off
    final double LANDING_RATE = 10; // planes landing each hour
    final double TAKE_OFF_RATE = 10; // planes taking off each hour
    final int ITERATIONS = 1440; // Number of minutes in one day
    ArrayQueue<Double> landingQueue;
    ArrayQueue<Double> takeoffQueue;
    Random generator;

    public MCCAirport()
    {
        generator = new Random(System.currentTimeMillis());
        landingQueue = new ArrayQueue<>();
        takeoffQueue = new ArrayQueue<>();
        calculate();
    }

    public void calculate()
    {
        double runway = 0;
        double landingLengthAvg = 0;
        double takeoffLengthAvg = 0;
        double landingTimeAvg, takeoffTimeAvg;

        // Each iteration simulates 1 minute
        for (int minutes =0; minutes < ITERATIONS; minutes++) {
            double rand1 = generator.nextDouble();
            double rand2 = generator.nextDouble();

            if (rand1 < LANDING_RATE / 60)
                landingQueue.enqueue(rand1); // ADDING PLANE TO LANDING QUEUE
              else if (rand2 < TAKE_OFF_RATE / 60)
                takeoffQueue.enqueue(rand2); // ADDING PLANE TO TAKEOFF QUEUE

            // Checking if runway is available
            if (runway == 0) {
                if (!landingQueue.isEmpty()) {
                    runway = LANDING_TIME; // ALLOCATING USAGE OF RUNWAY FOR LANDING
                    landingQueue.dequeue(); // ALLOWING PLANE TO LAND
                } else if (!takeoffQueue.isEmpty()) {
                    runway = TAKE_OFF_TIME; // ALLOCATING USAGE OF RUNWAY FOR TAKEOFF
                    takeoffQueue.dequeue(); // ALLOWING PLANE TO TAKE OFF
                }
            } else
                runway--;

            takeoffLengthAvg += takeoffQueue.count();
            landingLengthAvg += landingQueue.count();
        }
        takeoffTimeAvg = takeoffLengthAvg * TAKE_OFF_TIME/ITERATIONS;
        landingTimeAvg = landingLengthAvg * LANDING_TIME/ITERATIONS;
        landingLengthAvg /= ITERATIONS;
        takeoffLengthAvg /= ITERATIONS;

        System.out.printf("Average landing queue length: " + "%.6f" + "\n",landingLengthAvg );
        System.out.printf("Average take off queue length: " + "%.6f" + "\n",takeoffLengthAvg );
        System.out.printf("Average landing queue time: " + "%.6f" + "\n",landingTimeAvg);
        System.out.printf("Average take off queue time: " + "%.6f" + "\n",takeoffTimeAvg);
    }
}
