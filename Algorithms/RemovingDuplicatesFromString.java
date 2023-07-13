package Algorithms;

public class RemovingDuplicatesFromString {

    public static void removeduplicates(char s[],int n){
        String nodup= " ";
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                if(s[i]==s[j]){
                    break;
                }
            }
            if(j==i){
                nodup+=s[i];
            }
        }
        System.out.println(nodup);
    }
    public static void main(String[] args) {
        char s[]="aaabaababbccbccd".toCharArray();
        int n=s.length;
        removeduplicates(s, n);
        }
    }
