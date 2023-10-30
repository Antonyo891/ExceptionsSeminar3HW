import Interface.View;
import PhoneBook.PhonebookEntry;
import Presenter.Presenter;
import View.ConsoleView;
import java.io.File;
import java.io.FileWriter;

import EntryExeption.EntryDataExeption;
import EntryExeption.EntryLengthExeption;

public class App {
    public static void main(String[] args) {
        PhonebookEntry entry;
        View view = new ConsoleView();
        boolean repeat = true;
        view.Set("Начало выполнения программы");
        Presenter presenter = new Presenter();
        while (repeat) {
        try {
            entry = presenter.create();
            repeat = false;
            presenter.saveEntry(entry.getLastName(),entry.toString());
            System.out.println("Файл " + entry.getLastName() + 
             " успешно сохранен");
        } 
        catch (EntryDataExeption e) {
            System.out.print(e);
            System.out.println(e.getdata());
            e.printStackTrace();
        }
        catch (EntryLengthExeption e) {
            System.err.print(e);
            System.out.println(e.getLength());
            e.printStackTrace();
        }
        
        }
    }
}
