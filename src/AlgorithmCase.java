/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class AlgorithmCase {
    private String biasType;
    
    public AlgorithmCase(String caseTitle, String description, String biasType) {
        super(caseTitle, description);
        this.biasType = biasType;
    }
    
    public String getBiasType() {
        return biasType;
    }
    
    public String toString() {
        return "placeholder text";
    }
}
