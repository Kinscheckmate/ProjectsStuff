import java.sql.SQLOutput;

public class MakeTriangles {
    public static void triangle1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void triangle2(int n){
    for(int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(i);
        }
        System.out.println();
    }
//	1
//	22
//	333
//	4444
//	55555
    }
public static void triangle3(int n){
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
//	1
//	12
//	123
//	1234
//	12345
public static void triangle4(int n)
{
    for(int i = 1; i <= n; i++)
    {
        for (int k = 1; k <= (n - i); k++)
        {
            System.out.print(" ");
        }
        for(int j = 1; j <= i; j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
}
//    1
//   12
//  123
// 1234
//12345

public static void triangle5(int n)
        {
        for(int i = 1; i <= n; i++)
        {
        for(int j = 1; j <= i; j++)
        {
        System.out.print(n-i+1);
        }
        System.out.println();
        }
        }
//	5
//	44
//	333
//	2222
//	11111
    public static void main(String[] args)
    {
        triangle1(7);
        triangle2(5);
        triangle3(5);
        triangle4(5);
        triangle5(5);
    }
}
