/**
 *
 * @author user
 */
public class MisinformationCase extends EthicsCase {
    private String mediaType;
    
    public MisinformationCase(String caseTitle, String description, String mediaType) {
        super(caseTitle, description, "Misinformation");
        this.mediaType = mediaType;
    }
    
    public String getMediaType() {
        return mediaType;
    }
    
    public void getCaseType(){
        System.out.println("This is a Misinformation Case!");
    }
    
    public String toString() {
        return "placeholder text";
    }
}
