/*Source code file name : EmpImp.java*/

/*Definition for class Employee which is user defined class*/

class Employee{
    protected int empId;
    private int basicSal;
    private String empName, address;
    
    /*First constructor : User defined Default Constructor*/
    
    public Employee(){
    empId=0; basicSal=1000; empName="XXX"; address="Pune";
    }
    
    /*Second constructor : Copy Constructor*/
    
    public Employee(Employee e){
        empId=e.empId;
        basicSal=e.basicSal;
        empName=e.empName;
        address=e.address;
    }
    
    public void setData(int eid,int bsal,String ename, String add){
        empId=eid; basicSal=bsal; empName=ename; address=add;
    }
    
    public void displayEmpData(){
        System.out.println("ID : "+empId+"\nName : "+empName+"\nAddress :"+address);
    }
}

/*Definition for class EmpImp which implements class Employee*/

class EmpImp{
    public static void main(String arg[]){
        Employee objEmp1=new Employee();
        objEmp1.setData(10,20000,"Prashant","Pune");
        objEmp1.displayEmpData();
        Employee objEmp2=new Employee(objEmp1);
        objEmp2.displayEmpData();
    }
}