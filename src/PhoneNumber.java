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

    public PhoneNumber()  //Default Constructor
    {
        ParseNumber("???-???-????");    //Initialize member variables
    }

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

    //Return the string representing the number
    public String toString()
    {
        return(strAreaCode + "-" + strThreeDigit + "-" + strFourDigit);
    }

    //TODO: put in the html format
    public String toHtmlTableString()
    {
        return("<tr><td>" +strAreaCode + "</td>" + "<td>" + strThreeDigit + "-" + strFourDigit + "<\td><\tr>");
    }

    //Return the area code
    public String GetAreaCode()
    {
        return(strAreaCode);
    }

    //Return the 7 digit portion of the number
    public String GetPhoneNumber()
    {
        return(strThreeDigit + "-" + strFourDigit);
    }
}
