package com.company;
import java.util.*;
// Container with maximum water O(n*n)
public class Problem2 {
    public static void main(String []args){

        // Container with maximum water O(N*N)
        int n;
        int result = 0;
        System.out.println("Enter length of the array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] arr = new int[n];
        for(int p=0; p<n; p++) arr[p] = sc.nextInt();
        /*
        for(int j=0; j<n; j++){
            for(int k=n-1; k>=0; k--){
                 result = Math.max(result, Math.abs(k-j) * Math.min(arr[j],arr[k]));
            }
        }
        System.out.println("Maximum Area is: "+ result);*/

        // O(N) solution, 2 pointer technique
        int p=0;
        int q=n-1;
        while(p < n && q >= 0){
            result = Math.max(result, Math.abs(q-p) * Math.min(arr[p],arr[q]));
            if(arr[p] < arr[q]) p++;
            else q--;
        }
        System.out.println("Maximum Area is: "+ result);
    }
}
