/*Array of objects*/

import java.util.*;

class Employee{
    private String name;
    private int empId;
    public void getData(Scanner s){
        
        System.out.print("Enter Employee Name : ");
        name=s.nextLine();
        System.out.print("Enter Employee Id : ");
        empId=s.nextInt();
       
    }
    
    public void display(){
        System.out.println("Employee Name : " + name + "\nEmployee Id : " + empId);
    }
}
class ArrayObject{
    public static void main(String arg[]){
        Employee[] arrEmp=new Employee[4];
        Scanner s=new Scanner(System.in);
        //Initialization of Array Elements
        for(int i=0;i<4;i++)
        arrEmp[i]=new Employee();
        
        //Accepting Data for each element in array
        for(int i=0;i<4;i++)
        arrEmp[i].getData(s);
        
        //Displaying Data for each element in array
        for(int i=0;i<4;i++)
        arrEmp[i].display();
        s.close();
    }
}