package Interface;
import PhonebookEntry;
import EntryExeption.EntryExeptions;
public interface CreateEntry {

    public PhonebookEntry create(String entry) throws EntryExeptions;
    
}
