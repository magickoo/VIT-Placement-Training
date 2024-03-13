import java.io.*;
class GFG {
	static void Solve(char str[], int pos,int n, int open, int close)
	{
		if (pos ==2*n) {
			for (int i = 0; i < str.length; i++)
				System.out.print(str[i]);
			System.out.println();
			return;
		}
		else {
			if (open > close) {
				str[pos] = '}';
				Solve(str, pos + 1, n, open, close + 1);
			}
			if (open < n) {
				str[pos] = '{';
				Solve(str, pos + 1, n, open + 1, close);
			}
		}
	}
	public static void main(String[] args)
	{
		int n = 3;
		char[] str = new char[2 * n];
		Solve(str,0, n,0,0);
	}
}

