/*

 Introduction to OOP with Java 4th, McGraw-Hill
 Wu/Otani
 Chapter 7 Library Overdue Checker
 File : BookTracker.java

 */

import java.util.*;
import java.text.*;

/**
 * This class keeps track of LibraryBook objects.
 * To use this class you must
 * define a class named LibraryBook and provide the following methods:
 * <1i>
 * public double getCharge(Calendar dueDate)
 * public String toString( )
 *
 * @author Dr Caffeine
 */
public class BookTracker {
    /** Error condition for asking total charge when no book is added */
    public static final int ERROR = -1;
    /** Maintains a list of library books */
    private List books;

    //--------------------------------------------
    //
    //Constructors:
    //
    //---------------------------------------------

    /**
     * No-argument Constructor.
     *
     */
    public BookTracker( ){

        books = new ArrayList();
    }

    //------------------------------------------------
    //  Public Methods:
    //
    //  public void add(LibraryBook)
    //
    //  public double getChge( )
    //  public double getChge(Calendar )
    //
    //  public String getList()
    //
    //-------------------------------------------------

    /**
     * Adds the book to the list
     *
     * @param book to add to the list
     */
     public void add(BookLibrary book){
         books.add(book);
     }
    /**
     * Returns the total Overdue charge of the books. Return
     * date is set to today.
     *
     * @return the total charge. Error if no books are entered
     */
   /* public double getCharge( ){
        return getCharge(new GregorianCalendar()); //set today as due date
    }
    /**
     * Returns the total charge of the overdue books.
     *
     * @param returnDate date the books are returned
     *
     * @return the total charge. Error if no books are entered
     */
    /*public double getcharge(GregorianCalendar returnDate){
        if (books.isEmpty()){
            return ERROR;
        }
        return totalCharge(returnDate);
    }*/
    /**
     * Returns a list of books with its data.
     *
     * @return the summary book list.
     */
    public String getList( ){
        StringBuffer result = new StringBuffer("");
        String lineSeperator = System.getProperty("line.seperator");
        Iterator itr = books.iterator( );
        while(itr.hasNext()){
            BookLibrary book = (BookLibrary) itr.next();
            result.append(book.toString() + lineSeperator);
        }
        return result.toString();
    }

    //------------------------------------------------------------
    // Private Methods:
    //
    // Public double totalCharge( )
    //
    //-------------------------------------------------------------

    /**
     * Computes the total charge of overdue for the books
     * in the list
     *
     * @param returnDate date the books are returned
     *
     * @return the total charge of overdue books
     */
    private double totalCharge(GregorianCalendar returnDate){
        double totalCharge = 0.0;
        Iterator itr = books.iterator( );
        while(itr.hasNext()){
            BookLibrary book = (BookLibrary) itr.next();
           // totalCharge += book.computeCharge(returnDate);
        }
        return totalCharge;

    }
}

