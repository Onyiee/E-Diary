public class Diary {
    private final Entries [] entries;
    private int numberOfEntries;

    public Diary(int numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
        entries= new Entries[numberOfEntries];

    }

    public int getNumberOfEntry() {
        return numberOfEntries;
    }

    public void addEntries(Entries entry) {
    for (int counter=0;counter<entries.length;counter++)
    {
        if(entries[counter]==null){
            entries[counter]=entry;
            break;
        }
    }

    }
    public Entries[] getEntry() {
        return entries;
    }

    public void deleteEntries(Entries entry) {
   for(int counter=0;counter<entries.length;counter++){
       if(entries[counter]==entry){
           entries[counter]=null;
           break;
       }
    }
    }

}
