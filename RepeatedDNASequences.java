package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {
	public List<String> findRepeatedDnaSequences(String s) {
		Set<String> seen = new HashSet<String>();
		Set<String> repeated = new HashSet<String>();
		
		for(int i=0;i<=s.length()-10;i++) {
			String str=s.substring(i, i+10);
			if(!seen.add(str)) {
				repeated.add(str);
			}
		}
	    return new ArrayList(repeated);    
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
