/*
 * Class designed to just create the key to be used in encryption and then allow 
 * other classes to acquire the string. Done as a class to lock out accidental 
 * editing of the key. Rather than throwing an error, all non-letter characters
 * are automatically removed.
 *
 * Programmer: Teepu Khan
 * Date: April 29, 2016
 * Class: Key.java
 * Course: CSC 459 @ CSUDH
 *
 */

package vigenere_twk;

public class Key 
{    
    private String key;
    
    // Default constructor. Sets default key.
    public Key()
    {
        key = "OLLYOLLYOXENFREE";
    }
    
    // Overloaded constructer. Allows user to set personal key. Only letters
    // are retained as valid input.
    public Key(String s)
    {
        s = s.replace(" ", ""); // Removes white space.
        s = s.replaceAll("[^a-zA-Z]", "");  // Removes anything that's not a letter.
        s = s.toUpperCase();    // Makes everything upper case.
        
        key = s;
    }
    
    // Getter. Returns key.
    public String getKey()
    {
        return key;
    }
}
