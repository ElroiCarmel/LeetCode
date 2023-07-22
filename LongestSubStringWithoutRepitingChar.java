import java.util.HashMap;

public class LongestSubStringWithoutRepitingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "ahheelo";
		System.out.println(solution(test));
		String test2 = "pwwkew";
		System.out.println(solution(test2));
		String test3 = "dvdf";
		System.out.println(solution(test3));
		// solution not right for test3
		
	}
	
	public static int solution(String s) {
		if (s.length()==1) return 1;
		int ans=0;
		HashMap<Character, Integer> help = new HashMap();
		for (int j=0; j<s.length();j++) {
			if (help.get(s.charAt(j))==null) {
				help.put(s.charAt(j), j);
			} else {
				if (j-help.get(s.charAt(j))>ans) ans = j-help.get(s.charAt(j));
//				help = new HashMap<Character, Integer>();
				help.put(s.charAt(j), 1);
			}
		}
		return ans;
	}
}
