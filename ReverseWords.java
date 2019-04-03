package string;

public class ReverseWords {
	public static String reverseWords(String s) {
		String[] strs = s.trim().split(" ");
		String res="";
		for(int i=strs.length-1;i>=0;i--) {
			if(strs[i].length()>0) {
				res+=strs[i]+" ";
			}
		}
	    return res.trim();   
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("a good   example"));
	}

}
