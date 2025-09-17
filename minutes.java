import java.util.Scanner;
class minutes {
	public static void main(String[]args){ 
	long min;
	long years;
	long month;
	long days;

	System.out.println("i am Nitish,24csu330");
	System.out.println("provide minutes");
	Scanner sc=new Scanner(System.in);
	min=sc.nextInt();

	long min_year =  60*24*365;
	years = min/ min_year ;
	min= min% min_year ;

   long min_month =  60*24*30;
	month = min/min_month;
	min=min%min_month;


	long min_days =  60*24;
	days=min/min_days;
	min=min%min_days;

	System.out.println("the output is ");
	System.out.print(years+"years ");
	System.out.print(month+"month ");
	System.out.print(days+"days ");






	}
}