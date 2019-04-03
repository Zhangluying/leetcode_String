package string;

public class IsomorphicStrings {
	public static boolean isIsomorphic(String s, String t) {
		int[] nums1 = new int[256];
		int[] nums2 = new int[256];
		
		for(int i=0;i<s.length();i++) {
			if(nums1[s.charAt(i)]!=nums2[t.charAt(i)]) return false;
			nums1[s.charAt(i)]=i+1;
			nums2[t.charAt(i)]=i+1;
			
			}
		return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsomorphic("aa", "ab"));

	}

}
