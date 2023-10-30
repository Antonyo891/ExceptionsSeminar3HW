package View.EntryExeption;

public class EntryLengthExeption extends EntryExeptions{
    
    private Integer length;


    public EntryLengthExeption(String message, Integer length) {
        super(message);
        this.length = length;
      }

    public Integer getLength() {
        return this.length;
    }
    
}
