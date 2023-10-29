public class App {
    public static void main(String[] args) {
        String notes = "Баймурзаев Антон Сергеевич 14.05.1989 375297446847 m";
        String notes_one = "Баймурзаев Антон 14.05.1989 375297446847 m";
        String [] split_notes = notes.split(" ");
        System.out.println(split_notes[0]);
    }
}
