package Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        if(arr.length==1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i=0;i<arr.length;i++){
            //int arr[]={17,5,-7,0,44,27};
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min =j;
                }
            }
            int lowest= arr[min];
            arr[min]=arr[i];
            arr[i] =lowest;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={17,5,-7,0,44,27};
        selectionSort(arr);
    }
}
