import java.util.Scanner;
import java.util.Random;
public class Sps 
{
    public static void main(String args[])
    {   
        Scanner obj = new Scanner(System.in);
        int userinp = obj.nextInt();
        Random rnd = new Random();
        int compinp = rnd.nextInt(3);
        if(userinp==compinp)
        {
            System.out.println("Draw!");
        }
        else if(compinp==0 && userinp==1 || compinp==1 && userinp==2 || compinp==2 && userinp==0)
        {
            System.out.println("You Won!!");
        }
        else
        {
            System.out.println("Computer Won!!");
        }
        System.out.println("Computer choice is:"+compinp);
        if(compinp==0)
        {
            System.out.println("Computer choose Rock!!");
        }
        else if(compinp==1)
        {
            System.out.println("Computer choose Paper!!");
        }
        else
        {
            System.out.println("Computer choose Scissors!!");
        }
        obj.close();
    }
}
