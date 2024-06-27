import java.util.Scanner;

public class LAND 
{
Scanner parttime=new Scanner (System.in);    
int Size;
String Location;
void CaptureData()
{
System.out.println("Enter location=");
Location=parttime.nextLine();
System.out.println("Enter Size=");
Size=parttime.nextInt();
}
public static void main(String[] args) 
{
PAYMENT client=new PAYMENT();
client.Finalize();
}

}
class TRANSACTION extends LAND
{
double Price, Discount;
void Agreement()
{
 CaptureData(); 
System.out.println("Enter Price=");
Price=parttime.nextDouble();
System.out.println("Enter Discount in %=");
Discount=parttime.nextDouble();
}
}
class PAYMENT extends TRANSACTION
{
  double PayableAmount;
  int ModeOfPayment;
 void Finalize()
 {
Agreement();
PayableAmount=Price-(Price*Discount*0.01);
System.out.println("Enter ModeOfPayment 1(BANK) 2(CASH) 3(MPESA)");
ModeOfPayment=parttime.nextInt();
System.out.println("*OUTPUT*");
System.out.println("Location="+Location);
System.out.println("Size="+Size);
System.out.println("Price="+Price);
System.out.println("Discount given="+(Price*Discount*0.01));
System.out.println("PayableAmount="+PayableAmount);
System.out.println("ModeOfPayment="+ModeOfPayment);
}

    
}