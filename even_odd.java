import java.util.Scanner;

class even_odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       System.out.println(" nitish gupta , 24csu330");

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int even = 0;
        int odd = 0;

       
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        System.out.print("Even Elements: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                even++;
            }
        }
        System.out.println(); 

        
        System.out.print("Odd Elements: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                odd++;
            }
        }
        System.out.println();

        
        System.out.println("Total even numbers: " + even);
        System.out.println("Total odd numbers: " + odd);
    }
}