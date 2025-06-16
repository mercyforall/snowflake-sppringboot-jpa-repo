package interview_coding_question;

import java.util.*;
import java.util.List;
import java.util.stream.Stream;

public class ConcatStream {
    public static void main(String[] args)
    {
        List<String> ls1 = Arrays.asList("Java", "shin");
        List<String> ls2 = Arrays.asList("explained", "through", "programs");

        Stream<String> concat = Stream.concat(ls1.stream() , ls2.stream());
        concat.forEach(str -> System.out.println(str + ""));
        System.out.println("cureemt tine" + java. time.LocalDateTime.now());
    }
}
