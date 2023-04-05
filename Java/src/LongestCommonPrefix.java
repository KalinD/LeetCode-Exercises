public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < getLengthOfShortestString(strs); index++) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (strs[i].length() == index || strs[i].charAt(index) != strs[i + 1].charAt(index)) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(index));
        }
        return sb.toString();
    }

    public int getLengthOfShortestString(String[] strs) {
        int shortest = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < shortest) shortest = strs[i].length();
        }
        return shortest;
    }
}


