package lessons.lessons09.note;

public class Note {
    String noteName;
    String noteNumber;
    String noteDescription;


    public Note(String noteName, String noteNumber, String noteDescription) {
        this.noteName = noteName;
        this.noteNumber = noteNumber;
        this.noteDescription = noteDescription;
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteName='" + noteName + '\'' +
                ", noteNumber='" + noteNumber + '\'' +
                ", noteDescription='" + noteDescription + '\'' +
                '}';
    }
}


