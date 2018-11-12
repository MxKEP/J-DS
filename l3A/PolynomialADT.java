package l3A;

public interface PolynomialADT
{
    // Returns true if LinkedList is empty.
    boolean isEmpty();

    //Sets first node.
    void setFirstNode(PolyNode first);

    // Returns the first node in the linkedlist.
    PolyNode getFirstNode();

    // Adds a polynomial to the beginning of a list, taking the coefficient and
    //exponent as parameters.
    void addPolyNodeFirst(int coeff, int exp);

    // Adds a polynomial to the end of a list, taking the coefficient and
    //exponent as parameters.
    void addPolyNodeLast(int coeff, int exp);

    //PolyNode is set to the end of polynomial
    void addPolyNode(int coeff, int exp);

    // Displays the sum of the 2 polynomials being passed as arguments.
    void addPolynomials(PolyDataStructure A, PolyDataStructure b);
}
