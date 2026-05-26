/**
 *
 * @author user
 */
public class PrivacyCase extends EthicsCase {
    private String dataType;
    
    public PrivacyCase(String caseTitle, String description, String dataType) {
        super(caseTitle, description, "Privacy");
        this.dataType = dataType;
    }
    
    public String getDataType() {
        return dataType;
    }
    
    public void getCaseType(){
        System.out.println("This is a Privacy Case!");
    }
    
    @Override
    public String toString() {
        return "placeholder text";
    }
}
