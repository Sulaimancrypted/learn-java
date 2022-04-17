//package 2. Class definition in other source file;

/*Source code file name : Employee.java*/

/*Definition for class Employee which is user defined class*/

public class Employee{
    protected int empId;
    private int basicSal;
    private String empName, address;
    public void setData(int eid,int bsal,String ename, String add){
        empId=eid;
        basicSal=bsal;
        empName=ename;
        address=add;
    }
    
    public String getName(){
        return(empName);
    }
}