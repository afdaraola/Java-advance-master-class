package IGotAnOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class suggestedProducts {
    /*
    "Given an array of strings products and a string searchWord. We want to design a system
    that suggests at most three product names from products after each character of searchWord is typed.
     Suggested products should have common prefix with the searchWord. If there are more than three products
      with a common prefix return the three lexicographically minimums products. Return list of lists of the
      suggested products after each character of searchWord is typed."
     */

    public static void main(String[] args) {
      String  products[] = {"mobile","mouse","moneypot","monitor","mousepad"}, searchWord = "mouse";

        List<List<String>> output =  suggestedProducts(products,searchWord);

        System.out.println("output "+output);


    }

    public static List<List<String>>  suggestedProducts(String[] products, String searchWords){
        List<List<String>> results  = new ArrayList<>();
        TreeMap<String , Integer> map = new TreeMap<>();
        Arrays.sort(products);
        List<String> productList = Arrays.asList(products);

        for(int i =0; i<products.length;  i++){
            map.put(products[i],i);
        }

        String key = "";
        for(char c : searchWords.toCharArray()){
            key+=c;
            //printout
            System.out.println("Key - "+ key);
            String ceiling = map.ceilingKey(key);
            String floor = map.floorKey(key +"~");
            if(ceiling ==null || floor == null){
                break;
            }
            //printout
            System.out.println("Celing - "+map.get(ceiling));
            System.out.println("floor "+ map.get(floor));

            results.add(productList.subList(map.get(ceiling),Math.min(map.get(ceiling) +3 , map.get(floor) +1)));

        }
        while (results.size() < searchWords.length()){
            results.add(new ArrayList<>());
        }
        return results;
    }
}
