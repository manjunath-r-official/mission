import java.util.*;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        System.out.println(Arrays.toString(sort(arr)));
        
    }

    public static int[] sort(int[] arr){

        boolean swapped;

        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j = 1; j<arr.length-i; j++){

                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
        return arr;

    }
}
