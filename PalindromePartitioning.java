package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePartitioning {
	public List<List<String>> partition(String s) {
		List<List<String>> res = new ArrayList<List<String>>();
		List<String> list = new ArrayList<String>();
		partitionHelper(res,list,s,0);
		return res;    
	    }
	

	private void partitionHelper(List<List<String>> res, List<String> list, String s, int pos) {
		if(pos==s.length()) {
			res.add(new ArrayList(list));
			return;
		}
		for(int i=pos;i<s.length();i++) {
			if(!isPanlindrome(s,pos,i)) {
				continue;	
			}
			list.add(s.substring(pos, i+1));
			partitionHelper(res,list,s,i+1);
			list.remove(list.size()-1);
		}
		
	}


	private boolean isPanlindrome(String s, int start, int end) {
		while(start<end&&s.charAt(start)==s.charAt(end)) {
			start++;
			end--;
		}
		return start>=end;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
