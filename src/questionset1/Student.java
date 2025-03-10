package questionset1;

import java.util.ArrayList;

public class Student {
    private String name;
    private int grade;
    private int attendance;
    private ArrayList<Double> grades;
    public Student(String name,int grade){
        this.name = name;
        this.grade = grade;
        this.grades = new ArrayList<>() ;

    }
    public int getGrade(){
        return this.grade;
    }
    public void updateGrade(int newGrade){
        this.grade = newGrade;
    }
    public String checkAttendance(){
        if(attendance> 75){
            return "good";
        }
        else{
            return "needs improvement";
        }
    }

    public void updateGrade(){
        if(getGrade()> 100){
            updateGrade(100);
        }
        else{
            updateGrade(getGrade()+5);
        }
    }
    public void addGrade(double grade){
        grades.add(grade);
    }
    public double calculateAverage(){
      double sum = 0.0;
      for(double grade : grades){
          sum += grade;
      }
      return sum/grades.size();
    }
}
