/*
Backtracking: 

Given N value, create N X N matrix, Place each 
queen in each row, so that no queen must cross 
each other. 

Print all the possible solutions for tha given N. 

N=4 
*/ 

import java.util.*;
public class Main 
{   
    public static void print(int[][] mat,int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(mat[i][j]==1)
                 System.out.print("Q ");
                else 
                 System.out.print("- ");
            }
            System.out.print("\n");
        }
    }
    public static int safe(int[][] mat,int n,int r,int c)
    {   
        int i,j;
        for(i=r;i>=0;i--)  //top 
        {
            if(mat[i][c]==1)
              return 0;
        }
        for(i=r,j=c;i>=0&&j<n;i--,j++) //right
        {
            if(mat[i][j]==1)
              return 0;
        }
        for(i=r,j=c;i>=0&&j>=0;i--,j--)
        {
            if(mat[i][j]==1)
              return 0;
        }
        return 1;
    }
    public static void queen(int[][] mat,int n,int row)
    {   
        int col;
        if(row==n) //base condition //0==4
        {
          print(mat,n);
          System.out.print("\n");
        }
        else 
        {
            for(col=0;col<n;col++)
            {
                if(safe(mat,n,row,col)==1)
                {
                    mat[row][col]=1;
                    queen(mat,n,row+1);
                    mat[row][col]=0;//backtracking
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mat=new int[n][n];
        queen(mat,n,0); 
    }
}
