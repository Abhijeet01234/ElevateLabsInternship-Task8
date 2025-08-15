public class QuizQuestion {
    private String question;
    private String[] options;
    private int correctAnswerIndex;

    //Generating Parametrized Constructor of the above private fields
    public QuizQuestion(String question, String[] options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    //Getter Methods of our fields
    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}