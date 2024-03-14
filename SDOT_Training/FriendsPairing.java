https://www.geeksforgeeks.org/friends-pairing-problem/
import java.util.*;
public class Main{
    public static int PairCount(int n){
        int dp[]= new int[n+1];
        for(int i=0;i<=n;i++){
            if(i<=2){
                dp[i]=i;
            }
            else{
                dp[i] = dp[i-1] + (i-1)*dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ans= PairCount(n);
        System.out.println(ans);
    }
}
