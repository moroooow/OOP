package Translator.Dictionary.DictionaryExceptions;

public class InvalidDataFormatException extends Exception{
    public InvalidDataFormatException(String message)
    {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
