// Time Complexity = O(N^2) in Worst case
// Time Complexity = O(N) in Best case
//Space Complexity =O(1) coz of one extra space used by curr

package Algorithms;

import java.util.Arrays;

public class InsertionSort {
        public static void insertionSort(int arr[]){
            for(int i=1;i<arr.length;i++){
                int curr =arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>curr){
                  arr[j+1]=arr[j];
                  j--;
                }
                arr[j+1]=curr;
            }
            System.out.println(Arrays.toString(arr));
        }
        public static void main(String[] args) {
            int arr[]={18,9,-5,0,54,43,27};
            insertionSort(arr);
        }
}
