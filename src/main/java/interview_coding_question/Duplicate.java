package interview_coding_question;

import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args)
    {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();
        List<Integer> ls = myList.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
        System.out.println(ls);
    }
}
