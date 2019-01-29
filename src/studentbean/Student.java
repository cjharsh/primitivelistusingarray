package studentbean;

public class Student {
    private int rollno;
    private String studentname;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    /*public String toString(){
        return this.rollno+" "+this.studentname;
    }*/

    @Override
    public String toString() {
        return this.rollno+" "+this.studentname;
    }
}
