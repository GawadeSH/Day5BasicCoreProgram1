public class CoinFlip
{
    public static void main(String[] args)
    {

        double rand = Math.random();
        if ( rand < 0.5) {
            System.out.println("tails = " + rand);
        }
        else
        {
            System.out.println("heads = " + rand);
        }

    }
}
