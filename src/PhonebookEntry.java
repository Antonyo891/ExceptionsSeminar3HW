public class Phonebook {
    private String[] name;
    private String birthDate;
    private Integer numberId, phoneNumber;
    private char gender;


    Phonebook(String[] name, String birthDate, Integer numberId, Integer phoneNumber, char gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.numberId = numberId;
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

    public Integer getNumberId() {
        return this.numberId;
    }

    public void setNumberId(Integer numberId) {
        this.numberId = numberId;
    }

    public Integer getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
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
            getPhoneNumber() + "><" + getGender();
    }

    
    
    
}
