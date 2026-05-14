/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class IntellectualPropertyCase {
    private String ipType;
    
    public IntellectualPropertyCase(String caseTitle, String description, String ipType) {
        super(caseTitle, description);
        this.ipType = ipType;
    }
    
    public String getIpType() {
        return ipType;
    }
    
    public String toString() {
        return "placeholder text";
    }
}
