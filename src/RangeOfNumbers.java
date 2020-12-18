import java.util.Scanner;

public class RangeOfNumbers {

    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Start? ");
        int start = s1.nextInt();
        System.out.print("End? ");
        int end = s1.nextInt();
        if (start == end)
        {
            System.out.print(start);
        }
        else if (start < end)
        {
            for (int num = start; num <= end; num++)
            {
                if (num != end)
                {System.out.print(num + ", "); }
                else
                {
                    System.out.println(num);
                }
            }
        }
        else // (end < start)
        {
            for (int num = start; num >= end; num--)
            {
                if (num != end)
                {System.out.print(num + ", "); }
                else
                {
                    System.out.println(num);
                }
            }
        }
    }
}
