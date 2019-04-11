package string;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {	
	public List<String> generateParenthesis(int n) {
		List<String> l = new ArrayList<String>();
		addParenthesis(l,"",0,0,n);
	    return l;    
	    }

	private void addParenthesis(List<String> l,String str,int open,int close,int n) {
		if(str.length()==2*n) {
			l.add(str);
			return;
		}
		if(open<n) {
			addParenthesis(l,str+"(",open+1,close,n);
		}
		if(close<open) {
			addParenthesis(l,str+")",open,close+1,n);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
