package IGotAnOffer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Stream;



public class StreamIterate {
    private final Logger logger = Logger.getLogger(String.valueOf(StreamIterate.class));

    public static void main(String[] args) {



        Stream<Integer> integerStream = Stream.iterate(40, n -> n + 2).limit(40);
        System.out.println(integerStream.count());


        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
        long size = list.stream().skip(2)
                .map(element -> element.substring(0, 3)).sorted().count();
        System.out.println(size);

        Optional<String> stream = list.stream().filter(element -> {
            System.out.println("filter() was called");
            return element.contains("2");
        }).map(element -> {
            System.out.println("map() was called");
            return element.toUpperCase();
        }).findFirst();

    }
}
