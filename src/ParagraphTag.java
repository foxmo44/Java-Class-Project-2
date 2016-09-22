
/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 1
// DateDue: 2016.09.14
/////////////////////////////////////////////////////////////////////////////////////////
// Note this is the code from class
/////////////////////////////////////////////////////////////////////////////////////////

public class ParagraphTag extends Tag{

    //Default constructor for the paragraph tag
    public ParagraphTag(){

    }

    //Takes a string for the input argument to the constructor
    public ParagraphTag( String c){
        super(c);  //calls the base class constructor.  must be first
    }

    //Return the tag representing the paragraph tag in html
    public String toString()    //Must be provided
    {
        return "<p>" + getContent() + "</p>";
    }

} //End of the Paragraph Class