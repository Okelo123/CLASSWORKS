import java.util.Scanner;
class HUMAN 
{
    int age, yob, currentyear;
    
    class PERSON
    {
        int retirement;
    }
    public static void(String[]args)
    
    {
        Scanner me = new Scanner(System.in);
        HUMAN myage = new HUMAN();
        HUMAN.PERSON myretirement = myage.new PERSON();
        System.out.println("enter year of birth=");
        myage.age=myage.currentyear-myage.yob;
        myretirement.retirement=myage.yob+60;
        System.out.println("Your current Age=" +myage.age);
        System.out.println("Your year of retirement=" +myretirement.retirement);
    }
    
}