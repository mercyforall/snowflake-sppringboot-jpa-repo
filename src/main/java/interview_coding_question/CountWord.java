package interview_coding_question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWord {

        public static  void main(String[] args)
        {
            List<String> ls = Arrays.asList("AA","AA","CC","DD");
            Map<String,Long> count = ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            System.out.println(count +"count of element");

        }


}
