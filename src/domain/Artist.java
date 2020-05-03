package domain;
/**
 * Sub class Artist extending Employee
 */
public class Artist extends Employee {

    /**
     * Method that you can use to add an Artist with params
     * @param skiils list of skills of an Artist
     * 
     * @see Employee#Employee(String, String, int, String) For other params (Employee)
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Method that you can use to add an Artist with ID and list of skills
     * @param skiils list of skills of an Artist
     * @see Employee#Employee() ID (Employee)
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    /**
     * Method that you can use to add an Artist with ID and placeholder for skills
     * @see Employee#Employee() ID (Employee)
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    @Override
     /**
     * Method that converts Artist class to String representation 
     */
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * Method that returns string of current skills of an Artist
     * @return string of current skills of an Artist
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Method that sets skills of an Artist
     * @param skills skills of an Artist
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Method that retuns a list(massive) of current skills of an Artist
     * @return list(massive) of current skills of an Artist
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}

/*   @param name name of an Artist
     * @param jobTitle job assigned to Artist
     * @param level access level of an Artist
     * @param dept department of an Artist
     */