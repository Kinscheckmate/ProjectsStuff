public class StringBookExercises {

    public static void main(String args[])
    {
        String s1 = "this is a message";
        String name = "Kinscheck, Caleb";
        String n1 = "Obama, Barak";
        String n2 = "Johnson, Dwayne";
        String ns1 = "1011111000101010101011000";
        String ns2 = "0000000000011111111100000";
        String date1 = "05/23/2020";
        String date2 = "04/01/2004";
        String date3 = "4/1/2004";
        String date4 = "2/29/1920";
        System.out.println(scroll(s1));
        System.out.println(convertName(name));
        System.out.println(convertName(n1));
        System.out.println(convertName(n2));
        System.out.println(negativeString(ns1));
        System.out.println(negativeString(ns2));
        System.out.println(convertDate(date1));
        System.out.println(convertDate(date2));
        System.out.println(convertDate2(date3));
        System.out.println(convertDate2(date4));
    }

    public static String scroll(String x)
    {
        return x.substring(1) + x.charAt(0);
    }

    public static String convertName(String n)
    {
        return n.substring(n.indexOf(",")+2) + " " + n.substring(0, n.indexOf(",")); // first name + last name
    }

    public static String negativeString(String s)
    {
        s = s.replace("0", "2");
        s = s.replace("1", "0");
        s = s.replace("2", "1");
        return s;

    }

    public static String convertDate(String dateStr)
    {
        return dateStr.substring(3,5) + "-" + dateStr.substring(0,2) + "-" + dateStr.substring(6);
    }

    public static String convertDate2(String ds)
    {
        String month = ds.substring(0, ds.indexOf("/")) + "-";
        String day = ds.substring(ds.indexOf("/") + 1, ds.lastIndexOf("/")) + "-";
        String year = ds.substring(ds.lastIndexOf("/")+1);
        if (day.length() == 2) {day = "0" + day;}
        if (month.length() == 2) {month = "0" + month;}
        return day + month + year;
    }

}
