//POJO-->PLAIN OLD JAVA OBJECT
import java.util.*;
public class Student {
    //private Attributes or Data members
    private String studentId;
    private String studentName;
    private String department;
    private double cgpa;
    //Constructors
    public Student(){

    }
    public Student(String studentId,String studentName,String department,double cgpa){
        this.studentId=studentId;
        this.studentName=studentName;
        this.department=department;
        this.cgpa=cgpa;
    }
    //Setters
    public void setStudentId(String studentId){
        this.studentId=studentId;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public void setCGPA(double cgpa){
        this.cgpa=cgpa;
    }
    //Getters
    public String getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getDepartment(){
        return department;
    }
    public double getCGPA(){
        return cgpa;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n=scan.nextInt();
        Student[] storedata=new Student[n];
        scan.nextLine();
        Student s=null;
        for(int i=0;i<n;i++){
            s=new Student();
            //Scan the data
            System.out.println("Enter the details of "+ (i+1) + " student:");
            String details=scan.nextLine();
            //Split the data
            String[] arr=details.split(",");
            //Set the data
            s.setStudentId(arr[0]);
            s.setStudentName(arr[1]);
            s.setDepartment(arr[2]);
            s.setCGPA(Double.parseDouble(arr[3]));
            //Store the data
            storedata[i]=s;
        }
         //Get the data
         System.out.println();
         System.out.println("the details of students:");
         for(int i=0;i<n;i++){
            System.out.println();
            System.out.println("Student "+(i+1));
            System.out.println("Student Id: "+storedata[i].getStudentId());
            System.out.println("Student Name: "+storedata[i].getStudentName());
            System.out.println("Department: "+storedata[i].getDepartment());
            System.out.println("CGPA: "+storedata[i].getCGPA());
         }

        
        
    }
}

