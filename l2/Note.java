package l2;

public interface Note {
//    Interface to set and retrieve information
//    about a note


// setValue receives int value of a note as parameter,
// which sets the corresponding String value, key color & frequency
    void setValue(int val);

  //  sets the string length of a note with the length parameter
    void setStrLength(String length);

  // sets the String of the note corresponding to the int val parameter
    void setStrValue(int val);

  // determines either black or white key from the int val parameter
    void setKeyColor(int val);

  // sets frequency of the note with the double val parameter
    void setFrequency(double val);

}
