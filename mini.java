import java.util.Scanner;


public class mini
{
    public static void main(String[]args)
    {
        int mynumber = (int)(Math.random()*100);

        Scanner sc = new Scanner(System.in);
        int usernumber = 0;
        
        do
        {
            System.out.println("Enter your number");
            usernumber = sc.nextInt();
            if (usernumber == mynumber)
            {
                System.out.println("Wooohoooo correct");
                break;
            }
            else if(usernumber>mynumber)
            {
                System.out.println("your number is large");
            }
            else
            {
                System.out.println("Your number is small");
            }
        } while (usernumber>=0);

        
        System.out.println("My number was : ");
        
        
        System.out.println(mynumber);

    }
}