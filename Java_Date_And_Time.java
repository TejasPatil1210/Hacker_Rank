/*

The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. Your task is to find what the day is on that date.

Input Format
A single line of input containing the space separated month, day and year, respectively, in   format.

Constraints

Output Format
Output the correct day in capital letters.

Sample Input
08 05 2015

Sample Output
WEDNESDAY

Explanation
The day on August th  was WEDNESDAY.

*/


import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

class Result {

    public static String findDay(int month, int day, int year) {  
    String s=String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year);
    String dayString="";
    try{
    Date d=new SimpleDateFormat("dd/MM/yyyy").parse(s);
    Calendar c=Calendar.getInstance();
    c.setTime(d);
    int dayInt=c.get(Calendar.DAY_OF_WEEK);
    switch(dayInt)
    {
            case 1:dayString="SUNDAY";break;
            case 2:dayString="MONDAY";break;
            case 3:dayString="TUESDAY";break;
            case 4:dayString="WEDNESDAY";break;
            case 5:dayString="THURSDAY";break;
            case 6:dayString="FRIDAY";break;
            case 7:dayString="SATURDAY";break;
    }
    }
    catch(Exception e)
    {
        dayString="Not Possible";
    }
    return dayString;
}
}
    class Solution{
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);        
	System.out.println("Enter Month:");
	int month = scan.nextInt();
	System.out.println("Enter Day:");
        int day = scan.nextInt();
	System.out.println("Enter Year:");
        int year = scan.nextInt();

        String res = Result.findDay(month, day, year);
	System.out.println(res);

    }
}
 