package l3A;


public class PolyNode
{
    public int coeff;
    public int exponent;
    public PolyNode next;

    public PolyNode()
    {
        coeff = 0;
        exponent = 0;
        next = null;
    }
    public PolyNode(int co, int exponen, PolyNode nex)
    {
        coeff = co;
        exponent = exponen;
        next = nex;
    }

    public int getCoeff()
    {
        return coeff;
    }

    public void setCoeff(int co)
    {
        coeff = co;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exp) {
        exponent = exp;
    }

    public PolyNode getNext()
    {
        return next;
    }

    public void setNext(PolyNode newNext)
    {
        next = newNext;
    }
}
