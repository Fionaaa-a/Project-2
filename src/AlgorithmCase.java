/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Represents an ethics case related to algorithms and AI bias.
 * This class extends the EthicsCase superclass.
 * @author Fiona and Ivy
 */
public class AlgorithmCase extends EthicsCase {
    // Stores the type of algorithm bias
    private String biasType;

    /**
     * Constructs an AlgorithmCase object.
     * @param caseTitle the title of the ethics case
     * @param description the description of the ethics case
     * @param biasType the type of bias involved in the case
     */
    public AlgorithmCase(String caseTitle, String description, String biasType) {
        super(caseTitle, description, "Algorithm");
        this.biasType = biasType;
    }

    /**
     * Returns the type of bias in the algorithm case.
     * @return the bias type
     */
    public String getBiasType() {
        return biasType;
    }

    /**
     * Displays the category of this ethics case.
     */
    public void getCaseType() {
        System.out.println("This is an Algorithm Case!");
    }

    /**
     * Returns a string representation of the object.
     * @return a string describing the algorithm case
     */
    public String toString() {
        return "placeholder text";
    }
}
