package Day_8;

import java.util.*;
class Student{
    String name;
    String id;
    int age;
    double grade;
    Set<String> subjects;
    
    Student(String nm,String id,int age,double grade,Set<String> sub){
        this.name=nm;
        this.id=id;
        this.age=age;
        this.grade=grade;
        this.subjects=sub;
    }
    
    public String getName(){
        return name;
    }
    
    public String getID(){
        return id;
    }
    
    public int getAge(){
        return age;
    }
    
    public double getGrade(){
        return grade;
    }
    
    public String toString(){
        return name+" | "+id+" | "+age+" | "+grade+" | "+subjects;
    }
}

class StudentManagementSystem{
    Map<String,Student> map;
    
    StudentManagementSystem(){
        map=new HashMap<>();
    }
    
    public void addStudent(Student s){
        map.put(s.id,s);
    }
    
    public void removeStudent(String id){
        map.remove(id);
    }
    
    public Student searchByID(String id){
        return map.get(id);
    }
    
    public List<Student> searchByName(String name){
        List<Student> ls=new ArrayList<>();
        for(Student s:map.values()){
            if(s.name.equalsIgnoreCase(name)) ls.add(s);
        }
        return ls;
    }
    
    public void sortByName(){
        List<Student> ls=new ArrayList<>(map.values());
        ls.sort(Comparator.comparing(Student::getName));
        ls.forEach(System.out::println);
    }
    
    public void sortByGrade(){
        List<Student> ls=new ArrayList<>(map.values());
        ls.sort(Comparator.comparing(Student::getGrade));
        ls.forEach(System.out::println);
    }
    
    public List<Student> findBySubject(String sub){
        List<Student> ls=new ArrayList<>();
        for(Student s:map.values()){
            if(s.subjects.contains(sub)) ls.add(s);
        }
        return ls;
    }
    
    public void display(){
        map.values().forEach(System.out::println);
    }
    
	public static void main(String[] args) {
		StudentManagementSystem sms=new StudentManagementSystem();
		
		Student s1=new Student("Alice","123",18,85.1,new HashSet<>(Arrays.asList("Maths","English")));
		Student s2=new Student("Bob","132",19,90.0,new HashSet<>(Arrays.asList("Maths","Chemistry")));
		Student s3=new Student("Prince","124",20,95.6,new HashSet<>(Arrays.asList("English","Chemistry")));
		Student s4=new Student("Pulkit","176",17,88.2,new HashSet<>(Arrays.asList("Physics","Maths")));
		
		sms.addStudent(s1);
		sms.addStudent(s2);
		sms.addStudent(s3);
		sms.addStudent(s4);
		
		System.out.println("Displaying Students Details:");
		sms.display();
		
		System.out.println("\nDisplaying Students Details After Removing The Given Student ID: "+s2.getID());
		sms.removeStudent(s2.getID());
		sms.display();
		System.out.println();
		
		
		sms.searchByName("Prince").forEach(System.out::println);
		
		System.out.println(sms.searchByID("132"));
		
		System.out.println("\nDisplaying Students Details After Sorting The Date by Name:");
		sms.sortByName();
		
		System.out.println("\nDisplaying Students Details After Sorting The Date by Grades:");
		sms.sortByGrade();
		
		System.out.println("\nStudents entrolled in Maths:");
		sms.findBySubject("Maths").forEach(System.out::println);
		
	}
}