import Translator.Dictionary.Dictionary;
import Translator.Dictionary.DictionaryExceptions.InvalidFileFormatException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Dictionary dict = new Dictionary();
        try
        {
            dict.setDictionaryFromFile("text.txt");
            System.out.println(dict.getTranslateByKey("I"));
        }
        catch (InvalidFileFormatException | IOException e)
        {
            System.out.println(e.getMessage());
        }

    }

}