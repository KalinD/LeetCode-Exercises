public class LongestPalindromicSubstring {
    public static void main(String[] args){
        System.out.println(longestPalindrome("babad")); // bab or aba
        System.out.println(longestPalindrome("cbbd"));  // bb
        System.out.println(longestPalindrome("a"));     // a
        System.out.println(longestPalindrome("ac"));    // a or c
        System.out.println(longestPalindrome("aacabdkacaa")); // aca
        System.out.println(longestPalindrome("uhrfjotnewtodhmbplsaolnpcdaohiytmfllukijouxipvqohtsgxbtfoxyfkfczkfwhzimbefiohmtimrcxbpgcxogystdkcqujvbxsgirpccdnvejtljftwkdpsqpflzwruwwdzovsbmwbcvlftkjnxqaguvtsycylqzquqkbnybnbaeahbxejhphwrpmymcemuhljwtuvxefqfzjhskuqhifydkxpnfwfxkpeexnjltfqwfvchphmtsrsyayxukvmlqodshqwbeaxhcxdbssnrdzvxtusngwqdxvluauphmmbwmgtazjwvolenegwbmjfwprfuswamyvgrgshqocnhirgyakbkkggviorawadzhjipjjgiwpelwxvtaegauerbwpalofrbghfhnublttqtcmqskcocwwwxpnckrnbepusjyohsrretrqyvgnbezuvwmzizcefxyumtdwnqjkgsktyuacfpnqocqjxcurmipjfqmjqrkdeqsfseyigqlwmzgqhivbqalcxhlzgtsfjbdbfqiedogrqasgmimifdexbjjpfusxsypxobxjtcwxnkpgkdpgskgkvezkriixpxkkattyplnpdbdifforxozfngmlgcunbnubzamgkkfbswuqfqrvzjqmlfqxeqpjaqayodtetsecmfbplscmslpqiyhhykftzkkhshxqvdwmwowokpluwyvavwvofwqtdilwqjgrprukzyhckuspyzaoe"));    // aca
        System.out.println(longestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));    // aca
    }

    public static String longestPalindrome(String s) {
        String res = "";
        Integer longestSeq = 0;
        for(int i = 0; i < s.length(); i++){
            int l = i, r = i;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if(r - l + 1 > longestSeq){
                    res = s.substring(l, r + 1);
                    longestSeq = r - l + 1;
                }
                l--;
                r++;
            }

            l = i;
            r = i + 1;
            while(l >=  0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if(r - l + 1 > longestSeq){
                    res = s.substring(l, r + 1);
                    longestSeq = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return res;
    }
}
