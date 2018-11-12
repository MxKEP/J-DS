package l3A;


public class PolyDataStructure implements PolynomialADT {

    PolyNode first, last, newNode;

    public PolyDataStructure()
    {
        first = null;
        last = null;
        newNode = null;
    }

    public PolyDataStructure(int coeff, int exp)
    {
        newNode = new PolyNode(coeff, exp, null);
    }
    @Override
    public boolean isEmpty()
    {
        return first == null;
    }
    @Override
    public void setFirstNode(PolyNode first)
    {
        first = first;
    }

    @Override
    public PolyNode getFirstNode()
    {
        return first;
    }

    @Override
    public void addPolyNodeFirst(int coeff, int exp)
    {
        newNode = new PolyNode(coeff, exp, null);

        if (first == null)
        {
            first = newNode;
            last = newNode;
        }else
        {
            newNode.next = first.getNext();
            first = newNode;
        }
    }
    @Override
    public void addPolyNodeLast(int coeff, int exp)
    {

        newNode = new PolyNode(coeff, exp, null);

        if (isEmpty())
            last = newNode;
        else {
            PolyNode current = first;
            first.setNext(newNode);
            while (current.getNext() != null) {
                current = current.getNext();
            }
        }
    }
    @Override
    public void addPolyNode(int coeff, int exp) {
        if (isEmpty())
            first = new PolyNode(coeff, exp, null);
        else {
           PolyNode current = first;
            while (current.getNext() != null)
                current = current.getNext();

            current.setNext(new PolyNode(coeff, exp, null));
        }
    }

    @Override
    public void addPolynomials(PolyDataStructure pA, PolyDataStructure pB)
    {
        int coeff;
        PolyNode currentA, currentB;
        PolyDataStructure tempA = pA;
        PolyDataStructure tempB = pB;
        currentA = tempA.first;
        currentB = tempB.first;

        while (currentA != null)
        {
            while (currentB != null)
            {
                if (currentA.getExponent() == currentB.getExponent())
                {
                    coeff = currentA.getCoeff() + currentB.getCoeff();
                    if ( currentA.getExponent() > 0)
                        System.out.print("" + coeff + "x^" + currentA.getExponent() + " ");
                    else
                        System.out.println(coeff);

                    currentB = currentB.next;
                }else
                currentB = currentB.getNext();
            }
            currentA = currentA.getNext();
            currentB = tempB.first;
        }
    }
    @Override
    public String toString()
    {
        if (isEmpty())
            return "The list is empty";
        else {
            String result = "";
            String co, exp = null;
            PolyNode current = first;

            while (current != null) {

                co =  current.getCoeff() + "";
                if (current.getExponent() > 0 )
                exp =  "x^" + current.getExponent() + " + ";
                else if (current.getNext() == null)
                    exp = "";
                else if (current.getCoeff() > 0)
                    exp = " + ";
                else
                    exp = " - ";

                result += co + exp;
                current = current.getNext();

            }return result;
        }
    }
}
