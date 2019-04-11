package string;

public class PalindromePartitioning2 {
	public int minCut(String s) {
		char[] c = s.toCharArray();
		int n = s.length();
		boolean pal[][] = new boolean[n][n];
		int[] cut = new int[n];
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=0;j<=i;j++) {
				if(c[j]==c[i]&&(j+1>i-1||pal[j+1][i-1])) {
					pal[j][i]=true;
					min=j==0?0:Math.min(min, cut[j-1]+1);
				}
			}
			cut[i] =min;
		}
		return cut[n-1];
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
