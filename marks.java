import java.util.Scanner;
class marks extends Exception
{
// Declare default constructor.
marks(String statement)
{
super(statement); // Call super exception class constructor.
}
static double M1,M2,M3,sum,avg;// make it static to enable referencing from static context
static void check() throws marks; // make it static to enable referencing from static context
{ 
Scanner trc = new Scanner(System.in);
System.out.println("Enter Marks for OOP2=");
M1 = trc.nextDouble();
System.out.println("Enter Marks for OOOSDM=");
M2 = trc.nextDouble();
System.out.println("Enter Marks for DS=");
M3 = trc.nextDouble();
sum=M1+M2+M3;
avg=sum/3;
System.out.printf("Average=%.2f\n",avg);
trc.close();
}
public static void main(String[] args, marks marks)
{
try
{
check();
marks student = marks;
if(avg < 50)
throw student;
else
System.out.println("Ok .... you can progress");
}
catch(marks zu)
{
 System.out.println(zu.getMessage());
}
}
}