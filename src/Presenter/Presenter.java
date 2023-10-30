package Presenter;
import EntryExeption.EntryExeptions;
import PhoneBook.CreateEntryFirst;
import PhoneBook.PhonebookEntry;
import View.ConsoleView;

public class Presenter {
    private ConsoleView consoleView;
    private CreateEntryFirst createEntry;
    
    public Presenter() {
        this.consoleView = new ConsoleView();
        this.createEntry = new CreateEntryFirst();
    }

    public PhonebookEntry create() throws EntryExeptions{
        consoleView.Set("Введите данные через пробел: \n " + 
        "Фамилия Имя Отчество| дата рождения в формате dd.mm.yyyy|" +
        " номер телефона| пол(f - женский, m - мужской) \n");
        return createEntry.create(consoleView.Get(),6);
    }
   
}
