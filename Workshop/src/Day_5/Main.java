package Review;

interface Graded{
    void assignGrade(Student name,double gpa);
}

class Student{
    String name;
    int student_id;
    private double gpa=0.0;
    private int totalCredits=0;
    Student(String name,int id){
        this.name=name;
        this.student_id=id;
    }
    
    void updateGpa(double gradePoints,int credits){
        gpa=((totalCredits*gpa)+(gradePoints*credits))/(totalCredits+credits);
        totalCredits+=credits;
    }
    
    String getStudentName(){
        return name;
    }
    
    double getGPA(){
        return gpa;
    }
    
    void printTranscript(){
        System.out.println("student name"+getStudentName()+"Student ID"+student_id+"GPA"+getGPA()+"Total Credits"+totalCredits);
    }
}

class Undergraduate extends Student{
    Undergraduate(String name,int id){
        super(name,id);
    }
    
    @Override
    void printTranscript(){
    	System.out.println("Undergraduate Student's TransScript ->"+"Student Name: "+name+" | GPA: "+getGPA());
    }
}

class Postgraduate extends Student{
    Postgraduate(String name,int id){
        super(name,id);
    }
    
    @Override
    void printTranscript(){
        System.out.println("Postgraduate Student's TransScript ->"+"Student Name: "+name+" | GPA: "+getGPA());
    }
}

class Course{
    private String couseName;
    private int courseCredits;
    
    Course(String course,int courseCredits){
        this.couseName=course;
        this.courseCredits=courseCredits;
    }
    
    String getCourse(){
        return couseName;
    }
    
    int getCourseCredits(){
        return courseCredits;
    }
    
    void displayCourseDetails(){
        System.out.println("Course Name"+getCourse()+"Course credits"+getCourseCredits());
    }
    
}

class Faculty implements Graded{
    String name;
    String gradingType;
    
    Faculty(String name,String type){
        this.name=name;
        this.gradingType=type;
    }
    
     public void assignGrade(Student student, double gpa) {
        System.out.print("Faculty " + name + " assigned: ");
        if (gradingType.equals("Letter")) {
            if (gpa <= 10.0 && gpa > 9.0) System.out.println("Grade: O");
            else if (gpa <= 9.0 && gpa > 8.0) System.out.println("Grade: A");
            else if (gpa <= 8.0 && gpa > 7.0) System.out.println("Grade: B");
            else if (gpa <= 7.0 && gpa > 6.0) System.out.println("Grade: C");
            else System.out.println("Grade: D");
        } else {
            if (gpa >= 3.0) System.out.println("PASS");
            else System.out.println("FAIL");
        }
    }
    
}

class Enrollment{
    Student studentName;
    Course course;
    
    Enrollment(Student name,Course c){
        this.studentName=name;
        this.course=c;
    }
    
    void printEnrollmentDetails() {
        System.out.println("Enrollment Details -> Student Name: " + studentName.getStudentName() +"| Course: " + course.getCourse() +"| Credits: " + course.getCourseCredits());
    }
}

public class Main {
    public static void main(String[] args) {
        Undergraduate ug =new Undergraduate("Alice",101);
        Postgraduate pg = new Postgraduate("Bob",201);

        Course ds = new Course("Data Structures",4);
        Course ai = new Course("AI & ML",3);

        Faculty profA = new Faculty("Dr. Smith","Letter");
        Faculty profB = new Faculty("Prof. John", "PassFail");

        Enrollment e1 = new Enrollment(ug,ds);
        Enrollment e2 = new Enrollment(pg,ai);

        e1.printEnrollmentDetails();
        e2.printEnrollmentDetails();

        ug.updateGpa(9.0,4);
        pg.updateGpa(2.5,3);

        profA.assignGrade(ug, ug.getGPA());
        profB.assignGrade(pg, pg.getGPA());

        ug.printTranscript();
        pg.printTranscript();
    }
}
