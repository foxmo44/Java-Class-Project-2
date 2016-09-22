/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 1
// DateDue: 2016.09.14
/////////////////////////////////////////////////////////////////////////////////////////

//This is a generic Tag that can be used with the list or table
public class ItemTag extends Tag{

    //Default constructor
    public ItemTag(){

    }

    public ItemTag( String c){
        super(c);  //calls the base class constructor.  must be first
    }

    public String toString()    //Must be provided
    {
        return getContent();
    }

}