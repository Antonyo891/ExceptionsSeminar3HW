package Presenter;
import EntryExeption.EntryExeptions;
import PhoneBook.CreateEntryFirst;
import PhoneBook.PhonebookEntry;
import View.ConsoleView;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
   
    public void saveEntry (String fileName, String filevalue){
        File file = new File(fileName+".txt");
        try (FileWriter fileWriter = new FileWriter(file, true);) {             
        if (file.length()==0) {
            fileWriter.write(filevalue+"\n");
        } else {
            fileWriter.append(filevalue);
            fileWriter.append("\n");
        }    
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
}
