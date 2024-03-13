/*
  Rat in Maze: 
    Consider a nXm matrix, print all the possible 
solution for a rat to reach the destination
(n-1,m-1). 
 Initially the rat is placed at (0,0).
 The rat can move either forward or downwards.
*/ 

import java.util.*;
public class Main 
{    
    public static void print(int[][] mat,int n,int m)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public static void solve(int[][] mat,int n,int m,int r,int c)
    {
        if(r==n-1&&c==m-1)
        {  
            mat[r][c]=1;
            print(mat,n,m);
            System.out.print("\n");
        }
        else 
        {
            if(c+1<m) //forward
            {
                mat[r][c]=1;
                solve(mat,n,m,r,c+1);
            }
            if(r+1<n) //downwards
            {
                mat[r][c]=1;
                solve(mat,n,m,r+1,c);
            }
            mat[r][c]=0;
        }
    }
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int m=sc.nextInt();
     int[][] mat=new int[n][m];
     mat[0][0]=1; //initial position 
     solve(mat,n,m,0,0);
  }
}
