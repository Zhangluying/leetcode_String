package string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		Map<Character,Character> m = new HashMap<Character,Character>();
		m.put(')', '(');
		m.put(']', '[');
		m.put('}', '{');
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			if(m.containsKey(s.charAt(i))) {
				if(stack.isEmpty()||stack.peek()!=m.get(s.charAt(i))) {
					return false;
				}else {
					stack.pop();
				}
			}else {
				stack.add(s.charAt(i));
			}
		}
	    if(stack.size()>0) {
	    	return false;
	    }else {
	    	return true;
	    }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
