package interview_coding_question;

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;


public class CountCharacterStream {
    public static  void  main(String[] args)
    {
        String str = "vishalyadav";
        Map<Character,Long> count = str.chars().mapToObj(c ->(char)c).filter(Character::isLetter).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(count);
    }
}
