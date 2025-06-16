package interview_coding_question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.*;

public class DuplicateElementWithCount {
    public static  void main(String[] args)
    {
       List<String> ls = Arrays.asList("AA","AA","CC","DD");
        Map<String,Long> count = ls.stream().filter(x -> Collections.frequency(ls,x)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(count +"count of element");

    }
}
