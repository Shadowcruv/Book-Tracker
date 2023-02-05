import java.util.*;

public class Overdue {
     private Scanner scanner;
     private BookTracker bookTrack;
     private String Reply;


     public Overdue(){
         scanner = new Scanner(System.in);
        // scanner.useDelimiter(System.getProperty("line.separator"));
         bookTrack = new BookTracker();

     }

     //------------------------------------------------------------
    //  Main controller method
    //--------------------------------------------------------------

    public void start(){
         Response();
    }

     public void createbook(){
         String Title; double chapeday; GregorianCalendar dudate; double Maxcharge;
         System.out.print("Title: ");
         Title = scanner.next();
         System.out.print("ChargePerDay: $");
         chapeday = scanner.nextInt();
         System.out.println("Duedate: You are to bring it back today");
         dudate = new GregorianCalendar();
         BookLibrary book = new BookLibrary(dudate,Title,chapeday);
         bookTrack.add(book);
     }
     public void Response(){
         System.out.println(" Do you want to Input a book you collected ?  \n   YES or NO");
          Reply = scanner.next();
         while (Reply.equals("YES")){
             createbook();
             System.out.println("Do you want to input another book?");
             String ans = scanner.next();
             Reply = ans;
         }
         System.out.println(bookTrack.getList());
         System.out.println("See you next time");
     }
     public static void main(String[] args){
         Overdue overDue = new Overdue();
         overDue.start();
     }


}
