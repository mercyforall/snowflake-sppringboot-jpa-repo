//package interview_coding_question;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class CountOccuranceTrueFalse {
//    public static void main(String[] args)
//    {
//        List<Integer> ls = Arrays.asList(11,12,12,13,13,13,14,14);
//        List<Integer> ls1 = ls.stream().boxed().collect(Collectors.toList());
//        Set<Integer> set = new HashSet<>(ls1);
//
//        if(set.size() == ls1.size())
//        {
//            return false;
//        }
//     return true;
//    }
//}
