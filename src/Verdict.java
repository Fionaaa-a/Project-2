/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Verdict {
    private String caseName;
    private String studentVerdict;
    private String reason;
    
    public Verdict(){
        this.caseName="null";
        this.studentVerdict="null";
        this.reason="null";
    }
    
    public Verdict(String caseName, String verdict, String reason){
        this.caseName=caseName;
        this.studentVerdict=verdict;
        this.reason=reason;
    }
    
    public void setCaseName(String caseName){
        this.caseName=caseName;
    }
    
    public String getCaseName(){
        return caseName;
    }
    
    public void setReason(String reason){
        this.reason=reason;
    }
    
    public String getReason(){
        return reason;
    }
    
    public void setStudentVerdict(String verdict){
        this.studentVerdict=verdict;
    }
    
    public String getStudentVerdict(){
        return studentVerdict;
    }
    
    public String toString(){
        return "...";
    }
}
