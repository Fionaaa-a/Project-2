/**
 * Represents an ethics case related to misinformation.
 * This class extends the EthicsCase superclass.
 * @author Fiona and Ivy
 */
public class MisinformationCase extends EthicsCase {
    private String mediaType;

    /**
     * Constructs a MisinformationCase object.
     * @param caseTitle the title of the ethics case
     * @param description the description of the ethics case
     * @param mediaType the type of media involved
     */
    public MisinformationCase(String caseTitle, String description, String mediaType) {
        super(caseTitle, description, "Misinformation");
        this.mediaType = mediaType;
    }

    /**
     * Returns the media type involved in the case.
     * @return the media type
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Displays the category of this ethics case.
     */
    public void getCaseType() {
        System.out.println("This is a Misinformation Case!");
    }

    /**
     * Returns a string representation of the object.
     * @return a string describing the misinformation case
     */
    public String toString() {
        return "placeholder text";
    }
}