package domain;
/**
 * Sub class Manager extending Employee
 */
public class Manager extends Employee {

    /**
     * Method that you can use to add a Manager with params
     * @param employees list of Employee-s, that are subordinate to Manager
     * @see Employee#Employee(String, String, int, String) For other params (Employee)
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override
     /**
     * Method that converts Manager class to String representation
     */
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /** 
     * Method that you can use to add a Manager with employees list and ID
     * @param employees list of Employee-s, that are subordinate to Manager
     * @see Employee#Employee(String, String, int, String) For other params (Employee)
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Method that you can use to add a Manager with placeholder for employees list and ID
     * @see Employee#Employee(String, String, int, String) For other params (Employee)
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Method that returns current Employee-s that are subordinate to Manager in string form
     * @return current Employee-s that are subordinate to Manager in string form
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Method that sets subordinate Employee-s of a Manager 
     * @param employees list of Employee-s, that are subordinate to Manager
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Method that returns list of current Employee-s that are subordinate to Manager
     * @return current list of Employee-s that are subordinate to Manager
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
