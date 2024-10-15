import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] answers = new String[5];
    public QuestionService() {
        Option[] questionOneOptions = new Option[4];
        questionOneOptions[0] = new Option(1,"2");
        questionOneOptions[1] = new Option(2,"6");
        questionOneOptions[2] = new Option(3,"4");
        questionOneOptions[3] = new Option(4,"8");
        questions[0] = new Question(1,"size of int?",questionOneOptions,"4");

        Option[] questionTwoOptions = new Option[4];
        questionTwoOptions[0] = new Option(1,"2");
        questionTwoOptions[1] = new Option(2,"6");
        questionTwoOptions[2] = new Option(3,"4");
        questionTwoOptions[3] = new Option(4,"8");
        questions[1] = new Question(2,"size of double?",questionTwoOptions,"8");

        Option[] questionThreeOptions = new Option[4];
        questionThreeOptions[0] = new Option(1,"2");
        questionThreeOptions[1] = new Option(2,"6");
        questionThreeOptions[2] = new Option(3,"4");
        questionThreeOptions[3] = new Option(4,"8");
        questions[2] = new Question(3,"size of char?",questionThreeOptions,"2");

        Option[] questionFourOptions = new Option[4];
        questionFourOptions[0] = new Option(1,"2");
        questionFourOptions[1] = new Option(2,"6");
        questionFourOptions[2] = new Option(3,"4");
        questionFourOptions[3] = new Option(4,"8");
        questions[3] = new Question(4,"size of long?",questionFourOptions,"8");

        Option[] questionFiveOptions = new Option[4];
        questionFiveOptions[0] = new Option(1,"1");
        questionFiveOptions[1] = new Option(2,"2");
        questionFiveOptions[2] = new Option(3,"4");
        questionFiveOptions[3] = new Option(4,"8");
        questions[4] = new Question(5,"size of boolean?",questionFiveOptions,"1");
    }

    public void playQuiz() {
        int count = 0;
        for (Question q : questions) {
            System.out.println("Question "+q.getId()+": "+q.getQuestion());
            for (Option o : q.getOptions()) {
                System.out.println("option "+o.getId()+": "+o.getOption()+" ");
            }
            Scanner sc = new Scanner(System.in);
            String ans = sc.nextLine();
            answers[count] = ans;
            count++;
            System.out.println();
        }
    }

    public void checkScore() {
        int score = 0;
        int iteration = 0;
        for (Question question : questions) {
            if(question.getAnswer().equals(answers[iteration])) {
                score++;
            }
            iteration++;
        }
        System.out.println("Your score is : "+ score);
    }
}
