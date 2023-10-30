package Interface;
import EntryExeption.EntryExeptions;
import PhoneBook.PhonebookEntry;
public interface CreateEntry {
/**
 * создание записи телефонной книги
 * @param input Строка введенная для создания новой записи в телефонной книге
 * @param numbersOfFields количество полей в записи
 * @return возвращает новую запись телефонной книги
 * @throws EntryExeptions некорректный ввод данных
 */
    public PhonebookEntry create(String input, Integer numbersOfFields) throws EntryExeptions;
    
}
