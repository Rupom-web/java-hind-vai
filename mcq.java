
class mcq extends Question {

    String a, b, c, d;
          //parent class                              //this class /subclass
    public mcq(String qtext, option correctAnswer, int point,
               String a, String b, String c, String d) {

        super(qtext, correctAnswer, point);

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
//mcq display
    @Override
    public void displayQuestion() {
        System.out.println("\n" + qtext);
        System.out.println("a. " + a);
        System.out.println("b. " + b);
        System.out.println("c. " + c);
        System.out.println("d. " + d);
    }

    @Override
    public boolean evaluate(option ans) {
        return ans == correctAnswer;//new obj ans option classer .check if option ans==option correctans
                //return t/f
    }
}