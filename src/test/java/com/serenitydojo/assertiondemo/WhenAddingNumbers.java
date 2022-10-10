package com.serenitydojo.assertiondemo;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Percentage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Percentage.withPercentage;

public class WhenAddingNumbers {

    @Test
    public void addIntegersCorrectly(){
        int a = 1;
        int b = 3;
        int sum = a + b;

        //Assert.assertEquals(5, sum);
        //assertThat(sum).isEqualTo(4);
        assertThat(sum).isCloseTo(5, withPercentage(10));
    }

    @Test
    public void comparingStrings(){
        String color = "red";
        String otherColor = "Red";

        assertThat(color).isEqualToIgnoringCase(otherColor);

        String colors = "red,green,blue";
        assertThat(colors).containsPattern("[g|G]reen");
    }

    @Test
    public void assertionWithLists(){
        List<String> colors = Arrays.asList("red", "green", "blue");

        assertThat(colors).hasSize(3);
        assertThat(colors).contains("green");
        assertThat(colors).containsExactly("red","green","blue");
        assertThat(colors).containsExactlyInAnyOrder("blue","red","green");
        assertThat(colors).doesNotContain("yellow");
    }
}
