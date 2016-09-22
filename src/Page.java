/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 1
// DateDue: 2016.09.14
/////////////////////////////////////////////////////////////////////////////////////////
// Note this is the code from class
/////////////////////////////////////////////////////////////////////////////////////////
import java.util.ArrayList;

//This is the primary class for creating the html web page
public class Page{

    private String title;
    private ArrayList< Tag > bodyContent;   //polymorphism

    //Default  constructor which sets a default title
    public Page(){
        title = "Default Title";
        bodyContent = new ArrayList<Tag>();
    }

    //Constructor that will set the title of the page
    public Page( String t)
    {
        title = t;
        bodyContent = new ArrayList<Tag>();
    }

    //Setter function for the title
    public void setTitle(String t)
    {
        title = t;
    }

    //A getter function for the title
    public String getTitle()
    {
        return title;
    }

    //return the string representing the html for the page
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>");
        sb.append("<html>");

        //do the header
        sb.append("<head>");
        sb.append("<meta charset=\"utf-8\">");
        TitleTag tt = new TitleTag( getTitle());
        sb.append( tt.toString() );
        sb.append("</head>");

        //do the body with all of its tags
        sb.append("<body>");
        for(Tag t : bodyContent)
        {
            sb.append(t.toString());
        }
        sb.append("</body>");

        sb.append("</html>");
        return sb.toString();
    }

    //Add a tag to the page
    public void appendTag( Tag t)
    {
        bodyContent.add(t);
    }

} //End of the page class

/*
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title> the title </title>
	</head>
	<body>
	<h1>Hello World </h1>
	</body>
</html>
*/