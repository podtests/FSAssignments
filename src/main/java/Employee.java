public class Employee implements Comparable<Employee>{

    private String empID;

    private String name;

    private int salary;

    public Employee(String empID, String name, int salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

    public String getEmpId() {
        return this.empID;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    //sort by empid asc
    @Override
    public int compareTo(Employee e) {
        return this.empID.compareTo(e.empID);
    }
}
