
class TrueFalse extends Question {

    public TrueFalse(String qtext, option correctAnswer, int point) {//parent class inharitence
        super(qtext, correctAnswer, point);
    }

    @Override
    public void displayQuestion() {
        System.out.println("\n" + qtext);
        System.out.println("a. True");
        System.out.println("b. False");
    }

    @Override
    public boolean evaluate(option ans) throws Exception {

        if (ans == option.c || ans == option.d) {
            throw new Exception("True/False only accepts a or b.");
        }

        return ans == correctAnswer;//new obj ans option classer .check if option ans==option correctans
//return t/f

    }
}


