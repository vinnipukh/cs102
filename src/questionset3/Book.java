package questionset3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Book {
    /*
    Question 5(ArrayLists, this, classes)
Define a class “Book” with attributes title(String), author(String), and price(double). Create a
constructor using this keyword which initializes all the given attributes. Write a function that
takes maxPrice (double) and a books list (ArrayList<Book>) as parameters. This function
should filter out all the Books that have their price attribute bigger than maxPrice
     */
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public String getAuthor(){
        return this.author;
    }
    public ArrayList<Book> priceCheck(double maxPrice, ArrayList<Book> bookslist){
        ArrayList<Book> filteredBooks = new ArrayList<>();
        for (Book book : bookslist) {
            if (book.getPrice() <= maxPrice) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }
    /*
    Question 6 (ArrayLists, sorting)
Write a function that returns a sorted ArrayList based on price (low to high).
     */
    public ArrayList<Book> sortList(ArrayList<Book> bookList){
        Collections.sort(bookList, Comparator.comparingDouble(Book::getPrice));
        return bookList;
    }
    /*
    Question 7(ArrayLists)
   Write a function that returns a sorted ArrayList based on price (high to low). Do not sort the
   ArrayList. Instead, call the function from the question 6, and reverse the arraylist.
     */
    public ArrayList<Book> reverseSortList(ArrayList<Book> bookList){
        bookList =sortList(bookList);
        Collections.reverse(bookList);
        return bookList;
    }
    /*
    Question 8(ArrayLists, classes)
Write a function with the parameter requestedAuthor(String) that returns all the books with
authors matching the requestedAuthor parameter.
     */
    public ArrayList<Book> requestedAuthorList(ArrayList<Book> bookList,String requestedAuthor){
       ArrayList<Book> resultList = new ArrayList<>();
       for(Book book: bookList){
           if(book.getAuthor().equals(requestedAuthor)){
               resultList.add(book);
           }
       }
       return resultList;
    }



}
