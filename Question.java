
enum option {
    a, b, c, d
}

// Abstract Class
abstract class Question {//because of abstract we cant create an obj of this class

    protected String qtext;
    protected int point;
    protected option correctAnswer;//currect ans option
 //constructor to input question in arraylist  
    public Question(String qtext, option correctAnswer, int point) {
        this.qtext = qtext;
        this.correctAnswer = correctAnswer;
        this.point = point;
    }

    public abstract void displayQuestion();//just use name of mathod thats why abstract.if we declear this mathod no need to abstract

    public abstract boolean evaluate(option ans) throws Exception;//just use name of mathod thats why abstract.

//mathod to print point
    public int topoints() {
        return point;
    }
    //print question always on last 
    public String toString() {
        return qtext;
    }
}