package PhoneBook;
import EntryExeption.EntryDataExeption;
import EntryExeption.EntryExeptions;
import EntryExeption.EntryLengthExeption;
import java.util.Arrays;

import Interface.CreateEntry;

public class CreateEntryFirst implements CreateEntry {
    private String birthDate;
    private String [] entry, name;
    private Long phoneNumber;
    private char gender;
    
    /**
     * Создает запись телефонной книги (версия 1.0)
     */
    public CreateEntryFirst() {
    }
    
    @Override
    public PhonebookEntry create(String input, Integer numbersOfFields) throws EntryExeptions {
        Integer length = input.split(" ").length;
        if (length!=numbersOfFields) 
            throw new EntryLengthExeption("Неверное количество введенных данных", 
                                        length);
        this.entry = input.split(" ");
        this.name = new String[] {entry[0],entry[1],entry[2]};
        if (entry[3].length()!=10) 
            throw new EntryDataExeption("Неверная длина даты рождения", entry[3]);
        String[] arrayDate = entry[3].split("\\.");
        if ((arrayDate.length!=3)||(arrayDate[0].length()!=2)||
                (arrayDate[1].length()!=2)||(arrayDate[2].length()!=4)) 
            throw new EntryDataExeption("Дата рождения неверно делится на части .", entry[3]);
        try {
            for (int i = 0; i<3;i++) Integer.parseInt(arrayDate[i]);
                this.birthDate = entry[3];}
        catch (RuntimeException e) {
            throw new EntryDataExeption("Не парсится дата рождения", entry[3]);
        }
        try {
            this.phoneNumber = Long.parseLong(entry[4]);
        } catch (RuntimeException e) {
            throw new EntryDataExeption("Неверный формат номера телефона", entry[4]);
        } 
        if (!((entry[5].equalsIgnoreCase("f"))||
                    (entry[5].equalsIgnoreCase("m"))))
            throw new EntryDataExeption("Неверный формат поля данных \"ПОЛ\"", entry[5]);
        try {
          this.gender = entry[5].toLowerCase().charAt(0);  
        } catch (RuntimeException e) {
           throw new EntryDataExeption("Неверный формат поля данных \"ПОЛ\"", entry[5]);
        }
        return new PhonebookEntry(this.name, this.birthDate,this.phoneNumber,this.gender);
    }
    
}
