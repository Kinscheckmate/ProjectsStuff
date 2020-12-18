import java.util.Scanner;

    public class NumberSquare {


        public static void main(String[] args)
        {
            Scanner s1 = new Scanner(System.in);
            System.out.print("Min? ");
            int min = s1.nextInt();
            System.out.print("Max? ");
            int max = s1.nextInt();

            for (int start = min; start <= max; start++)
            {
                for (int numdig = min, x = start; numdig <= max; numdig++)
                {
                    if (x==(max+1))
                    {x = min;}
                    System.out.print(x);
                    x ++;
                }
                System.out.println();
            }
        }
    }
