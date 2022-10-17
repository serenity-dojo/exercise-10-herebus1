package com.serenitydojo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class WordCounter {

    public int numberOfWordsIn(String value) {
        if(value == null){
            return 0;
        }
        return value.split("\\W").length;
    }

    public int numberOfWordsInFile(String filename) throws IOException {
        try {
            String fileContent = Files.readString(Paths.get(filename));
            int wordCount = numberOfWordsIn(fileContent);
            if(wordCount == 0){
                throw new FileHasNoWordsException("No words found in the file " + filename);
            }
            return wordCount;
        }catch(NoSuchFileException noSuchFile){
            throw new FileHasNoWordsException("No words found in the non-existent file " + filename);
        }

    }
}
