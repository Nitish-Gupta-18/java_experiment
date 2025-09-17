import java.util.Scanner;

class remove_dupl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nitish Gupta , 24csu330");
        System.out.print("Provide size of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        boolean[] visited = new boolean[size];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

       
        System.out.println("\nFrequencies:");
        for (int i = 0; i < size; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }

        
        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < size; i++) {
            if (!visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}