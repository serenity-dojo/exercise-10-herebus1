package com.serenitydojo.exceptions;

import com.serenitydojo.WordCounter;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithExceptions {

    WordCounter wordCounter = new WordCounter();

    @Test
    public void shouldCountWordsInAString(){
       int numberOfWords = wordCounter.numberOfWordsIn("some string");

        assertThat(numberOfWords).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroForNull(){
      assertThat(wordCounter.numberOfWordsIn(null)).isEqualTo(0);
    }

    @Test
    public void shouldCountWordsInAFile() throws Exception, com.serenitydojo.FileHasNoWordsException {
        int numberOfWords = wordCounter.numberOfWordsInFile("src/main/resources/hello.txt");
    }

    @Test(expected = FileHasNoWordsException.class)
    public void shouldReportErrorWhenFileNotExists() throws Exception{
        int numberOfWords = wordCounter.numberOfWordsInFile("fileNotExist.txt");

        assertThat(numberOfWords).isEqualTo(0);
    }

    @Test(expected = FileHasNoWordsException.class)
    public void shouldThrowMeaningfulExceptionEmptyFile() throws Exception{
        wordCounter.numberOfWordsInFile("src/main/resources/noWords.txt");
    }
}
