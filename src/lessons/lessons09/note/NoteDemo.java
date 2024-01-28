package lessons.lessons09.note;

import lessons.lessons09.note.NoteManager;

public class NoteDemo {
    public static void main(String[] args) {
        NoteManager manager = new NoteManager();

        System.out.println(manager.createNote());
    }
}
