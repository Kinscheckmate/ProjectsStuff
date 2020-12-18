public class rowcolumnconvert {

    public static void main(String[] args)
    {
        System.out.println(rowColumnConvert("ABCDEFGHIJKLMN", 3));
    }
    public static String rowColumnConvert(String s, int row) {
        String result = "";
        for (int numrows = 0; numrows < row; numrows++)
        {
            for (int x = numrows; x <= s.length()-1; x += row)
                result += s.charAt(x);

        }
        return result;
    }
}