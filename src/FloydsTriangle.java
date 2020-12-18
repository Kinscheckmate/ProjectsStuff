public class FloydsTriangle
    {
        public static final int n = 7;

        public static void main(String[] args)
        {
            for (int numLines = 1; numLines <= n; numLines++)
            {
                for(int numfslash = (n-numLines)*4; numfslash > 0; numfslash--)
                {
                    System.out.print("/");
                }
                for(int numasteric = (numLines-1)*8; numasteric > 0; numasteric--)
                {
                    System.out.print("*");
                }
                for(int numdslash = (n-numLines)*4; numdslash > 0; numdslash--)
                {
                    System.out.print("\\");
                }
                System.out.println();

            }
        }
    }
