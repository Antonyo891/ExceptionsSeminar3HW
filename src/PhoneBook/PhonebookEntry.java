package PhoneBook;
public class PhonebookEntry {
    private String[] name;
    private String birthDate;
    private Long phoneNumber;
    private char gender;

    /**
     * Запись телефонной книги
     * @param name - Фамилия Имя Отчество
     * @param birthDate дата рождения формата dd.mm.yyyy
     * @param phoneNumber телефонный номер
     * @param gender пол (f - женский, m - мужской)
     */
    PhonebookEntry(String[] name, String birthDate, 
                    Long phoneNumber, char gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String[] getFullName() {
        return this.name;
    }

    public void setFullName(String[] name) {
        this.name = name;
    }

    public String getFirstName(){
        return this.name[1];
    }
    
    public String getLastName(){
        return this.name[0];
    }

    public String getSurName(){
        return this.name[2];
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "<" + getLastName() + "><" + getFirstName() + "><" +
        getSurName() + "><" + getBirthDate() + "><" +
            getPhoneNumber() + "><" + getGender() + ">";
    }

    
    
    
}
