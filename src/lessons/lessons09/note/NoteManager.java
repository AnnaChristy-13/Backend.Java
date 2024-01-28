package lessons.lessons09.note;

import lessons.lessons06.UserInput;

public class NoteManager {

    UserInput ui = new UserInput();

    public Note createNote(){
        String noteName = ui.inputText("Введите имя заметки: ");
        String noteNumber = ui.inputText("Введите номер заметки: ");
        String noteDescription = ui.inputText("Введите текст заметки'");
        return new Note(noteName,noteNumber,noteDescription);
    }
}
