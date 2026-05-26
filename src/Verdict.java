/**
 * The Verdict class represents the legal decision made by a student regarding a specific case.
 * It encapsulates the name of the case, the verdict reached, and the reasoning behind it.
 * @author Fiona and Ivy
 * @version 1.0
 */
public class Verdict {
    private String caseName;
    private String studentVerdict;
    private String reason;
    
    /**
     * Default constructor. 
     * Initializes all fields to the literal string "null" as default placeholders.
     */
    public Verdict(){
        this.caseName="null";
        this.studentVerdict="null";
        this.reason="null";
    }
    
    /**
     * Parameterized constructor to create a Verdict instance with specific details.
     * * @param caseName  The name or title of the legal case.
     * @param verdict   The decision or ruling determined by the student.
     * @param reason     The underlying justification for the verdict.
     */
    public Verdict(String caseName, String verdict, String reason){
        this.caseName=caseName;
        this.studentVerdict=verdict;
        this.reason=reason;
    }
    
    /**
     * Sets or updates the name of the case.
     * @param caseName The new name of the case.
     */
    public void setCaseName(String caseName){
        this.caseName=caseName;
    }
    
    /**
     * Retrieves the name of the case.
     * @return The current case name.
     */
    public String getCaseName(){
        return caseName;
    }
    
    /**
     * Sets or updates the reasoning behind the verdict.
     * @param reason The explanation for the decision.
     */
    public void setReason(String reason){
        this.reason=reason;
    }
    
    /**
     * Retrieves the reasoning for the verdict.
     * @return The reasoning string.
     */
    public String getReason(){
        return reason;
    }
    
    /**
     * Sets or updates the student's final verdict.
     * @param verdict The decision reached by the student.
     */
    public void setStudentVerdict(String verdict){
        this.studentVerdict=verdict;
    }
    
    /**
     * Retrieves the student's verdict.
     * @return The verdict string.
     */
    public String getStudentVerdict(){
        return studentVerdict;
    }
    
    /**
     * Returns a string representation of the Verdict object.
     * @return A status message indicating the verdict is processing.
     */
    @Override
    public String toString(){
        return "Processing verdict...";
    }
}