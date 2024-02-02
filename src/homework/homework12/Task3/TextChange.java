package homework12.Task3;

public class TextChange {



    public static String changeText (String text){

        String textWithChanges = " ";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar != '(' && currentChar != ')' && currentChar != '@') {
            textWithChanges = textWithChanges + currentChar;
            }


            
        }
        return textWithChanges;
    }
}
