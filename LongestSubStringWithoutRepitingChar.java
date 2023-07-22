
public class LongestSubStringWithoutRepitingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "ahheelo";
		System.out.println(solution(test));
	}
	
	public static int solution(String s) {
		if (s.length()==1) return 1;
		int ans=0;
		int start = 0;
		for (int e=1; e<s.length();e++) {
			if (s.charAt(e-1)==s.charAt(e)) {
				if (e-start>ans) ans = e-start;
				start = e-1;
			}
		}
		if (s.length()-1-start>ans) ans = s.length()-1-start;
		return ans;
	}
}
