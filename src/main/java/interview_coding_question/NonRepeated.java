package interview_coding_question;


import java.util.HashSet;
import java.util.Set;

public class NonRepeated {
    public static void main(String[] args)
    {
        String input = "Java Articles are Awesome";
        Set<Character> nonRepeat = new HashSet<>();
        Character result = input.chars().mapToObj(c -> (char)c).filter(c -> !nonRepeat.add(c)).findFirst().orElse(null);
        System.out.println(result);
        Character Non = input.chars().mapToObj(c ->(char)c).filter(ch ->input.indexOf(ch) == input.lastIndexOf(ch)).findFirst().orElse(null);
        System.out.println(Non);

    }
}
