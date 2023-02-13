package AmazonCoding;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class MapJava {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "Festus");
        map.put(2,"Abayomi");
        map.put(3,"Daramola");

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+ " "+ m.getValue());

        }

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);


    }
}
