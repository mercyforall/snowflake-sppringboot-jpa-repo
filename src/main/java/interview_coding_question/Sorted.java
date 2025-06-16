package interview_coding_question;

import java.util.Arrays;
import java.util.List;

public class Sorted {
    public static  void  main(String[] args)
    {
        List<Integer> ls =  Arrays.asList(11,12,12,15,17,18,19);
        ls.stream().sorted().forEach(System.out::println);
    }
}
