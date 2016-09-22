/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 1
// DateDue: 2016.09.14
/////////////////////////////////////////////////////////////////////////////////////////

//This tag enables a link to be placed in the output html page
public class AnchorTag extends Tag{

	private String URL;

	/**
	 * @param c Content
	 * @param u URL string
	 */
	public AnchorTag(String c, String u)		//Constructor for the class
	{
		super(c);
		setURL(u);
	}

	/**
	 * Setter for the URL string
	 * @param u Input URL string
	 */
	public void setURL(String u)
	{
		URL = u;
	}	//Setter function

	/**
	 * Returns the URL string
	 * @return URL String
	 */
	public String getURL()
	{
		return URL;
	}		//Getter function

	/**
	 * Method that is automatically created for the URL tag
	 * @return	Return the string for the html tag for the URL
	 */
	public String toString()
	{
		return "<a href=\"" + getURL() + "\">" + getContent() + "</a>\n";
	}		//Return the link tag text

}	//End of the AnchorTag class