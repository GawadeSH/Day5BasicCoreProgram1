import java.util.Scanner;

public class HarmonicNumber
{
    public static void main(String[] args)
    {
        double sum=0.0,result=0.0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int n = s.nextInt();
        for( int i = 1;i <= n; i++)
        {
            sum =  sum+1.0/i;
            result=sum;
        }
        System.out.println(result);

    }
}
