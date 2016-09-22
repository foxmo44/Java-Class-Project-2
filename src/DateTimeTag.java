/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 2
// DateDue: 2016.09.28
/////////////////////////////////////////////////////////////////////////////////////////

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//This tag enables a timestamp to be added to the page.  it uses a system call for the current time also
public class DateTimeTag extends Tag{

	private String DateTime;
	/**
	 * The label that will lead the date time
	 */
	private String Label;

	public DateTimeTag()		//Constructor for the class
	{
        Label = "";
		ReadDateTime();	//Ask the system for the date time
	}

    public DateTimeTag(String l)		//Constructor for the class
    {
        Label = l;
        ReadDateTime();	//Ask the system for the date time
    }


	public void setDateTime(String u)
	{
		DateTime = u;
	}	//Setter function

	public String getDateTime()
	{
		return DateTime;
	}		//Getter function

	public void ReadDateTime()
	{
		//TODO: read the system time and format the output string
		//TODO: integrate into a call for the page class then call the page function for adding to the output of project 2

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		DateTime = dateFormat.format(date);
	}

	public String toString()
	{
		return "<h3>" + Label + getDateTime() + "</h3>";
	}		//Return the link tag text

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}
}	//End of the AnchorTag class