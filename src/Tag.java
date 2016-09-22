/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 1
// DateDue: 2016.09.14
/////////////////////////////////////////////////////////////////////////////////////////
// Note this is the code from class
/////////////////////////////////////////////////////////////////////////////////////////

//Base class for the tags.  Other tag types will extend from it
public abstract class Tag{
	
	private String content;

	//Default constructor
	public Tag()
	{
		content = "Default Content";
	}

	//Constructor where the input string is provided for the content
	public Tag(String c)
	{
		content = c;
	}

	//Setter for the content
	public void setContent(String c)
	{
		content = c;
	}

	//Getter for the content retrieval
	public String getContent()
	{
		return content;
	}

	//abstract function that ensures child class provide this functionality
	public abstract String toString();
}