package string;

public class ExcelSheetColumn {
	public String convertToTitle(int n) {
		String res = "";
		while(n>0) {
			n--;
			res=(char)('A'+(n%26))+res;
			n/=26;
		}
		return res;	
	}
	
	public int titleToNumber(String s) {
		int res=0;
		for(int i=0;i<s.length();i++) {
			res = res*26+ s.charAt(i) - 'a';
			
		}
	    return res;    
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
