
public class LongestPaliSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test2 = "racecarleveldeifiedradarlevelrepaper";
		System.out.println(solutionBF(test2));
//		System.out.println(isPali("!#@!#!!#", 3, 5));
		
	}
	
	//Helper function if a substring is a palindrome
	public static boolean isPali(String s, int start, int end) {
		for (int i=start; i<=(start+end)/2; i++) {
			if (s.charAt(i)!=s.charAt(start+end-i)) return false;
		}
		return true;
	}
	
	/*
	 * 1. Start from i'th char
	 * 2. Loop from i+1 to end of string - j
	 * 3. If (j)==i: Check if pali
	 * 4. If 3==true: Check the length [j-i+1]
	 * 5. If >max update max (default is 1 char)
	 */
	public static String solutionBF(String str) {
		int[] help = solutionBFH(str);
		String ans = str.substring(help[0], help[1]+1);
		return ans;
	}
	
	public static int[] solutionBFH(String str) {
		int[] ans = new int[2];
		int max = 1;
		if (str.length()==1) return new int[] {0,0};
		for (int i=0; i<str.length()-1;i++) {
			for (int j=i+1; j <str.length(); j++) {
				if (str.charAt(i)==str.charAt(j) && isPali(str, i, j)) {
					if (j-i+1>max) {
						max = j-i+1;
						ans[0] = i;
						ans[1] = j;
					}
				}
			}
		}
		return ans;
	}
}
