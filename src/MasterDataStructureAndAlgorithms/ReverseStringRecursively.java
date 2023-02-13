package MasterDataStructureAndAlgorithms;

public class ReverseStringRecursively {


    public static void main(String[] args) {
        String st = "daramola";
        System.out.println( "Reversed =>"+ reverse(st));
    }

    public static  String reverse(String str){

        if(str.isEmpty()){
            return str;
        }

        System.out.println(str.charAt(0));
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
