/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 2
// DateDue: 2016.09.28
/////////////////////////////////////////////////////////////////////////////////////////
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by foxmo on 9/17/2016.
 */
public class PhoneNumber {

    String  strAreaCode;
    String  strThreeDigit;
    String  strFourDigit;
    private Pattern patternNumber = Pattern.compile("[0-9]{3,4}");  //Used to parse the area code out of the number

    /**
     * Default Constructor
     */
    public PhoneNumber()
    {
        ParseNumber("???-???-????");    //Initialize member variables
    }

    /**
     * Phone number constructor that takes a string phone number as an input
     * @param strFullNumber
     */
    public PhoneNumber(String strFullNumber)
    {
        ParseNumber(strFullNumber);     //Parse the number and fill the member variables
    }

    //Parse out the sub parts of the phone number
    public void ParseNumber(String strFullNumber)
    {

        //Split the number into parts using a regular expression
        Matcher matchNumber = patternNumber.matcher(strFullNumber);

        //Take apart the number into area code, 3 digit, and 4 digit
        if(matchNumber.find())
        {
            strAreaCode = matchNumber.group();
        }
        else
        {
            strAreaCode = "???";
        }

        if(matchNumber.find())
        {
            strThreeDigit = matchNumber.group();
        }
        else
        {
            strThreeDigit = "???";
        }

        if(matchNumber.find())
        {
            strFourDigit = matchNumber.group();
        }
        else
        {
            strFourDigit = "????";
        }

    }

    /**
     * Return the string representing the number
     * @return returns the following format 999-999-8888
     */
    public String toString()
    {
        return(strAreaCode + "-" + strThreeDigit + "-" + strFourDigit);
    }

    /**
     * return a table row for the area code then the phone number (2 cells)
     * @return
     */
    public String toHtmlTableString()
    {
        return("<tr><td>" +strAreaCode + "</td>" + "<td>" + strThreeDigit + "-" + strFourDigit + "<\td><\tr>");
    }


    /**
     * @return Return the area code
     */
    public String GetAreaCode()
    {
        return(strAreaCode);
    }


    /**
     * @return Return the 7 digit portion of the number
     */
    public String GetPhoneNumber()
    {
        return(strThreeDigit + "-" + strFourDigit);
    }
}
