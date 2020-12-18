public class Test {
    public static void main(String[] args)
    {
        System.out.println(sumSeries(5));
    }
    public static double sumSeries(int n) // I assume that 1/n is included in the sum

    {

        double sum = 1;

        for (int c = 2; c <= n; c ++) // checks if the second number is equal to n

        {

            sum -= (1.0/c);

            c++;

            if (c > n) {return sum;} //this checks if the first number is equal to n

            sum += (1.0/c);



        }

        return sum;

    }


}
