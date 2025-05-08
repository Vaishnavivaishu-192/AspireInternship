Day 1

Problem 1:
// Java program for implementation of Selection Sort
import java.util.Arrays;

class GfG {

    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
          
            // Assume the current position holds
            // the minimum element
            int min_idx = i;

            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                  
                    // Update min_idx if a smaller element
                    // is found
                    min_idx = j;
                }
            }

            // Move minimum element to its
            // correct position
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;           
        }
    }

    static void printArray(int[] arr){
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
  
    public static void main(String[] args){
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }
}

OUTPUT:
Original array: 64 25 12 22 11 
Sorted array: 11 12 22 25 64 

Problem 2:
Sort the given array in descending order using Selection Sort.

public class SelectionSortDescending {
    public static void main(String[] args) {
        int[] arr = {12, 7, 25, 3, 18};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            // Find the maximum in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the found maximum with the first element of the unsorted part
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

OUTPUT:

25 18 12 7 3 

Problem 3:
Problem:
Find the 3rd smallest element in the array using Selection Sort.

public class KthSmallestSelectionSort {
    public static void main(String[] args) {
        int[] arr = {50, 10, 60, 30, 20};
        int k = 3;  // Find 3rd smallest

        int n = arr.length;

        // Perform selection sort up to the k-th smallest
        for (int i = 0; i < k; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum with the element at index i
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Print the k-th smallest element
        System.out.println(k + "rd smallest element = " + arr[k - 1]);
    }
}

OUTPUT:
3rd smallest element = 30

Problem 4:
Sort the array and count the number of swaps made during Selection Sort.

public class SelectionSortCountSwaps {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        int n = arr.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap if a smaller element was found
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swapCount++;
            }
        }

        // Output the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Output the number of swaps
        System.out.println("\nTotal swaps: " + swapCount);
    }
}

OUTPUT:
Sorted array: 1 2 3  
Total swaps: 2

Problem 5:
Sort only the even numbers in the array using Selection Sort. Keep odd numbers in the same position.

import java.util.ArrayList;

public class SortEvenNumbersOnly {
    public static void main(String[] args) {
        int[] arr = {7, 4, 6, 3, 2};

        // Step 1: Extract even numbers and their indices
        ArrayList<Integer> evenIndices = new ArrayList<>();
        ArrayList<Integer> evenValues = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenIndices.add(i);
                evenValues.add(arr[i]);
            }
        }

        // Step 2: Selection sort on evenValues
        for (int i = 0; i < evenValues.size() - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < evenValues.size(); j++) {
                if (evenValues.get(j) < evenValues.get(minIdx)) {
                    minIdx = j;
                }
            }
            // Swap values
            int temp = evenValues.get(i);
            evenValues.set(i, evenValues.get(minIdx));
            evenValues.set(minIdx, temp);
        }

        // Step 3: Place sorted even numbers back
        for (int i = 0; i < evenIndices.size(); i++) {
            arr[evenIndices.get(i)] = evenValues.get(i);
        }

        // Output the result
        System.out.print("Output: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


Output:
 7 2 4 3 6


