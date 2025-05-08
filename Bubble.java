Day2
Problem 1:
Sort the array using Bubble Sort in ascending order.

public class BubbleSortAscending {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Output the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

OUTPUT:
11 12 22 25 34 64 90

Problem 2:
Sort the array in descending order using Bubble Sort.


 public class BubbleSortDescending {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        int n = arr.length;

        // Bubble Sort in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Output the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

OUTPUT:
9 7 4 3 1


Problem 3:
Sort the array using Bubble Sort and print the 2nd largest element.

public class SecondLargestWithBubbleSort {
    public static void main(String[] args) {
        int[] arr = {45, 67, 89, 23, 77};
        int n = arr.length;

        // Bubble Sort (ascending)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array (optional)
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Print 2nd largest element
        System.out.println("\n2nd largest element = " + arr[n - 2]);
    }
}


OUTPUT:
Sorted Array: 23 45 67 77 89  
2nd largest element = 77


Problem 4:
Sort the array and count how many swaps were made in total.

public class BubbleSortSwapCounter {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        int n = arr.length;
        int totalSwaps = 0;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    totalSwaps++;
                }
            }
        }

        // Output sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Output total swaps
        System.out.println("\nTotal swaps: " + totalSwaps);
    }
}

OUTPUT:
Sorted array: 1 2 3  
Total swaps: 3

Problem 5:
Implement Bubble Sort with a flag and print which pass stopped sorting.

public class BubbleSortEarlyStop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Perform a pass
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Check if any swap happened
            if (!swapped) {
                System.out.println("Array is already sorted at pass " + (i + 1));
                break;
            }
        }

        // Output sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

OUTPUT:
Array is already sorted at pass 1  
Sorted array: 1 2 3 4 5







