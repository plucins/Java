public class Fibbonaci {
    public static int Calculate(int n)
    {
        if(n <= 1)
        {
            return n;
        }

        return Calculate(n-1) + Calculate(n-2);
    }
}
