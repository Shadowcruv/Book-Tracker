import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class BookLibrary {
   // Class Data members
    private static String Title = " Unknown Title";
    private static double ChargePerDay = 0.0;
    private static GregorianCalendar DueDate = new GregorianCalendar();

    //Constants
    private final double MAXIMUM_CHARGE = 30;



    //setMethods
    public void setTitle(String name){
        Title = name;
    }
    public void setChargePerDay(double charge){
        ChargePerDay = charge;
    }
    public void setDueDate(GregorianCalendar date){
        DueDate = date;
    }

    //g..Methods
     public String getTitle(){
        return Title;
    }
     public double getChargePerDay(){
        return ChargePerDay;
    }
     public GregorianCalendar getDueDate(){
        return DueDate;
    }
    public String toString( ) {
        String tab = "\t";
        SimpleDateFormat sdf
                = new SimpleDateFormat("MM/dd/yy");
        DecimalFormat df = new DecimalFormat("0.00");
        return getTitle() + tab + "$ " +
                df.format(getChargePerDay()); //+ tab + "$ "
               /* df.format(getMaxCharge()) + tab +
                sdf.format(dueDate.getTime()*/ //);
    }

    //Constructor
    public BookLibrary(GregorianCalendar dueDate,String title, double chargePerDay){
          setDueDate(dueDate);
          setChargePerDay(chargePerDay);
          setTitle(title);
    }
    public BookLibrary(GregorianCalendar dueDate){
        this(dueDate,Title,ChargePerDay);
    }
    public BookLibrary(GregorianCalendar dueDate,String title){
        this(dueDate,title,ChargePerDay);
    }

    public BookLibrary(GregorianCalendar dueDate,double chargePerDay){
        this(dueDate,Title,chargePerDay);
    }





}
