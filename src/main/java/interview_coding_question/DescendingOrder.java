package interview_coding_question;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static void main(String[] args)
    {
        List<Integer> ls =  Arrays.asList(11,12,12,15,17,18,19);
        ls.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

    }
}
