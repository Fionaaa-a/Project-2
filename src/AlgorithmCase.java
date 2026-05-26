/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class AlgorithmCase extends EthicsCase {
    private String biasType;
    
    public AlgorithmCase(String caseTitle, String description, String biasType) {
        super(caseTitle, description, "Algorithm");
        this.biasType = biasType;
    }
    
    public String getBiasType() {
        return biasType;
    }
    
    public void getCaseType(){
        System.out.println("This is an Algorithm Case!");
    }
    
    public String toString() {
        return "placeholder text";
    }
}
