package MasterDataStructureAndAlgorithms;



public class ReversedStrs {

    public static void main(String[] args) {

        String str = "Hello World";
        System.out.println(ReversedString(str));
    }

    public static String ReversedString(String strs){

        if(strs.length() < 2 || strs == null){
           return strs;
        }

        String reversedWorld = "";

      char [] arr = strs.toCharArray();


        for(int i = arr.length-1; i >=0; i-- ){
            System.out.println(arr[i]);
            reversedWorld+= arr[i];

        }

        return reversedWorld;
    }



    public static String ReversedString2(String strs){

        if(strs.length() < 2 || strs == null){
            return strs;
        }

        return new StringBuilder(strs).reverse().toString();
    }

}
