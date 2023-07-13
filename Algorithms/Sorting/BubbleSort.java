// Time Complexity = O(N^2) in Worst case
// Time Complexity = O(N) in Best case
//Space Complexity =O(1) coz of one extra space used by temp

package Algorithms;

import java.util.Arrays;

public class BubbleSort{

    public static void bubbleSort(int arr[]){
        // arr[]={12,27,19,-5,53,0,35,9}
        boolean flag =false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                    flag =true;
                }
            }
            if(!flag || flag == false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={12,27,19,-5,53,0,35,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}