/*Source code file name : EmpImp.java*/
/*Definition for class Employee which is user defined class*/

class Employee
{
    protected int empId;
    private int basicSal;
    private String empName;
    private String address;
    
    public void setData(int eid,int bsal,String ename, String add){
        empId=eid; basicSal=bsal; empName=ename; address=add;
    }

    public void displayEmpData(){
        System.out.print("\nID : "+empId+"\nName : " + empName + "\nAddress :" + address);
    }
}

/*Definition for class EmpImp which implements class Employee*/
class EmpImp{
    public static void main(String arg[]){
        Employee objEmp=new Employee();
        objEmp.displayEmpData();
        objEmp.setData(10,20000,"XYZ","Pune");
        objEmp.displayEmpData();
        System.out.println("emp id is "+ objEmp.empId);
        System.out.println("empName id is "+ objEmp.empId);
        //System.out.println("emp is "+ objEmp.address);
    }
}