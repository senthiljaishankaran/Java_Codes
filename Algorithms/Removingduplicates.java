package Algorithms;

import java.util.Arrays;

public class Removingduplicates {
    public static void sorting(int arr[]){
        boolean flag =false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp =arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    flag =true;
                }
            }
            if(!flag || flag==false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5,5,6,7};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
        //removing duplicates
        int p,q,freq;
        for(p=0;p<arr.length;p++){
            freq =1;
            for(q=0+p;q<arr.length;q++){
                if(arr[p]==arr[q]){
                    freq++;
                }
                else {
                break;
                }
            } 
            p=q-1;
       if(freq>1){
        System.out.println(arr[p]);
        }  
       }
    }
}
