import java.util.*;

public class Selectionsort {


    public static void main(String[] args) {
        int arr[] = {2,3,4,5,1};

    selection(arr);

    System.out.print(Arrays.toString(arr));

    }



    static void selection(int[] arr){

        for(int i=0; i<arr.length; i++){

            int start = 0;
            int end = arr.length-i-1;

            int maxInd = findMax(arr, start, end);

            swap(arr, maxInd, end);

        }
    }


    static int findMax(int arr[], int start, int last ){

        int max = start;

        for(int i = 0; i<=last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }


    static void swap(int[] arr, int first, int last){
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;

    }
    
}
