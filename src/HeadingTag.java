/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 1
// DateDue: 2016.09.14
/////////////////////////////////////////////////////////////////////////////////////////

//Class to write out a heading tag
public class HeadingTag extends Tag{

   private int type;

    //Default constructor
    public HeadingTag()
    {
        super();
        type = 1;
    }

    //Constructor that enables the heading text to be passed into the tag
    public HeadingTag(String c)
    {
        super(c);
        type = 1;
    }

    //Constructor that enables the heading text to be passed into the tag along with the type
    public HeadingTag(String c, int t)
    {
        super(c);
        setType(t);
    }

    //Setter of the type.  performs bounds checking
    public void setType(int t)
    {
        if(t >= 1 && t <= 6)
        {
            type = t;
        }
        else
        {
            t = 1;
        }
    }

    //Getter of the type
    public int getType()
    {
        return type;
    }

    //Returns the string representing the tag for the heading
    public String toString()
    {
        return "<h" + getType() + ">" + getContent() + "</h" + getType() + ">";
    }

}   //End of the heading tag class