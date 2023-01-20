
public class PowerOfTwo
{
    public static void main(String[] args)
    {
        int n=Integer.parseInt(args[0]);
        System.out.println("n:-"+n);

        for(int i=1;i<=n;i++)
        {
            int pow = (i*2);
            System.out.println(i+" "+pow);
        }

    }
}
