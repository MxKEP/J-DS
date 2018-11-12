//MICHAEL POLONIO
//CSC 236-64
//LAB 2-#1
package lab2A;

public class LockDataStructure implements Lock {

    private static final int END_VALUE = 39;
    private static final int START_VALUE = 0;
    private int current = 0;
    private int count = 0;
    private int X, Y, Z;
    private boolean flag1, flag2, flag3;
    private String status = "LOCKED";

    public LockDataStructure() {
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
    }
    public LockDataStructure(int x, int y, int z)
    {
        this.X = x;
        this.Y = y;
        this.Z = z;
    }
    @Override
    public void setX(int x)
    {
        this.X = x;

    }
    @Override
    public void setY(int y)
    {
        this.Y = y;

    }
    @Override
    public void setZ(int z)
    {
        this.Z = z;
    }
    @Override
    public void alter(int x, int y, int z)
    {
        this.X = x;
        this.Y = y;
        this.Z = z;

    }
    @Override
    public void attempt()
    {
        turn();
        if (!inquire(flag1, flag2, flag3)) {
            System.out.println("Your attempt was NOT successful.");
            this.status = "LOCKED";
        } else {
            System.out.println("Your attempt WAS successful");
            this.status = "UNLOCKED";
        }
    }
    @Override
    public void turn()
    {
        System.out.print(current + " ");
        current = END_VALUE;
        for (int i = 0; i <= 39; i++) {
            System.out.print(current + " ");
            current--;
            if (current == 0) {
                count = 1;
            }
        }current = END_VALUE;

        for (int i = 0; i <= 39; i++) {
            if (count != 2) {
                System.out.print(current + " ");
                current--;
                if (current == X) {
                    System.out.print(current + " \n");
                    count = 2;
                    this.flag1 = true;
                }
            }
        }count = 0;

        while (current <= END_VALUE) {
            System.out.print(current + " ");
            current++;
        }current = START_VALUE;

        while (count != 1) {
            System.out.print(current + " ");
            current++;
            if (current == X) {
                System.out.print(current + " ");
                current++;
                count++;
            }
        }
        while (current <= Y) {
            System.out.print(current + " ");
            current++;
        }
        if (current == Y){
            this.flag2 = true;
         }current--;
        System.out.println();
        while ( current != Z){
            System.out.print(current + " ");
            current--;
        }
        if(current == Z)
            System.out.print(current + "\n");
            this.flag3 = true;
        }
    @Override
    public void close()
    {
        this.status = "LOCKED";

    }
    @Override
    public boolean inquire(boolean one, boolean two, boolean three)
    {
        if (one || two || three) {
            this.status = "LOCKED";
            return true;
        }else{
            this.status = "UNLOCKED";
            return false;
        }
    }
    @Override
    public int current()
    {
        return current;
    }
    @Override
    public String toString() {
        return "Combination lock is currently: " +
                 status;
    }
}
