package string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstrigwithKRepeatingCharacters {
	public static int longestSubstring(String s, int k) {
		if(s.length()==0||s.length()<k) return 0;
		int[] map = new int[26];
		for(char c:s.toCharArray()) map[c-'a']++;
		boolean valid = true;
		for(int i=0;i<26;i++) if(map[i]>0&&map[i]<k) {
			valid=false;
			break;
		}
		if(valid) return s.length();
		int res=0,start=0,idx=0;
		while(idx<s.length()) {
			if(map[s.charAt(idx)]<k) {
				res = Math.max(res, longestSubstring(s.substring(start,idx),k));
				start = idx+1;	
			}
			idx++;
		}
		res = Math.max(res, longestSubstring(s.substring(start),k));
		return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestSubstring("ababacb", 3));

	}

}
