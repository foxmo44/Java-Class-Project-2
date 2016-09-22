/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 2
// DateDue: 2016.09.28
/////////////////////////////////////////////////////////////////////////////////////////
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;


/**
 * This is the runnable class for the project
 */
public class Project02Fox {

    static private PhoneList objPhoneList;

    /**
     * This method is the main function that kicks it all off
     * @param args Input Arguments from Command line
     */
    public static void main( String[] args )
    {
        Page    objPage = new Page("Phone Number Parser");	//Create the page and set the title
        Scanner inputFile = null;

        //////////////////////////////////////////////////////////////////////////////
        // Try to open the input file
        //////////////////////////////////////////////////////////////////////////////
        try
        {
            inputFile = new Scanner( Paths.get( args[0] ) );
        }
        catch( IOException ioe )
        {
            ioe.printStackTrace();
        }

        //////////////////////////////////////////////////////////////////////////////
        // Use the PhoneList class to parse the input file and create the output html
        //////////////////////////////////////////////////////////////////////////////
        objPhoneList = new PhoneList(inputFile);

        //If we found numbers then place the numbers into a table html output page
        if(objPhoneList.HasNumbers())
        {
            FormHtmlPage(args[0], objPhoneList, objPage);
        }

        ///////////////////////////////////////////////////////
        // Write out the html
        ///////////////////////////////////////////////////////
        WriteThePage(args[0], objPage);

        // Close the file when done
        if( inputFile != null ){
            inputFile.close();
        }

    }

    /**
     * This method will form the html page that stores the phone number table
     * @param inputFilename input filename from command line
     * @param objPhoneList list that contains the phone number objects
     * @param objPage object that is used form the html page
     */
    static void FormHtmlPage(String inputFilename, PhoneList objPhoneList, Page objPage)
    {
        String  strTitle;

        strTitle = "Phone Numbers from " + inputFilename;
        objPage.appendTag( new HeadingTag (strTitle, 2));
        objPage.appendTag( new HeadingTag ("Project by Michael Fox", 3));

        objPage.appendTag(objPhoneList.GetTable());		//Append the table tag to the output html string;

        objPage.appendTag(new DateTimeTag("Page Updated: "));           //Add the date time to page
    }

    /**
     * This method writes the output file based on the input filename and the page to provide html
     * @param strInputFilename input filename from the command line
     * @param objPage object that is used form the html page
     */
    static void WriteThePage(String strInputFilename, Page objPage)
    {
        String[]    parts;
        String      strOutputFilename;
        String      strOutputHtml;

        //Break the filename apart
        parts = strInputFilename.split("\\.");

        //Form the output filename
        strOutputFilename = parts[0] +".html";

        System.out.printf("Writing %s\n", strOutputFilename);
        strOutputHtml = objPage.toString();			//Write out the html string

        //Now that we have the filename for the output.  Write out the html output file
        try
        {
            FileWriter fw = new FileWriter(strOutputFilename, false);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(strOutputHtml, 0, strOutputHtml.length());

            //Close the buffer writer
            bw.close();

            //Close the file writer
            fw.close();

        } catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
