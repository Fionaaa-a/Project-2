/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class PrivacyCase {
    private String dataType;
    
    public PrivacyCase(String caseTitle, String description, String dataType) {
        super(caseTitle, description);
        this.dataType = dataType;
    }
    
    public String getDataType() {
        return dataType;
    }
    
    @Override
    public String toString() {
        return "placeholder text";
    }
}
