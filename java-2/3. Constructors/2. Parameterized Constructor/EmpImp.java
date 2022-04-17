/*Source code file name : EmpImp.java*/

/*Definition for class Employee which is user defined class*/

class Employee{
    protected int empId;
    private int basicSal;
    private String empName, address;
    
    public Employee(int eid,int bsal,String ename, String add){
        empId=eid; basicSal=bsal; empName=ename; address=add;
    }
    public void displayEmpData(){
        System.out.println("ID : "+empId+"\nName : "+empName+"\nAddress :"+address);
    }
}

/*Definition for class EmpImp which implements class Employee*/

class EmpImp{
    public static void main(String[] arg){
        Employee objEmp1=new Employee(10,20000,"Prashant","Pune");
        objEmp1.displayEmpData();
        Employee objEmp2=new Employee(11,22000,"Poonam","Mumbai");
        objEmp2.displayEmpData();
        Employee objEmp3=new Employee(12,24000,"Ankita","Delhi");
        objEmp3.displayEmpData();
    }
}