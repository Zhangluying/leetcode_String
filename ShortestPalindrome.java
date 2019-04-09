package string;

public class ShortestPalindrome {
	public String shortestPalindrome(String s) {
		for(int i=s.length()-1;i>=0;i--) {
			if(isPalindrome(s,0,i)) {
				if(i==s.length()-1) break;
				return new StringBuilder(s.substring(i+1)).reverse().append(s).toString();
			}
		}
		return s;
		
	}
	private boolean isPalindrome(String s, int l, int r) {
		while(s.charAt(l)==s.charAt(r)&&l<r) {
			l++;
			r--;
		}
		return l>=r;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
