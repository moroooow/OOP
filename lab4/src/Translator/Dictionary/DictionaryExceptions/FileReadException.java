package Translator.Dictionary.DictionaryExceptions;

public class FileReadException extends Exception{
    public FileReadException(String message)
    {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
