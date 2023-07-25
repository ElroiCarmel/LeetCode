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
		
	}
	
	public static int solution(String s) {
		if (s.length()==1) return 1;
		int ans=0, j=0, start=0;
		HashMap<Character, Integer> help = new HashMap();
		while (j<s.length()) {
			char c = s.charAt(j);
			if (help.get(c)==null) {
				help.put(c, j);
				j++;
			} else {
				if (j-start>ans) ans = j-start;
				j = help.get(c)+1;
				start = help.get(c)+1;
				help = new HashMap();
			}
		}
		if (j-start>ans) ans = j-start;
		return ans;
	}
}
