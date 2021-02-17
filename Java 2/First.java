import java.util.ArrayList;
import java.util.Date;

interface Isearch{
         void search_by_name(String s);
        void search_by_author(String s);
        void search_by_pub_date(String s);

    }
class Book{
    private String title;
    private String ISBN;
    private String author;
    private Date pub_date;
    private int cost;
    private boolean issued;
    public Book(String title, String author, String ISBN, int cost, Date pub_date) {
        this.title = title;
        this.author = author;
        this.ISBN=ISBN;
        this.cost = cost;
        this.pub_date=pub_date;
        this.issued = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPub_date() {
        return pub_date;
    }

    public void setPub_date(Date pub_date) {
        this.pub_date = pub_date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }
}
abstract class Library{
    static final String Lib_name="Open House";
    static final String Lib_address="Delhi";
    Book obj;

    {
        obj.setAuthor("Raman");
        obj.setCost(450);
        obj.setISBN("STt565678");
        obj.setTitle("Stories");
    }

    ArrayList<Book> book= new ArrayList<Book>();

    public String getLib_address() {
        return Lib_address;
    }

    public String getLib_name() {
        return Lib_name;
    }


    public abstract void get_book_info();
}

abstract class User extends Library implements Isearch {
    int id;
    String name;
    int age;
    public abstract void get_user_details();
}

class Librarian extends User{


    @Override
    public void search_by_name(String s) {
    book.contains(null);
        System.out.println("Book searched by book name by librarian");
    }

    @Override
    public void search_by_author(String s) {

        System.out.println("Book searched by author name by librarian");
    }

    @Override
    public void search_by_pub_date(String s) {
        System.out.println("Book searched by published date by librarian");
    }

    @Override
    public void get_book_info() {
        System.out.println("Arraylist will be called here that returns book info such as return date, issued by etc");
    }

    @Override
    public void get_user_details() {
        System.out.println("Details of any user");
    }
    public void add_book_item(){
        System.out.println("Add Books");
    }
}

class Customer extends User{
    public void issue_book(){
        System.out.println("If available, issue book to the customer");
    }
    @Override
    public void search_by_name(String s) {
        System.out.println("Book searched by book name by customer");
    }

    @Override
    public void search_by_author(String s) {
        System.out.println("Book searched by author name by customer");
    }

    @Override
    public void search_by_pub_date(String s) {
        System.out.println("Book searched by pub date name by customer");
    }

    @Override
    public void get_book_info() {

    }

    @Override
    public void get_user_details() {
        System.out.println("whether the book is available to be issued");
    }

}

public class First {
    public static void main(String[] args) {
       // ArrayList<Book> book= new ArrayList<Book>();

        Librarian user1=new Librarian();
        Customer user2=new Customer();
        String address=user1.getLib_address();
        String name=user2.getLib_name();
        System.out.println("Library name: "+ name + ", address: " + address);
        user1.search_by_name("abc");
        user2.search_by_name("abc");
        user2.issue_book();


    }
}


