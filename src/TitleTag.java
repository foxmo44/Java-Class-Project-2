/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 1
// DateDue: 2016.09.14
/////////////////////////////////////////////////////////////////////////////////////////
// Note this is the code from class
/////////////////////////////////////////////////////////////////////////////////////////

//The class is used to create the title tag anywhere on the page
public class TitleTag extends Tag
{
	//Default constructor
	public TitleTag()
	{
		super();
	}

	//Constructor with input string for the title
	public TitleTag(String t)
	{
		super(t);
	}

	//Return the html string for the title tag
	public String toString()
	{
		return "<title>" + getContent() + "</title>";
	}

} //End of the title tag class