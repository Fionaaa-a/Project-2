/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class EthicsCase {
    private String caseTitle;
    private String description;
    private String category;
    public Verdict verdict;
    
    public EthicsCase(String caseTitle, String description, String category){
        this.caseTitle=caseTitle;
        this.description=description;
        this.category=category;
    }
    
    public String getCaseTitle(){
        return caseTitle;
    }
    
    public String getCaseDescription(){
        return description;
    }
    
    public String getCategory(){
        return category;
    }
    
    public String toString(){
        return "...";
    }
}
