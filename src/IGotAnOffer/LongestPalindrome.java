package IGotAnOffer;
/*
"Given a string s, find the longest palindromic substring in s.
You may assume that the maximum length of s is 1000."
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "imi";
        System.out.println(longestPalindrome(s));

    }
public static String longestPalindrome(String s){

        if(s ==null||s.length()<1){
            return "";
        }
        if(s.length()>1000){
            return "Invalid Length";
        }

int start = 0 , end = 0;

        for (int i = 0; i < s.length(); i ++){

            int len1 = expandAroundCentre(s,i,i);
            int len2 = expandAroundCentre(s,i,i+1);
            int len = Math.max(len1,len2);

            if(len > end - start){
                start = i - (len-1)/2;
                end = i +len/2;
            }
        }

        return s.substring(start,end+1);

}

public static int expandAroundCentre (String s, int left, int right){
        int L = left, R = right;

        while(L>=0 && R < s.length() && s.charAt(L) == s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
}

}
