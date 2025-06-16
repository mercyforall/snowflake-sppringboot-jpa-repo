package interview_coding_question;

import java.util.Arrays;
import java.util.List;

public class ParellalSort {
    public static void main(String[] args)
    {
        int arr[] = { 99, 55, 203, 99, 4, 91 };
//         Arrays.parallelSort(arr);
        Arrays.stream(arr).forEach(n -> System.out.println("sorted order :" +n));

    }
}
