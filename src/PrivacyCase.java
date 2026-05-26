/**
 * Represents an ethics case related to privacy issues.
 * This class extends the EthicsCase superclass.
 * @author Fiona and Ivy
 */
public class PrivacyCase extends EthicsCase {
    private String dataType;

    /**
     * Constructs a PrivacyCase object.
     * @param caseTitle the title of the ethics case
     * @param description the description of the ethics case
     * @param dataType the type of data involved
     */
    public PrivacyCase(String caseTitle, String description, String dataType) {
        super(caseTitle, description, "Privacy");
        this.dataType = dataType;
    }

    /**
     * Returns the data type involved in the case.
     * @return the data type
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Displays the category of this ethics case.
     */
    public void getCaseType() {
        System.out.println("This is a Privacy Case!");
    }

    /**
     * Returns a string representation of the object.
     * @return a string describing the privacy case
     */
    @Override
    public String toString() {
        return "placeholder text";
    }
}