package com.sandeep.DayThree;

import java.util.Arrays;

public class AllArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initial array
        int[] arr = {10, 20, 30, 40, 50};

        // Accessing elements
        System.out.println("Accessing elements:");
        accessElements(arr);

        // Inserting an element at a specific index
        arr = insertElement(arr, 2, 25);  // Insert 25 at index 2
        System.out.println("\nArray after insertion:");
        printArray(arr);

        // Deleting an element at a specific index
        arr = deleteElement(arr, 3);  // Delete element at index 3
        System.out.println("\nArray after deletion:");
        printArray(arr);

        // Updating an element at a specific index
        updateElement(arr, 1, 35);  // Update element at index 1 to 35
        System.out.println("\nArray after update:");
        printArray(arr);

        // Reversing the array
        reverseArray(arr);
        System.out.println("\nArray after reverse:");
        printArray(arr);

        // Slicing the array (getting a sub-array)
        int[] slicedArray = sliceArray(arr, 1, 4);  // Slice from index 1 to 3
        System.out.println("\nSliced array:");
        printArray(slicedArray);
    }

    // Accessing elements in the array
    public static void accessElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }

    // Inserting an element at a specific index
    public static int[] insertElement(int[] arr, int index, int element) {
        if (index < 0 || index > arr.length) {
            System.out.println("Index out of bounds");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        newArr[index] = element;
        System.arraycopy(arr, index, newArr, index + 1, arr.length - index);
        return newArr;
    }

    // Deleting an element at a specific index
    public static int[] deleteElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Index out of bounds");
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(arr, index + 1, newArr, index, arr.length - index - 1);
        return newArr;
    }

    // Updating an element at a specific index
    public static void updateElement(int[] arr, int index, int newValue) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Index out of bounds");
        } else {
            arr[index] = newValue;
        }
    }

    // Reversing the array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Slicing the array (getting a sub-array)
    public static int[] sliceArray(int[] arr, int start, int end) {
        if (start < 0 || end > arr.length || start >= end) {
            System.out.println("Invalid range");
            return new int[0];
        }
        return Arrays.copyOfRange(arr, start, end);
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
	}


