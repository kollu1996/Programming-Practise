package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        System.out.println(str);
        int n = str.length();
        int maxLen = 0;
        boolean[][] dp = new boolean[n][n];
        // Logic to find all single length palindromes
        for(int p=0; p< str.length(); p++){
            dp[p][p] = true;
            maxLen = 1;
        }
        // Logic to find all 2 length palindromic String
        int start = 0;
        for(int q=0; q< str.length()-1; q++){
            if(str.charAt(q) == str.charAt(q+1)){
                dp[q][q+1]=true;
                maxLen = 2;
                start = q;
            }
        }
        // Logic to find all palindromic substrings greater
        //  than 2
        for(int k=3; k<=n; k++){
            for(int s=0; s<n-k+1; s++){
                int j = s+k-1;
                if(str.charAt(s) == str.charAt(j) && dp[s+1][j-1]){
                    dp[s][j] = true;

                    if(k > maxLen){
                        start = s;
                        maxLen=k;
                    }
                }
            }
        }
        System.out.println("Longest Palindromic substring is:  "  );
        System.out.println(start);
        System.out.println(maxLen);
        System.out.println(str.substring(start, start+maxLen));
    }

}
