//MICHAEL POLONIO
//CSC 236-64
//LAB 2-#1
package lab2A;

public interface Lock {

    //x, y, and z represent lock combination
    void setX(int x);
    void setY(int y);
    void setZ(int z);

    //changes locks combination to numbers passed
    void alter(int x, int y, int z);

    // shows dial turning
    void turn();

    // locks the lock
    void close();

    // attempts to unlock the lock
    void attempt();

    // locked or unlocked : returns true if unlocked
    boolean inquire(boolean a, boolean b,  boolean c);

    // returns current number of dial
    int current();
}
