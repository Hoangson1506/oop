import java.util.HashSet;

public class StringCode {
    public String blowup(String str) {
        StringBuilder blowupString = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                int repeat = Character.getNumericValue(str.charAt(i));
                if(i != str.length() - 1) {
                    for(int j=0; j<repeat; j++) {
                        blowupString.append(str.charAt(i+1));
                    }
                }
            } else {
                blowupString.append(str.charAt(i));
            }
        }
        return blowupString.toString();
    }
    public int maxRun(String str) {
        int max = 1;
        int count = 1;
        if(str.length() == 0) {
            return 0;
        }
        for(int i=0; i<str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                count++;
            }
            else {
                count = 1;
            }
            max = Integer.max(max, count);
        }
        return max;
    }
    public boolean stringIntersect(String a, String b, int len) {
        HashSet<String> hashSet = new HashSet<>();
        for(int i=0; i<a.length(); i++) {
            for(int j=i+1; j<=a.length(); j++) {
                hashSet.add(a.substring(i, j));
            }
        }
        String longestCommonSubstring = "";
        for(int i=0; i<b.length(); i++) {
            for(int j=i+1; j<=b.length(); j++) {
                String substring = b.substring(i, j);
                if(hashSet.contains(substring) && substring.length() > longestCommonSubstring.length()) {
                    longestCommonSubstring = substring;
                }
            }
        }
        return longestCommonSubstring.length() > len;
    }
}
