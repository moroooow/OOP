package Translator.Dictionary;

import Translator.Dictionary.DictionaryExceptions.InvalidFileFormatException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Dictionary {
    private HashMap<String[],String> dictionary;

    

    public Dictionary(){
        this.dictionary = new HashMap<>();
    }
    public HashMap<String[], String> getDictionary()
    {
        return dictionary;
    }
    public void setDictionaryFromFile(String path) throws InvalidFileFormatException, IOException {
        FileDictionaryReader file = new FileDictionaryReader(path);
        this.dictionary = file.readDictionary();
    }
    public String getTranslateByKey(final String key)
    {
        return dictionary.get(key.toLowerCase());
    }
    static class FileDictionaryReader {
        private final static String EXTENSION_TXT="txt";
        private final static char DELIMITER='|';
        private final FileReader source;
        public FileDictionaryReader(String path) throws InvalidFileFormatException, FileNotFoundException {
            if(!checkExtension(path))
            {
                throw new InvalidFileFormatException("INVALID FILE FORMAT");
            }
            source = new FileReader(path);
        }
        private static boolean checkExtension(String str)
        {
            int i = str.lastIndexOf('.');
            if(i<=0)
            {
                return false;
            }
            return str.substring(i + 1).equals(EXTENSION_TXT);
        }

        public HashMap<String[],String> readDictionary() throws IOException {
            BufferedReader br = new BufferedReader(source);
            String line;
            HashMap<String[],String> tmp = new HashMap<>();
            while((line = br.readLine())!=null)
            {
                line = line.toLowerCase();
                long countOfDelimiter =  countOfChar(line,DELIMITER);
                if(countOfDelimiter != 1)
                {
                    continue;
                }
                int posOfDelimiter = line.lastIndexOf(DELIMITER);

                String key = line.substring(0,posOfDelimiter-1).trim();
                String value = line.substring(posOfDelimiter+1).trim();
                tmp.put(key.split(" "),value);
            }
            return tmp;
        }
        private static long countOfChar(final String str,char ch)
        {
            return str.chars()
                    .filter(c->c == ch)
                    .count();
        }

    }
}

