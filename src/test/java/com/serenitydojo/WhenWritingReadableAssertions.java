package com.serenitydojo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWritingReadableAssertions {

    @Test
    public void whenTwoNumbersAreEqual() {
        int a = 5;
        int b = 10;
        int c = 20;
        int sum = a + b + c;

        // Check that the sum is 35
        assertThat(true).isFalse();
    }

    @Test
    public void whenANumberIsGreaterThanAnother() {
        int a = 5;
        int b = 10;
        int c = 20;
        int sum = a + b + c;

        // Check that the sum is greater than 30
        assertThat(true).isFalse();
    }

    @Test
    public void whenANumberIsInACertainInterval() {
        int a = 5;
        int b = 10;
        int sum = a + b;

        // Check that the sum is between 10 and 20
        assertThat(true).isFalse();
    }

    @Test
    public void whenANumberIsCloseToAnotherValue() {
        double roughlyOneHundred = 99;

        // Check that the sum is within 10% of 100
        assertThat(true).isFalse();
    }

    @Test
    public void whenAStringIsEqualToAnother() {
        String color = "red";

        // Check that the string has a value of 'red'
        assertThat(true).isFalse();
    }

    @Test
    public void whenAStringIsEqualIgnoringCase() {
        String color = "RED";

        // Check that the string has a value of 'red' (ignoring case)
        assertThat(true).isFalse();
    }

    @Test
    public void whenAStringContainsOnlyDigits() {
        String licenseNumber = "12345";

        // Check that the value contains only digits
        assertThat(true).isFalse();
    }

    @Test
    public void whenAStringStartsWithAValue() {
        String colors = "red,green,blue";

        // Check that the value starts with 'red'
        assertThat(true).isFalse();
    }

    @Test
    public void whenAStringEndsWithAValue() {
        String colors = "red,green,blue";

        // Check that the value ends with 'blue'
        assertThat(true).isFalse();
    }


    @Test
    public void whenAListContainsAValue() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains "red"
    }

    @Test
    public void whenAListContainsASetOfValues() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains "red" and "blue
        assertThat(true).isFalse();
    }

    @Test
    public void whenAListHasASpecificSize() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains 3 elements
        assertThat(true).isFalse();
    }

    @Test
    public void whenAListContainsExactlyASetOfValues() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains "red","green" and "blue"
        assertThat(true).isFalse();
    }

    @Test
    public void whenAListContainsExactlyASetOfValuesInAnyOrder() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains "red","blue" and "green" in any order
        assertThat(true).isFalse();
    }




}
