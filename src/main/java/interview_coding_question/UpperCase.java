package interview_coding_question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] main)
    {
        List<String> ls = Arrays.asList("aa","bb","cc","dd");
        List<String> upper = ls.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("uppercase letter" + upper);
    }
}
