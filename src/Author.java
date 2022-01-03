/**
 * Author represents an author such as J. D. Salinger.
 * To keep things simple we just have a name and a year of birth.
 * In the context of the Book example, this is a component class.
 * @author Lou Pemberton-Roberts
 * @version 2.1 January 2020
 *
 */
public class Author
{
    // instance variables
    private String name; // an author has-a name, e.g. "Jerome"
    private String yearOfBirth; // an author has-a year of birth, e.g. "1919"
    private String sexOfAuthor; // an author has-an identified sex, e.g. "Male"


    /**
     * zero-argument constructor: if we don’t know the author’s attributes.
     */
    public Author()
    {
        this.name = null; //indicates author name is unknown
        this.yearOfBirth = null; //indicates year of birth is unknown
        this.sexOfAuthor = null; //indicates identified sex is unknown
    }

    /**
     * A constructor for objects of class Author if we know their name
     * but not their year of birth.
     */
    public Author(String aName)
    {
        this.name = aName;
        this.yearOfBirth = null; //indicates year of birth is unknown
    }

    /**
     * A constructor for objects of class Author if we know their name,
     * their year of birth but not their identified sex.
     */
    public Author(String aName, String aYear)
    {
        this.name = aName;
        this.yearOfBirth = aYear;
        this.sexOfAuthor = null; //indicates identified sex is unknown
    }

    /**
     * A constructor for objects of class Author
     * if we know their name, their year of birth and
     * their identified sex.
     */
    public Author(String aName, String aYear, String aSex)
    {
        this.name = aName;
        this.yearOfBirth = aYear;
        this.sexOfAuthor = aSex;
    }

    /**
     * Setter for an author's name.
     */
    public void setName(String aName)
    {
        this.name = aName;
    }

    /**
     * Setter for an author's year of birth.
     */
    public void setYearOfBirth(String aYear)
    {
        this.yearOfBirth = aYear;
    }

    /**
     * Setter for an author's identified sex.
     */
    public void setSexOfAuthor(String aSex)
    {
        this.sexOfAuthor = aSex;
    }

    /**
     * Getter for an author's name. It could
     * return a string such as "unattributed"
     * if the author's name is not known,
     * but we have chosen to keep it simple here.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Getter for an author's year of birth.
     * Keeping it simple, as in getName().
     */
    public String getYearOfBirth()
    {
        return this.yearOfBirth;
    }

    /**
     * Getter for an author's identified sex.
     * Keeping it simple, as in getName().
     */
    public String getSexOfAuthor()
    {
        return this.sexOfAuthor;
    }

    /**
     * Returns a description of this object as a string.
     */
    public String toString()
    {
        return this.name + " was born in " + this.yearOfBirth + " and is " + this.sexOfAuthor + ".";
    }
}
