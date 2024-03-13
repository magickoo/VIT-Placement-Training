import java.util.*;
public class Main
{
    public static void fun(int n){
        if(n==1){
            System.out.println(n);
        }
        else{
            fun(n-1);
            System.out.printlan(n);
            fun(n-1);
        }
    }
	public static void main(String[] args) {
		fun(4);
	}
}
