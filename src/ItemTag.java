/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 1
// DateDue: 2016.09.14
/////////////////////////////////////////////////////////////////////////////////////////

/**
 * This is a generic Tag that can be used with the list or table
 */
public class ItemTag extends Tag{

    //Default constructor
    public ItemTag(){

    }

    /**
     * @param c input string for the constructor for the generic tag class
     */
    public ItemTag( String c){
        super(c);  //calls the base class constructor.  must be first
    }

    /**
     * @return  return the tag content
     */
    public String toString()    //Must be provided
    {
        return getContent();
    }

}