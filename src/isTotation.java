public class isTotation {

    public static void main(String[] args)
    {
        System.out.println(isRotation("abcde", "deabc"));
    }

    public static boolean isRotation(String s1, String s2)
    {
        if (s1.equals(s2)) { return true;}
        String temp = "";
        for (int c = 1; c <= s1.length(); c++)
        {
            if (s1.equals(s2)) { return true;}
            s1 = s1.charAt(s1.length()-1) + s1.substring(0, s1.length()-1);
            System.out.println(s1);
        }
        return false;
    }
}
