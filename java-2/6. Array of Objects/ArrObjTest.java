
/*Array of objects*/

import java.util.*;

class Employee{
    private String name,dept;
    private int empId;
    public void setData(Scanner sc){
        System.out.print("Enter Employee Id : ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name : ");
        name = sc.nextLine();
        System.out.print("Enter Department Name : ");
        dept = sc.nextLine();
        //s.close();
    }

    public void display(){
        System.out.println("Employee Name : "+name+"\nEmployee Id : "+empId + "\nEmployee department: " + dept);
    }
}
public class ArrObjTest{
    public static void main(String arg[]){
        Employee[] arrEmp = new Employee[3];
        Scanner scanner = new Scanner(System.in);

        //Initialization of Array Elements
        for(int i = 0; i < arrEmp.length;i++)
            arrEmp[i] = new Employee();

        //Accepting Data for each element in array
        for(int i = 0; i < arrEmp.length;i++)
            arrEmp[i].setData(scanner);

        System.out.println();
        //Displaying Data for each element in array
        for(int i = 0; i<arrEmp.length;i++)
            arrEmp[i].display();

        //System.out.println(arrEmp.length);
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Hello this is iteration no. " + i);
        // }
        scanner.close();
        
    }
}