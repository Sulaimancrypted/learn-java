
/*Definition for class EmpImp which implements class Employee*/

public class EmpImp
{
    public static void main(String arg[]){
        Employee objEmp=new Employee();
        objEmp.setData(10,20000,"XYZ","Pune");
        String name=objEmp.getName();
        System.out.print("\nEmployee name for objEmp is "+name);
    }
}