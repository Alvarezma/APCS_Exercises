public class PayrollProgram
{  
  public static void main ( String[] args )  
  {
    long   hoursWorked = 40;    
    double payRate     = 10.0, taxRate = 0.10;
    double pay   =  hoursWorked * payRate;
    double tax   =  pay * taxRate;
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + pay );
    System.out.println("tax Amount  : " + tax );
  }
}