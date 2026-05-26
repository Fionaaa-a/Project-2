/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Represents a general ethics case.
 * This superclass stores common information shared
 * by all specific ethics case types.
 * @author Fiona and Ivy
 */
public class EthicsCase {
    private String caseTitle;
    private String description;
    private String category;
    public Verdict verdict;

    /**
     * Constructs an EthicsCase object.
     * @param caseTitle the title of the ethics case
     * @param description the description of the ethics case
     * @param category the category of the ethics case
     */
    public EthicsCase(String caseTitle, String description, String category) {
        this.caseTitle = caseTitle;
        this.description = description;
        this.category = category;
        this.verdict = new Verdict();
    }

    /**
     * Returns the title of the ethics case.
     * @return the case title
     */
    public String getCaseTitle() {
        return caseTitle;
    }

    /**
     * Returns the description of the ethics case.
     * @return the case description
     */
    public String getCaseDescription() {
        return description;
    }

    /**
     * Returns the category of the ethics case.
     * @return the case category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Displays the type of ethics case.
     */
    public void getCaseType() {
        System.out.println("This is an Ethics Case!");
    }

    /**
     * Returns a string representation of the ethics case.
     * @return combined case information
     */
    public String toString() {
        return this.getCaseTitle()
                + this.getCaseDescription()
                + this.getCategory();
    }
}