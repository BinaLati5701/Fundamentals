package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Basic {

    public Integer printAllNumbers( int num){
        for(int i=1; i<num; i++){
            System.out.println(i);
        }
        return num;
    }

    public Integer printOddNumbers(int num){
        for(int i=0; i<num; i++){
            if(i % 2 !=0){
                System.out.println(i);
            }
        }
        return  num;
    }
    public Integer printSum(int num){
       int sum = 0;
       for(int i = 0; i< num; i++){
           sum+= i;
           System.out.println("New number: " + i  + " Sum is: " + sum);
       }
       return sum;

    }
    public void iterateArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    public Integer findMax(int[] arr){
       int maximum = arr[0];
       for(int i=0; i< arr.length; i++){
           if(maximum < arr[i]){
               maximum = arr[i];
           }
       }
       return maximum;
    }
    public void getAverage(int[]arr){
        int sum = 0;
        for(int i=0; i < arr.length; i++){
            sum += arr[i];

        }
        int average = sum/ arr.length;
        System.out.println(average);
    }

    public void oddNumbersArray(){
       List<Integer> y = new ArrayList();
       for(int i=1; i < 255; i++){
           if(i % 2 !=0){
            y.add(i);
           }
       }
        System.out.println(y);
    }

    public Integer greaterThanValue(int[] arr, int y){
        int count = 0;

        for(int i=0; i< arr.length; i++){
            if(y < arr[i]){
               count += 1;
            }
        }
        return count;
    }

    public void squareValues(int[]arr){
        for(int i=0; i<arr.length; i++){
            arr[i] *= arr[i];
            System.out.println(arr[i]);
        }
    }
    public void eliminateNegativeNumbers(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] =0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public void minMaxAvg(int[] arr){
        int sum = 0;
        int min = 0;
        int max = 0;


        for(int i=0; i < arr.length; ++i){
            sum += arr[i];
            if(max < arr[i]){
                max = arr[i];

            }
            if(min > arr[i]){
                min = arr[i];

            }

        }
        int avg = sum/ arr.length;
//        System.out.println(min);
//        System.out.println(max);
//        System.out.println(avg);

        List<Integer> array = new ArrayList<>();
        array.add(max);
        array.add(min);
        array.add(avg);
        System.out.println(array);
    }

    public void shiftingValues (int[] arr){
        //n number of times array should be rotated
        int n = 1;
        for(int i=0; i< arr.length; i++){
           //original array
            System.out.println(arr[i]);
        }
        //shifting values to the left
        for(int i=0; i<n; i++){
            int j, first;
            //storing first element of array
            first = arr[0];
            for(j =0; j<arr.length-1; j++){
                //shifting value by one
                arr[j] = arr[j+1];
            }
            // adding first value to the end
            arr[j] =  first;
        }
        System.out.println();
        System.out.println("Array after shift");

        //results after shift
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }



    }
}
