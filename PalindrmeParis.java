package string;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PalindrmeParis {
	public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> results = new LinkedList<>();
        for(int i=0; i< words.length; i++){
            for(int j=0; j< words.length; j++){
                if(i!=j){
                    if(isPalindrome(words[i], words[j])){
                        results.add(Arrays.asList(i, j));
                    }
                }
            }
        }
        return results;
    }
    
    private boolean isPalindrome(String a, String b){
        int size = a.length() + b.length();
        for(int i=0;i<size/2; i++){
            char first = i<a.length() ? a.charAt(i): b.charAt(i-a.length());
            int pos = size - 1 - i;
            char second = pos > a.length()-1 ? b.charAt(b.length() - 1 - i) : a.charAt(pos);
            if(first != second) return false;
        }
        return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
