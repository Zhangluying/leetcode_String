package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestNumber {
	public String largestNumber(int[] nums) {
		if(nums.length==0) return "";
		String[] strs = new String[nums.length];
		for(int i=0;i<nums.length;i++) {
			strs[i] = String.valueOf(nums[i]);
		}
	    Arrays.sort(strs, new Comparator<String>() {
	    	@Override
		    public int compare(String str1, String str2){
		        String s1 = str1 + str2;
		        String s2 = str2 + str1;
		        return s2.compareTo(s1); 
		    }
	    	
	    }); 
	    
	    if(strs[0].charAt(0)=='0') return "0";
	    StringBuilder sb = new StringBuilder();
	    for(String s:strs) {
	    	sb.append(s);
	    }
	    return sb.toString();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
