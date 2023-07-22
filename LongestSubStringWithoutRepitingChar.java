import java.util.HashMap;

public class LongestSubStringWithoutRepitingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "ahheelo";
		System.out.println(solution(test));
		String test2 = "abcabcbb";
		System.out.println(solution(test2));

	}
	
	public static int solution(String s) {
		if (s.length()==1) return 1;
		int ans=0;
		HashMap<Character, Integer> help = new HashMap();
		for (int j=0; j<s.length();j++) {
			if (help.get(s.charAt(j))==null) {
				help.put(s.charAt(j), 1);
			} else {
				if (help.size()>ans) ans = help.size();
				help = new HashMap<Character, Integer>();
			}
		}
		return ans;
	}
}
