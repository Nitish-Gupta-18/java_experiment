import java.util.Scanner;
class reverse{
	public static void main(String[] args)
	{
	 int num;
	   int reversed=0;
	  System.out.println("i am Nitish,24csu330");
	  System.out.println("provide number");

	  Scanner sc=new Scanner(System.in);
	  num=sc.nextInt();
	 

	  while(num!=0){

	   int digit=num%10;
	   reversed=(reversed*10)+digit;
	   num=num/10;


	  }
	  System.out.println("reversed is "+reversed);



	}
}
