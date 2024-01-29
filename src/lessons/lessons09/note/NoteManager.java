package lessons.lessons09.note;


import lessons06.scanner.UserInput;

public class NoteManager {

    lessons06.scanner.UserInput ui = new UserInput();

    public Note createNote(){
        String noteName = ui.inputText("Введите имя заметки: ");
        String noteNumber = ui.inputText("Введите номер заметки: ");
        String noteDescription = ui.inputText("Введите текст заметки'");
        return new Note(noteName,noteNumber,noteDescription);
    }
}
