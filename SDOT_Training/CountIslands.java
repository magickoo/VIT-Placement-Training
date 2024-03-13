/*
 Count Islands.
  Consider a nXm 2D binary grid,where 1 represents 
 land and 0 represents water. Count the Number of 
 Island. 
 
  An Island is surrounded by water and is formed by 
 connecting the adjacent lands either horizontally 
 or vertically. 
 You may assume all the four edges of the matrix are 
 surrounded by water.
*/ 

import java.util.*;
public class Main 
{   
    public static void countIsland(int[][] mat,int n,int m,int i,int j)
    {
        if(i==-1||i==n||j==-1||j==m||mat[i][j]!=1)
        {
            return;
        }
        else 
        {
            mat[i][j]=2; //visited 
            countIsland(mat,n,m,i-1,j);//top 
            countIsland(mat,n,m,i,j+1);//right
            countIsland(mat,n,m,i,j-1); //left
            countIsland(mat,n,m,i+1,j);//down 
            
        }
    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int[][] mat=new int[n][m];
       int i,j,c=0;
       for(i=0;i<n;i++)
       {
           for(j=0;j<m;j++)
           {
              mat[i][j]=sc.nextInt(); 
           }
       }
        for(i=0;i<n;i++)
       {
           for(j=0;j<m;j++)
           {
              if(mat[i][j]==1)
               {
                   countIsland(mat,n,m,i,j);
                   c=c+1;
               }
           }
       }
       System.out.print(c);
    }
}






















