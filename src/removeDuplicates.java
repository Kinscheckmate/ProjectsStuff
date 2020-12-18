public class removeDuplicates {
    public static void main(String[] args)
    {
        System.out.println(removeDuplicates("bookkeeeeeeperrrrrrr"));
    }
    public static String removeDuplicates(String s)
    {
        Character c1;
        Character c2;
        String r = "";
        for (int c = 1; c <= s.length()-1; c++)
        {
            c1 = (s.charAt(c-1));
            c2 = (s.charAt(c));
            if (!(c1.equals(c2)))
                {r += s.charAt(c-1); }

        }
        r += s.charAt(s.length()-1);
        return r;
    }
}
