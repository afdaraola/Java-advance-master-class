package StringPractice;

public class BackSpaceCompare {

    public boolean backspaceCompare(String s, String t) {
        int i = s.length()-1;
        int j =  t.length()-1;

        int s_skip = 0;
        int t_skip = 0;

        while(i >= 0 || j >= 0){

            while (i >= 0){
                if(s.charAt(i) == '#'){
                    s_skip++;
                    i--;
                }else if(s_skip >= 0){
                    i--;
                    s_skip--;
                }else{
                    break;
                }
            }

            while(j > 0){
                if(t.charAt(j) =='#'){
                    t_skip++;
                    j--;
                }else if(t_skip>=0){
                    t_skip--;
                    j--;
                }
            }

            if(i >=0 && j >= 0 && s.charAt(i)!=t.charAt(j) ){
                return false;
            }

            if ((i>=0) != (j>=0)){
                return false;
            }

            i--;
            j--;
        }

        return true;
    }

}
