package classstructuremethods.note;

/*Teszteld az osztályod a NoteMain osztály main() metódusából!
A Note tartalmának megjelenítésekor használd a getNoteText() metódust!*/
public class NoteMain {

    public static void main(String[] args) {
        Note note = new Note();
        note.setName("name");
        note.setText("text");
        note.setTopic("topic");


        System.out.println(note.getNoteText());


    }


}
