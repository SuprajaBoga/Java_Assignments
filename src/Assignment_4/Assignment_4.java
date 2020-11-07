package Assignment_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Assignment_4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String[] input=new String[n];
        for(int i=0;i<n;i++)
        {
            String[] dates=sc.nextLine().split(" ");
            if(dates.length==2)
                getrange(dates[0],dates[1]);
            else
                System.out.println("need two dates");
        }
    }
    public static void getrange(String signedupdate,String currentdate) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate signeddate = LocalDate.parse(signedupdate, dateFormatter);
        LocalDate todaydate = LocalDate.parse(currentdate, dateFormatter);
        if (signeddate.compareTo(todaydate) > 0)
            System.out.println("No Range");
        LocalDate anniversary = LocalDate.of(todaydate.getYear(), signeddate.getMonth(), signeddate.getDayOfMonth());
        LocalDate first = anniversary.minusDays(30);
        LocalDate last = anniversary.plusDays(30);
        if (todaydate.isBefore(last)) {
            last = todaydate;
        }
        System.out.println();
        System.out.println(formatdate(first) + " " + formatdate(last));
    }
    public static String formatdate(LocalDate date)
    {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}
