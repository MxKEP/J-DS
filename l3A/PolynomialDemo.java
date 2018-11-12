
package l3A;

public class PolynomialDemo {

    public static void main(String[] args) {

        PolyDataStructure p1 = new PolyDataStructure();
        PolyDataStructure p2 = new PolyDataStructure();
        PolyDataStructure p3 = new PolyDataStructure();
        PolyDataStructure p4 = new PolyDataStructure();
        PolyDataStructure sum = new PolyDataStructure();

        p1.addPolyNodeFirst(4, 3);
        p1.addPolyNodeLast(3, 2);
        p1.addPolyNode(-5, 0);
        p2.addPolyNodeFirst(3, 5);
        p2.addPolyNode(4, 4);
        p2.addPolyNode(1, 3);
        p2.addPolyNode(-4, 2);
        p2.addPolyNode(4, 1);
        p2.addPolyNode(2, 0);
        p3.addPolyNodeFirst(4, 3);
        p3.addPolyNode(3, 2);
        p3.addPolyNode(-5, 0);
        p4.addPolyNodeFirst(5, 4);
        p4.addPolyNode(4, 3);
        p4.addPolyNode(-4, 0);

        System.out.println("p1 = " + p1 + "\np2 = " + p2);

        System.out.print("The sum of p1 & p2 is = ");
        sum.addPolynomials(p1, p2);
        System.out.println();

        System.out.println("p3 = " + p3 + "\np4 = " + p4);

        System.out.print("The sum of p3 & p4 is = ");
        sum.addPolynomials(p3, p4);
    }

}
