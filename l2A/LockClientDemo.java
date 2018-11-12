package l2A;

import java.util.Scanner;

public class LockClientDemo {

    public static void main(String[] args) {

        Lock newLock = new LockDataStructure();

        menu(newLock);

    }

    public static void menu(Lock newLock) {

        Scanner input = new Scanner(System.in);

        int choice, data;

        System.out.println("1: Set lock combination");
        System.out.println("2: Close lock");
        System.out.println("3: Check status");
        System.out.println("4: Attempt to open lock");
        System.out.println("5: Check current dial position");
        System.out.println("6: Exit the program\n");

        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("SET X: ");
                data = input.nextInt();
                newLock.setX(data);
                System.out.println("SET Y: ");
                data = input.nextInt();
                newLock.setY(data);
                System.out.println("SET Z: ");
                data = input.nextInt();
                newLock.setZ(data);
                break;
            case 2:
                newLock.close();
                break;
            case 3:
                System.out.println(newLock);
                break;
            case 4:
                newLock.attempt();
                break;
            case 5:
                System.out.println(newLock.current());
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("**Invalid Entry**");
        }
        menu(newLock);
    }
}
