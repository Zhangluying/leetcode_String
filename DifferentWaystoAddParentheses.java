package string;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaystoAddParentheses {
	public List<Integer> diffWaysToCompute(String input) {
		List<Integer> res = new ArrayList<Integer>();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='+'||
			   input.charAt(i)=='-'||
			   input.charAt(i)=='*') {
				String p1 = input.substring(0, i);
				String p2 = input.substring(i+1);
				List<Integer> l1=diffWaysToCompute(p1);
				List<Integer> l2=diffWaysToCompute(p2);
				for(Integer i1:l1) {
					for(Integer i2:l2) {
						int c;
						if(input.charAt(i)=='+') {
							c=i1+i2;
						}else if(input.charAt(i)=='-') {
							c=i1-i2;
						}else {
							c=i1*i2;
						}
						res.add(c);
					}
				}
			}
		}
	    if(res.isEmpty()) res.add(Integer.parseInt(input));  
	    return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
