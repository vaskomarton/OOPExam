package Library;

import Employe.Employe;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private HashMap<Employe,Long> accessCodes = new HashMap<>();

    public Library(Employe employe,long accessCode){
        accessCodes.put(employe,accessCode);
    }

    //Everyone can access
    public ArrayList<Book> getBooks() {
        return books;
    }

    //Employees can access
    public void addEmployee(Employe employe, long newAccesCode, long myAccessCode){
        if (!hasAccess(myAccessCode)){
            return;
        }
        if (accessCodes.containsKey(employe)){
            System.out.printf("\n%s is alredy exist.\n", employe);
            return;
        }
        accessCodes.put(employe, newAccesCode);
    }
    public void setBooks(ArrayList<Book> books, long accessCode) {
        if (!hasAccess(accessCode)){
            return;
        }
        this.books = books;
    }
    public void addBook(Book book, long accessCode){
        if (!hasAccess(accessCode)){
            return;
        }
        this.books.add(book);
    }
    private boolean hasAccess(long accessCode){
        for (Long code:accessCodes.values()) {
            if (code == accessCode){
                return true;
            }
        }
        System.out.println("You dont have a right for this");
        return false;
    }
}
