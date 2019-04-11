package string;

import java.util.Stack;

public class LongestValidParentheses {
	public static int longestValidParentheses(String s) {
		int res=0;
		Stack<Integer> stack = new Stack<Integer>();	
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') stack.push(i);
			else {
				if(stack.isEmpty()) {
					stack.push(i);
				}else {
					if(s.charAt(stack.peek())=='(') stack.pop();
					else stack.push(i);
				}
			}
		}
		if(stack.isEmpty()) return s.length();
		else {
			int a=s.length();
			int b;
			while(!stack.isEmpty()) {
				b=stack.pop();
				res=Math.max(res, a-b-1);
				a=b;
			}
			res=Math.max(res, a);

		}
		return res;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestValidParentheses("(()");

	}

}
