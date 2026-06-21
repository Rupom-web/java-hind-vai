import java.util.*;
public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player Name: ");
        String playerName = sc.nextLine();

        int score = 0;
        int correct = 0;
        int incorrect = 0;

        ArrayList<Question> questionBank = new ArrayList<>();

        // MCQ Questions
        questionBank.add(new mcq(
                "Capital of Bangladesh?",
                option.b,
                10,
                "Khulna",
                "Dhaka",
                "Barishal",
                "Sylhet"));

        questionBank.add(new mcq(
                "2 + 2 = ?",
                option.c,
                10,
                "1",
                "2",
                "4",
                "5"));

        questionBank.add(new mcq(
                "Java is a ____ ?",
                option.a,
                10,
                "Programming Language",
                "Animal",
                "Car",
                "Country"));

        questionBank.add(new mcq(
                "Red Planet?",
                option.c,
                10,
                "Earth",
                "Venus",
                "Mars",
                "Jupiter"));

        questionBank.add(new mcq(
                "Which keyword is used for inheritance?",
                option.b,
                10,
                "this",
                "extends",
                "super",
                "static"));

        // True False Questions
        questionBank.add(new TrueFalse(
                "Java is an OOP language.",
                option.a,
                10));

        questionBank.add(new TrueFalse(
                "Earth is flat.",
                option.b,
                10));

        questionBank.add(new TrueFalse(
                "2 + 2 = 4.",
                option.a,
                10));

        questionBank.add(new TrueFalse(
                "HTML is a programming language.",
                option.b,
                10));

        questionBank.add(new TrueFalse(
                "Queue follows FIFO.",
                option.a,
                10));

        Collections.shuffle(questionBank);

        ArrayList<Question> selected =
                new ArrayList<>(questionBank.subList(0, 5));

        System.out.println("\n===== QUIZ START =====");

        for (Question q : selected) {

            q.displayQuestion();

            System.out.print("Answer: ");
            String input = sc.next().toLowerCase();

            try {

                option ans = option.valueOf(input);

                if (q.evaluate(ans)) {
                    System.out.println("Correct!");
                    score += q.topoints();
                    correct++;
                } else {
                    System.out.println("Incorrect!");
                    incorrect++;
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Input!");
                incorrect++;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                incorrect++;
            }
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Player Name : " + playerName);
        System.out.println("Score       : " + score);
        System.out.println("Correct     : " + correct);
        System.out.println("Incorrect   : " + incorrect);

        double percent = (score * 100.0) / (selected.size() * 10);

        System.out.printf("Percentage  : %.2f%%\n", percent);

        if (percent >= 80)
            System.out.println("Grade: A");
        else if (percent >= 60)
            System.out.println("Grade: B");
        else if (percent >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");

        sc.close();
    }
}