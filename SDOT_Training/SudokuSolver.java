import java.util.*;
public class Main
{
    public static void Solve(int mat[][],int r,int c){
        //base case:
        if(r==8 && c == 9 ){
            print(mat);
        }
        else{
            if(c==9){
                r++;
                c=0;
            }
            if(mat[r][c]==0){
                for(int d=1;d<=9;d++){
                    if(safe(mat,r,c,d)==1){
                        mat[r][c]=d;
                        Solve(mat,r,c+1);
                        mat[r][c]=0; // backtracking
                    }
                    else{
                        Solve(mat,r,c+1);
                    }
                }
            }
        }
        
    }
        
        
            
        
        public static int safe(int [][] mat,int r,int c,int d){
            // check row wise
            for(int i=0;i<=8;i++){
                if(mat[r][i] == d){
                    return 0;
                }
            }
            //check column wise
            for(int i=0;i<=8;i++){
                if(mat[i][c]==d){
                    return 0;
                }
            }
            int x= (r/3)*3;
            int y= (c/3)*3;
            for(int i=x ; i<=x+2 ; i++){
                for(int j=y;j<=y+2;j++){
                    if(mat[i][j] == d){
                        return 0;
                    }
                    else{
                        return 1;
                    }
                }
            }
            return 0;
        }
        
    public static void print(int[][] mat){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int mat[][] = new int[9][9];
		//for(int i=0;i<9;i++){
		    //for(int j=0;j<9;j++){
		      //  mat[i][j] = sc.nextInt();
		    //}
	//	}
	int mat[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                         { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                         { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                         { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                         { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                         { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                         { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                         { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                         { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		Solve(mat,0,0);
		print(mat);
		
	}
}
