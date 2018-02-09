/*
 * Class designed to encrypt and decrypt messages. A key is set based on user
 * input. The message to be encrypted or decrypted is also based on user input.
 * User will not get proper decryption unless they actually know the key. Using
 * the algorithm that defines the Vigenere table, the letter value is
 * calculated. That's converted to ASCII in order to make it easy to concatenate
 * into a string which will contain the entire message.
 *
 * Programmer: Teepu Khan
 * Date: April 29, 2016
 * Class: Cipher.java
 * Course: CSC 459 @ CSUDH
 *
 */

package vigenere_twk;

public class Cipher 
{   
    private String keyString, inputString;
    private String outputString;
    private int keyValue, inputValue, outputValue;  // Used for converting using ascii.
    private int keyCount = 0;   // For keeping track of key index.
    private Key key = new Key();
    
    // Default constructor.
    public Cipher()
    {    }
    
    // Encrypts given string. Parameters are (in order) key and input.
    public String encrypt(String k, String i)
    {
        outputString = "";  // Resets value for each subsequent use.
        setKey(k);
        setInput(i);        
        
        // Go through the whole input message one by one.
        for(int test = 0; test < inputString.length(); test++)
        {
            // When the end of the key is reached, reset count to reflect the 
            // beginning of key.
            if(keyCount == keyString.length())
            {
                keyCount = 0;
            }
            
            // Convert the key character, input character and output character
            // to their ASCII values, then converting that to the letter value.
            keyValue = keyString.charAt(keyCount) - 65;
            inputValue = inputString.charAt(test) - 65;
            outputValue = (inputValue + (keyValue)) % 26;
            
            // Converts output's letter value back to ASCII then into the
            // appropriate letter, using that value. That is then appended
            // to the end of the output String in order to create the full
            // encrypted message.
            outputString += Character.toString((char) (outputValue + 65));
            
            keyCount++;            
        }
        
        keyCount = 0;   // Resets count for subsequent use.
        
        return outputString;
    }
    
    // Decrypts given string.
    public String decrypt(String k, String i)
    {
        outputString = ""; // Resets values for each subsequent use.
        keyCount = 0;
        setKey(k);
        setInput(i);        
        
        // Go through the whole input message one by one.
        for(int test = 0; test < inputString.length(); test++)
        {
            // When the end of the key is reached, reset count to reflect the 
            // beginning of key.
            if(keyCount == keyString.length())
            {
                keyCount = 0;
            }
            
            // Convert the key character, input character and output character
            // to their ASCII values, then converting that to the letter value.
            // Since Java calculates negative modulus to a negative value, we
            // test it. If we get a negative number, we merely add 26 to offset
            // the value properly.
            keyValue = keyString.charAt(keyCount) - 65;
            inputValue = inputString.charAt(test) - 65;
            int testForNegative = (inputValue - keyValue) % 26;
            if (testForNegative < 0)
            {
                testForNegative += 26;
            }
            outputValue = testForNegative;            
            
            // Converts output's letter value back to ASCII then into the
            // appropriate letter, using that value. That is then appended
            // to the end of the output String in order to create the full
            // encrypted message.
            outputString += Character.toString((char) (outputValue + 65));
            
            keyCount++;            
        }
        
        keyCount = 0;   // Resets count for subsequent use.
        
        return outputString;
    }
    
    // Sets the key. The GUI class will set s to DEFAULT if the user chooses
    // that option. Otherwise, set key to input.
    public void setKey(String s)
    {
        if (s.equals("DEFAULT"))
        {
            keyString = key.getKey();
        }
        else
        {
            key = new Key(s);
            keyString = key.getKey();
        }
    }
    
    // Sets the input message. Gets rid of non-letter characters and assures
    // that everything is in upper case.
    public void setInput(String s)
    {
        s = s.replace(" ", ""); // Removes whitespace.
        s = s.replaceAll("[^a-zA-Z]", "");  // Removes anything that isn't a letter.
        s = s.toUpperCase();    // Makes everything upper case.
        
        inputString = s;
    }        
}
