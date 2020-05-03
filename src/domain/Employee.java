package domain;
/**
 * Main class that represents Employee
 */
public class Employee {

    @Override
    /**
     * Method that converts Employee class to String representation
     */
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;

   /**
    * Method that you can use to add Employee with params and ID
    * @param name name of an Employee
    * @param jobTitle job assigned to Employee
    * @param level access level of an Employee, can be 1,2,3. Default - 1
    * @param dept department of an Employee 
    */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Method that you can use to add Employee with ID
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Method that sets the job of an Employee
     * @param job job assigned to Employee
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Method that returns current job of an Employee
     * @return current job of an Employee
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Method that returns current name of an Employee
     * @return current name of an Employee
     */
    public String getName() {
        return name;
    }

    /**
     * Method that sets level of an Employee
     * @param level access level of an Employee, can be 1,2,3. Default - 1
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Method that returns current level of an Employee
     * @return current level of an Employee
     */
    public int getLevel() {
        return level;
    }

    /**
     * Method that returns current department of an Employee
     * @return current department of an Employee
     */
    public String getDept() {
        return dept;
    }

    /**
     * Method that sets department of an Employee
     * @param dept department of an Employee 
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Method that sets name of an Employee
     * @param name name of an Employee
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
