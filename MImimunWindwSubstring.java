package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MImimunWindwSubstring {
	public String minWindow(String s, String t) {
		if(s.length()==0||s.length()<t.length()) return "";
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		for(char c:t.toCharArray()) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}else {
				m.put(c, 1);
			}
		}

		int left=0;
		int minleft=0;
		int minlen=s.length()+1;
		int count=0;
		for(int right=0;right<s.length();right++) {
			if(m.containsKey(s.charAt(right))){
				m.put(s.charAt(right), m.get(s.charAt(right))-1);
				if(m.get(s.charAt(right))>=0) {
					count++;
				}
				while(count==t.length()) {
					if(right-left+1<minlen) {
						minleft=left;
						minlen=right-left+1;
					}
					if(m.containsKey(s.charAt(left))) {
						m.put(s.charAt(left),m.get(s.charAt(left))+1);
						if(m.get(s.charAt(left))>0) {
							count--;
						}
					}
					left++;
				}
			}
		}
		if(minlen>s.length()) return "";
		
		return s.substring(minleft, minleft+minlen);
		
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
