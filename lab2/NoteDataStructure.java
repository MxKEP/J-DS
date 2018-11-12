//MICHAEL POLONIO
//CSC 236-64
//LAB 2-#2
package lab2;


public class NoteDataStructure implements Note {


    private String strValue, length, keyColor;
    private int value;
    private double frequency;
    private String white = "White key";
    private String black = "Black key";
    private String[] values = {"C", "C#", "D", "D#", "E", "F",
            "F#", "G", "G#", "A", "A#", "B"};

    // Initialized to: C : quarter note
    public NoteDataStructure()
    {
        this.value = -9;
        this.length = "Quarter";
        this.keyColor = white;
        setStrValue(value);
        setValue(value);

    }
    // Overloaded constructor
    public NoteDataStructure(int value, String length)
    {
        this.value = value;
        this.length = length;
        setStrValue(value);
        setValue(value);
    }
     // Copy constructor
    public NoteDataStructure(NoteDataStructure noteDS)
    {
        this.strValue = noteDS.strValue;
        this.length = noteDS.length;
        this.value = noteDS.value;
        this.keyColor = noteDS.keyColor;
        this.frequency = noteDS.frequency;
    }
    public void setValue(int val)
    {
        setStrValue(val);
        setKeyColor(val);
        setFrequency(val);
    }
    @Override
    public void setStrValue(int val)
    {
        switch (val) {
            case -9: this.strValue = values[0];
                break;
            case -8: this.strValue = values[1];//strDb;
                break;
            case -7: this.strValue = values[2];//strD;
                break;
            case -6: this.strValue = values[3];//strEb;
                break;
            case -5: this.strValue = values[4];//strE;
                break;
            case -4: this.strValue = values[5];//strF;
                break;
            case -3: this.strValue = values[6];//strGb;
                break;
            case -2: this.strValue = values[7];//strG;
                break;
            case  -1: this.strValue = values[8];//strAb;
                break;
            case 0: this.strValue = values[9];//strA;
                break;
            case 1: this.strValue = values[10];//strBb;
                break;
            case 2: this.strValue = values[11];//strB;
                break;
            default:
                System.out.println("Value is not valid.");
        }

    }
    @Override
    public void setStrLength(String str)
    {
        this.length = str;
    }

    @Override
    public void setKeyColor(int val)
    {
        if (val == -9 || val == -7 || val == -5 || val == -4 ||
                val == -2 || val == 0 || val == 2)
        {
            this.keyColor = white;
        }else
            this.keyColor = black;
    }
    @Override
    public void setFrequency(double val) {
        double exp = val/12;
        this.frequency = (440 * Math.pow(2, exp));

    }
    public int getValue()
    {
        return value;
    }

    public String getLength()
    {
        return length;
    }

    public String getKeyColor()
    {
        return keyColor;
    }

    public double getFrequency()
    {
        return frequency;
    }

    public void setLength(String length)
    {
        setStrLength(length);
    }

    @Override
    public String toString() {
        return String.format(strValue + "\n" + "Length: " + length + " note\n" + "Value: " +
                 value + "\n" + keyColor + "\n" + "%.1fHz", frequency);
    }
}
