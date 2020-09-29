import java.util.Scanner;
import java.util.Arrays;

public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int largest,secondLargest;
        if(arr[0] > arr[1]) {
            largest = arr[0];
            secondLargest = arr[1];
            }
        else {
            largest = arr[1];
            secondLargest = arr[0];
        }
        for(int i = 2; i < arr.length; i++) {
            if((arr[i] <= largest) && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
        }
        return secondLargest;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        int x = arr[1] / arr[0];
        for (int i = -1; i < arr.length; i++) {
            if (arr[i+1] / arr[i] != x) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.print("Amount in Array: ");
        int n_1 = scan.nextInt();
        int arr_1[] = new int[n_1];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n_1; i++){
            arr_1[i] = scan.nextInt();
        }
        System.out.println(reverse(arr_1));
        System.out.print("Amount in Array: ");
        int n_2 = scan.nextInt();
        int arr_2[] = new int[n_2];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n_2; i++){
            arr_2[i] = scan.nextInt();
        }
        System.out.println(secondLargest(arr_2));
        System.out.print("Amount in Array: ");
        int n_3 = scan.nextInt();
        int arr_3[] = new int[n_3];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n_3; i++){
            arr_3[i] = scan.nextInt();
        }
        System.out.println(isGeometric(arr_3));
		
    }
}
