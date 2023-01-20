import java.util.Scanner;
public class CheckLeapYear
{
    public static void main(String[] args)
    {
        int y;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Year");
        y=s.nextInt();
        if( y % 4 ==0 || y % 400 == 0 || y % 100 != 0)
        {
            System.out.println("It is leap year");
        }
        else
        {
            System.out.println("It is not leap year");
        }


    }
}
