import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element you want to search for: ");
        int searchElement = scanner.nextInt();
        boolean found = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("Element " + searchElement + " found at index: " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
        scanner.close();
    }
}
