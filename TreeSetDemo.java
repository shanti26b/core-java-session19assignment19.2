package assignment19TreeSet;


import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
class Student   implements Comparable<Student>  {  //creating student object which implements comparable

    String name; //creating variables for student class taking three properties name,rollno and department
    int rollNumber;
    String department;
    
    public String getName() {           //creating get methods and set methods for the Student class for three properties
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getRollNumber() {
        return rollNumber;
    }
 
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
 
    Student(String name, int rollNumber){   //creating constructor and passing two parameters
        this.name=name;
        this.rollNumber=rollNumber;
    }
    Student(String name, int rollNumber,String department){ //creating constructor and passing three parameters
        this.name=name;
        this.rollNumber=rollNumber;
        this.department=department;
    }
    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
 
       public int compareTo(Student obj) {           //here using compareTo method we are comparing the objects and returning the values 
        if (this.getRollNumber() == obj.getRollNumber()) return 0;
        else
        
       if (this.getRollNumber() < obj.getRollNumber()) return 1;
        else
        	
       	return -1;
        	
}
 
}
public class TreeSetDemo {
                //here created main class as HashSetDemo

             public static void main(String[] args) {    //created main method
          	   
            	 TreeSet<Student> ts = new TreeSet<Student>();  //created treeset interface object for the student class   
                 
                 //adding elements to TreeSet 
              ts.add(new Student("Chinni",20,"IIT"));
              ts.add(new Student(" Pedha",30,"EEE"));
              ts.add(new Student("Nani",80,"CIVIL"));
              ts.add(new Student("Praveen",90,"CEC"));
              ts.add(new Student("Ramu",50,"ECE"));
              
                   
              Iterator itr = ts.iterator(); //using iterator we are iterating the tree set 
           
           while(itr.hasNext()){
           
               Student obj= (Student)itr.next(); //here it gives the output and print the values in of the tree set objects
               System.out.println(obj.getName()+"  "+obj.getRollNumber()+"  "+obj.getDepartment()); 

            }         
}
}