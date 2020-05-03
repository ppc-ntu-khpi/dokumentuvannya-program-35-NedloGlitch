package domain;
/**
 * Sub class Editor extending Artist
 */
public class Editor extends Artist {

    /**
     * Method that you can use to add an Editor with params
     * @param electronicEditing (True/False) - does Editor have permission for electronic editing? 
     * (Electronic editing permission - later reffered as EEP)
     * 
     * @see Artist#Artist(String[], String, String, int, String) For skiils (Artist)
     * @see Employee#Employee(String, String, int, String) For other params (Employee)
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Method that you can use to add Editor with EEP, ID and list of skills
     * @param electronicEditing boolean(True/False) - does Editor have permission for electronic editing? 
     * @see Artist#Artist(String[]) skiils (Artist)
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Method that you can use to add Editor with EEP, ID and placeholder for skills
     * @param electronicEditing boolean(True/False) - does Editor have permission for electronic editing? 
     * @see Artist#Artist(String[]) skiils (Artist)
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Method that you can use to add Editor with EEP as true by default, ID and placeholder for skills
     * @see Artist#Artist() skiils (Artist)
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    @Override
     /**
     * Method that converts Editor class to String representation
     */
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Method that returns current EEP of an Editor
     * @return current EEP of an Editor
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Method that sets the EEP of an Editor
     * @param electronic boolean - does Editor have permission for electronic editing? (True/False)
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}

/* @param skiils skill of an Editor
* @param name name of an Editor
* @param jobTitle job assigned to Editor
* @param level access level of an Employee, can be 1,2,3. Default - 1
* @param dept department of an Editor

@param name, jobTitle, hh @param level , @param dept , @param ID - @see Employee#Employee(String, String, int, String) Employee_params
* */