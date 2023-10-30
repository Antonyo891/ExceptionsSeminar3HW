package EntryExeption;

public class EntryDataExeption extends EntryExeptions {

    String data;

    public EntryDataExeption(String message, String data) {
        super(message);
        this.data = data; 
    }


    public String getdata() {
        return this.data;
    }
    
}
