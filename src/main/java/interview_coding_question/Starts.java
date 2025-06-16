package interview_coding_question;

import java.util.*;

public class Starts {
    public static  void main(String[] args)
    {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().map(s -> s +"").filter(s -> s.startsWith("1")).forEach(System.out::println);
    }
}
