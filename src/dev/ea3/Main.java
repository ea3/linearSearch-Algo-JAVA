package dev.ea3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int [] intArray = { 20, 35, -15, 7, 55, 1, -22};
        System.out.println("Original Array: " + Arrays.toString(intArray));

        System.out.println("Element is at index( -1 if it was not found): " +linearSearch(intArray, -15));
        System.out.println("Element is at index( -1 if it was not found): " +linearSearch(intArray, -1225));
        System.out.println("Element is at index( -1 if it was not found): " +linearSearch(intArray, 20));
        System.out.println("Element is at index( -1 if it was not found): " +linearSearch(intArray, 55));

    }

    public static int linearSearch(int [] input, int value){
        for(int i = 0; i < input.length; i++){
            if(input[i] == value){
                return i;
            }
        }
        return -1;
    }
}
