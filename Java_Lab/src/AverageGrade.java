package com.company;

import java.util.*;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numStudents = Integer.parseInt(scanner.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < numStudents; i++) {
            Student currentStudent = CreateStudent(scanner.nextLine().split("\\s"));
            students.add(currentStudent);
        }
        Collections.sort(students, Student.StudentSort);

        for (Student student: students
             ) {
            double grades = student.AverageGrade();
            if (grades>=5.00){

               System.out.printf("%s -> %.2f",student.getName(), grades);
               System.out.println();
            }
        }
    }
    private static Student CreateStudent(String[] studentData){
        String name = "";
        ArrayList<Double> grades = new ArrayList<>();

        for (int i = 0; i < studentData.length; i++) {
            if (Character.isDigit(studentData[i].charAt(0))){
                grades.add(Double.parseDouble(studentData[i]));
            }else {
                if (!name.equals("")){
                    name +=" ";
                }
                name += studentData[i];
            }
        }
        return new Student(name, grades);


    }
    static class Student{
        private String name;
        private ArrayList<Double> grade;

        public double AverageGrade(){
            if (this.grade.isEmpty()){
                return 0;
            }
            double sum =0;
            for (int i = 0; i < grade.size(); i++) {
                sum+=this.grade.get(i);
            }
            return sum / this.grade.size();
        }
        public Student(String name, ArrayList<Double> grade) {
            this.name = name;
            this.grade = grade;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<Double> getGrade() {
            return grade;
        }

        public void setGrade(ArrayList<Double> grade) {
            this.grade = grade;
        }

        public static Comparator<Student> StudentSort = new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                String name1 = o1.getName();
                String name2 = o2.getName();

                if (name1.equals(name2)){
                    double average1 = o1.AverageGrade();
                    double average2 = o2.AverageGrade();
                    if (average1<average2){
                        return 1;
                    } if (average1>average2){
                        return -1;
                    }
                    return  0;
                }
                return name1.compareTo(name2);
            }
        };
    }
}
