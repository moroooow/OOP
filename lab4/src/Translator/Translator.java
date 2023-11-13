package Translator;

import Translator.Dictionary.Dictionary;

import java.io.FileReader;

public class Translator {
    private Dictionary dictionarySource;
    private FileReader source;
    public Translator(final Dictionary dictionarySource){
        this.dictionarySource = dictionarySource;
    }
    public void setDictionary(Dictionary dictionarySource) {
        this.dictionarySource = dictionarySource;
    }


}
