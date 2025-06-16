package interview_coding_question;

public class CurrentTime {
    public static void main(String[] args)
    {
        System.out.println("local date" + java.time.LocalDate.now());
        System.out.println("local date" + java.time.LocalDateTime.now());
        System.out.println("local date" + java.time.LocalTime.now());

    }
}
