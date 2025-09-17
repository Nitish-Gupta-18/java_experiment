import java.util.Scanner;
class sumof_N{
	public static void main(String[] args)

	{ int num;
	int sum=0;
	System.out.println("i am Nitish,24csu330");
	  System.out.println("provide number");
	  Scanner sc=new Scanner(System.in);
	  num=sc.nextInt();
	  while(num!=0){
	  	int value=num%10;
	  	sum=sum+value;
	  	num=num/10;
	  }
	  System.out.println("Sum is: "+sum);




	}
}