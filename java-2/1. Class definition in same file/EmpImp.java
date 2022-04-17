class Employee {
    protected int empId;
    private int basicSal;
    private String empName, address;

    public void setData(int eid, int bsal, String ename, String add) {
        empId = eid;
        basicSal = bsal;
        empName = ename;
        address = add;
    }

    public String getName() {
        return (empName);
    }
    public String getAddress() {
        return (address);
    }
    public int getBasicSal() {
        return (basicSal);
    }
}

class EmpImp {
    public static void main(String arg[]){
        Employee objEmp=new Employee();
        objEmp.setData(10,20000,"XYZ","Pune");
        String name=objEmp.getName();
        System.out.print("\nEmployee name for objEmp is "+name);
        String add =objEmp.getAddress();
        System.out.print("\nemp address for objEmp is "+add);
        int sal =objEmp.getBasicSal();
        System.out.print("\nEmployee basic salary for objEmp is "+sal);
    }
}
