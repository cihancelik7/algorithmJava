package algorithmQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
Delete an element from an array
 */
public class question21 {

    public static void main(String[] args) {

        // Create an array from which we need to remove the element
        int [] originalArray = {1,2,3,4,5};

        //Create an variable that holds value which we need to remove
        int elementToRemove = 3;
        int [] newArray = remove(originalArray,elementToRemove);
        System.out.println("Original Array= "+ Arrays.toString(originalArray));
        System.out.println("Element To Remove= "+ Arrays.toString(newArray));


    }


    public static int[] remove(int[] array,int element){
        int[] newArray = new int[array.length-1];
        int index = 0;
        for (int i=0;i<array.length;i++){
            if (array[i]!=element){
                newArray[index]=array[i];
                index++;
            }
        }
        return newArray;
    }

}
