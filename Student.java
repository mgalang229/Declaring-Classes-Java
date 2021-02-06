
public class Student {
    private String name;
    private int studNumber;
    private double score;

    public Student() {
        this.name = "";
        this.studNumber = 0;
        this.score = 0.0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudNumber(int studNumber) {
        this.studNumber = studNumber;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getStudNumber() {
        return this.studNumber;
    }

    public double getScore() {
        return this.score;
    }

    public void study() {
        System.out.println(this.name + " studies very well");
    }

    public void play(double money) {
        System.out.println("The student needs " + money + " to play.");
    }

    public boolean doChores() {
        boolean done = false;
        return done;
    }
}
