import java.util.Scanner;
public class PrimeFactor
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int n = s.nextInt();
        for(int i=2;i<=n;i++)
        {
            while(n%i==0)
            {
                System.out.println(i);
                n=n/i;
            }
        }
    }
}

