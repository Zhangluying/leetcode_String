package string;

public class ReverseVowels {
	public String reverseVowels(String s) {
		String vol = "aeiouAEIOU";
     	int start = 0;
		int end = s.length()-1;
		char[] cArray =s.toCharArray();
	
		while(start<end) {
			while(start<end&&!vol.contains(String.valueOf(cArray[start]))){
				start++;	
			}
			while(start<end&&!vol.contains(String.valueOf(cArray[end]))) {
				end--;
			}
			char tmp = cArray[start];
			cArray[start] = cArray[end];
			cArray[end] = tmp;
			start++;
			end--;
		}
		return new String(cArray);   
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
