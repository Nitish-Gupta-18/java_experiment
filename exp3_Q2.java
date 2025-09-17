import java.util.Scanner;

class search_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nitish gupta , 24csu330");
        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the element you want to find:");
        int key = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element is found.");
                return;
                
               
            }
        }

        System.out.println("Element not found.");
       
    }
}
