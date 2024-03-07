import java.util.*;
import java.lang.*;

public class q5binary {

    public static int OperationsBinary(char[] str){
        int len=str.length;
        int ans=str[0] -'0';
        for(int i=1;i<len;i++){
            if(str[i]=='A'){
                ans= ans &(str[i+1]-'0');
            }
            else if(str[i]=='B'){
                ans= ans |(str[i+1]-'0');
            }
            else if(str[i]=='C'){
                ans= ans ^(str[i+1]-'0');
            }

        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        char[] str= s.toCharArray();
        System.out.println(OperationsBinary(str));
    }
}
Input: 1C0C1C1A0B1
Output: 1
