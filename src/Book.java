import java.util.Objects;

/**
 * Objects of the Book class model real-world books that have attributes
 * representing title, year published, and name of book publisher.
 *
 * Book is an example of a composite class.
 *
 * An object of the Book class has-an object of the Author class,
 * which represents the author who wrote that book.
 *
 * The value of hasMaleAuthor is computed and true is returned
 * if sexOfAuthor is equal to "Male". This is an example
 * of state-dependent behaviour.
 * hasMaleAuthor is not represented by an instance variable.
 *
 * @author Lou Pemberton-Roberts
 * @version 2.2 28th January 2020
 */
public class Book
{

    //instance variables
    private String title; // a book has-a title, e.g. "The Catcher in the Rye"
    private String yearPublished; // a book has-a year published, e.g. "1951"
    private String bookPublisher; // a book has-a book publisher, e.g. "Little, Brown and Company"
    private Author author; // a book has-an author of type Author

    /**
     * Constructor for objects of class Book
     * allowing specification of all the required attributes.
     * (We don't check that all the data has been specified
     * correctly however. E.g. theAuthor could be null.)
     */
    public Book(String aTitle, String aYear, String aPublisher, Author theAuthor)
    {
        this.title = aTitle;
        this.yearPublished = aYear;
        this.bookPublisher = aPublisher;
        this.author = theAuthor;
    }

    /**
     * Constructor for objects of class Book,
     * where we only know the book title.
     * (We might not know the other attribute values.)
     * This is the minimum information required to construct
     * a Book object. In this case we chose to make
     * the Author object 'empty'.
     */
    public Book(String aTitle)
    {
        this.title = aTitle;
        this.yearPublished = null; //null indicates an unknown year
        this.bookPublisher = null; //null indicates an unknown publisher
        this.author = new Author();
    }


    //Setter methods are provided for all the instance variable
    //so that these data can be altered in future if necessary,
    //e.g. if the attribution of the author changes.

    /**
     * Setter for a book's author's name.
     * The name is an attribute of the component Author object,
     * not the Book itself. So we have to forward the message
     * to the component object.
     */
    public void setAuthorName(String aName)
    {
        this.author.setName(aName);
    }

    /**
     * Setter for a book's author's year of birth.
     * The name is an attribute of the component Author object,
     * not the Book itself. So we have to forward the message
     * to the component object.
     */
    public void setYearOfBirth(String aYear)
    {
        this.author.setYearOfBirth(aYear);
    }

    /**
     * Setter for a book's author's identified sex.
     * The name is an attribute of the component Author object,
     * not the Book itself. So we have to forward the message
     * to the component object.
     */
    public void setAuthorSex(String aSex)
    {
        this.author.setSexOfAuthor(aSex);
    }

    /**
     * Setter for a book's title.
     */
    public void setTitle(String aTitle)
    {
        this.title = aTitle;
    }

    /**
     * Setter for a book's publisher company.
     */
    public void setBookPublisher(String aPublisher)
    {
        this.bookPublisher = aPublisher;
    }

    /**
     * Setter for a book's year published.
     */
    public void setYearPublished(String aYear)
    {
        this.yearPublished = aYear;
    }

    /**
     * Getter for a book's title.
     */
    public String getTitle()
    {
        return this.title;
    }

    /**
     * Getter for a book's publisher company.
     */
    public String getBookPublisher()
    {
        return this.bookPublisher;
    }

    /**
     * Getter for a book's author sex at time of publishing.
     * This method displays state-dependent behaviour:
     * The value returned depends on part of the state of the receiver.
     * If the receiver's sexOfAuthor is equal to "Male" true is returned.
     * Otherwise false is returned
     */
    public boolean hasMaleAuthor()
    {
        String aSex;
        return this.author.getSexOfAuthor().equals("Male");
    }

    /**
     * Getter for a book's year published.
     * This method returns "Unknown" if the year
     * is not known (i.e. it has not been set).
     */
    public String getYearPublished()
    {
        return Objects.requireNonNullElse(this.yearPublished, "Unknown");

    }

    /**
     * Getter for a book's author's year of birth.
     * This method returns "Unknown" if the author's year of birth
     * is not known (i.e. it has not been set) and otherwise
     * returns the author's year of birth.
     */
    public String getYearOfBirth()
    {
        if (this.author == null || this.author.getYearOfBirth() == null)
        {
            //no author or no author year of birth was set up
            return " Unknown";
        }

        //The author component has been set up,
        //so we can forward this message to the component object
        return this.author.getYearOfBirth();
    }

    /**
     * Getter for a book's author's name.
     * This method returns "Unattributed" if the author's name
     * is not known (i.e. it has not been set) and otherwise
     * returns the author's name.
     */
    public String getAuthorName()
    {
        if (this.author == null || this.author.getName() == null)
        {
            //no author or no author name was set up
            return " Unattributed";
        }

        //The author component has been set up,
        //so we can forward this message to the component object
        return this.author.getName();
    }

    /**
     * This method returns true if the book was first published during
     * the 20th century (1900 - 1999), and otherwise returns false.
     */public boolean wasPublishedLastCentury()
    {
        return(Integer.parseInt(this.getYearPublished()) > 1899 && Integer.parseInt(this.getYearPublished()) < 2000);
    }

    /**
     * Returns a string describing this object.
     */
    public String toString()
    {
        return "The book titled " + this.title + " was written by " + this.author.getName() + ". " + this.author + " The book was published in " + this.getYearPublished() + " by " + this.getBookPublisher() + ".";
    }

}
