package interview_coding_question;

import java.util.*;
import java.util.Arrays;

public class Max {
    public static  void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(10, 25, 5, 42, 18);
        int max = numbers.stream().max(Integer::compare).get();
        long coun =  numbers.stream().count();
        System.out.println(coun);
                System.out.println(max);
    }
}
