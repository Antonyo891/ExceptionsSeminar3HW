package PhoneBook;
import EntryExeption.EntryDataExeption;
import EntryExeption.EntryExeptions;
import EntryExeption.EntryLengthExeption;
import java.util.Arrays;

import Interface.CreateEntry;

public class CreateEntryFirst implements CreateEntry {
    private String input, birthDate;
    private String [] entry, name;
    private Integer numbersOfFields, phoneNumber;
    private char gender;
    

    @Override
    public PhonebookEntry create(String input, Integer numbersOfFields) throws EntryExeptions {
        Integer length = input.split(" ").length;
        if (length!=numbersOfFields) 
            throw new EntryLengthExeption("Неверное количество введенных данных", 
                                        length);
        this.entry = input.split(" ");
        this.name = new String[] {entry[0],entry[1],entry[2]};
        if (entry[4].length()!=10) 
            throw new EntryDataExeption("Неверный формат даты рождения", entry[4]);
        String[] arrayDate = entry[4].split(".");
        if ((arrayDate.length!=3)||(arrayDate[0].length()!=2)||
                (arrayDate[1].length()!=2)||(arrayDate[2].length()!=4)) 
            throw new EntryDataExeption("Неверный формат даты рождения", entry[4]);
        try {
            for (int i = 0; i<3;i++) Integer.parseInt(arrayDate[i]);
                this.birthDate = entry[4];}
        catch (RuntimeException e) {
            throw new EntryDataExeption("Неверный формат даты рождения", entry[4]);
        }
        try {
            this.phoneNumber = Integer.parseInt(entry[5]);
        } catch (RuntimeException e) {
            throw new EntryDataExeption("Неверный формат номера телефона", entry[5]);
        } 
        if (!((entry[6].equalsIgnoreCase("f"))&
                    (entry[6].equalsIgnoreCase("m"))))
            throw new EntryDataExeption("Неверный формат поля данных \"ПОЛ\"", entry[6]);
        try {
          this.gender = entry[6].toLowerCase().charAt(0);  
        } catch (RuntimeException e) {
           throw new EntryDataExeption("Неверный формат поля данных \"ПОЛ\"", entry[6]);
        }
        return new PhonebookEntry(this.name, this.birthDate,this.phoneNumber,this.gender);
    }
    
}
