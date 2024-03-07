//https://prepinsta.com/cocubes-coding-question-8/

import java.util.Scanner;
import java.util.*;
public class q6ToPalindrome {
    public static char[] append(String s){
        int n=s.length();
        int j=n-1;
        int count=0;
        for(int i=0;i<n;i++){
        while(s.charAt(i)!=s.charAt(j)){
            i++;
            count++;
        }
        j--;
    }
    StringBuffer str = new StringBuffer(s.substring(0,count));
    String st= str.toString();
    char[] pali=st.toCharArray();
    return pali;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        char [] ch= append(str);
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
//input: abcdc
output: ba
