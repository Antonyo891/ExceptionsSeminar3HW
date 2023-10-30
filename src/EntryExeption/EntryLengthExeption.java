package EntryExeption;

public class EntryLengthExeption extends EntryExeptions{
    
    private Integer length;

/**
 * Ошибка количества данных
 */
    public EntryLengthExeption(String message, Integer length) {
        super(message);
        this.length = length;
      }

    public Integer getLength() {
        return this.length;
    }
    
}
