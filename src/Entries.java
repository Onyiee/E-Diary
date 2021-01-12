import java.time.LocalDate;


public class Entries {
    private String entryTitle;
    private String entryBody;
    private LocalDate entryDate;

    public Entries(String entryTitle) {
        this.entryTitle = entryTitle;
        this.entryDate = LocalDate.now();
    }

    public String getEntryTitle() {

        return entryTitle;
    }

    public void setEntryTitle(String entryTitle) {

        this.entryTitle=entryTitle;
    }

    public LocalDate getLocalDate() {
        return entryDate;
    }

    public void setEntryBody(String entryBody) {

        this.entryBody=entryBody;
    }

    public String getEntryBody() {
        return entryBody;
    }

    public void updateEntryBody(String updatedEntryBody) {

        entryBody += updatedEntryBody;
    }
    public void deleteEntryBody() {
        entryBody = null;
    }
    public String displayEntry(){
        String entry = ("Title:"+getEntryTitle()+"\nDate:"+LocalDate.now()+"\nBody:"+getEntryBody());
        return entry;
    }

    @Override
    public String toString() {
        return displayEntry();
    }
}
