/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Represents an ethics case related to intellectual property issues.
 * This class extends the EthicsCase superclass.
 * @author Fiona and Ivy
 */
public class IntellectualPropertyCase extends EthicsCase {
    // Stores the type of intellectual property issue
    private String ipType;

    /**
     * Constructs an IntellectualPropertyCase object.
     * @param caseTitle the title of the ethics case
     * @param description the description of the ethics case
     * @param ipType the type of intellectual property issue
     */
    public IntellectualPropertyCase(String caseTitle, String description, String ipType) {
        super(caseTitle, description, "Intellectual Property");
        this.ipType = ipType;
    }

    /**
     * Returns the intellectual property type.
     * @return the intellectual property type
     */
    public String getIpType() {
        return ipType;
    }

    /**
     * Displays the category of this ethics case.
     */
    public void getCaseType() {
        System.out.println("This is an Intellectual Property Case!");
    }

    /**
     * Returns a string representation of the object.
     * @return a string describing the intellectual property case
     */
    public String toString() {
        return "placeholder text";
    }
}