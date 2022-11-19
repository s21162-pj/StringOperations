package com.example.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringOperationsTest {

    private StringOperations operations;

    @BeforeEach
    public void init() {
        operations = new StringOperations();
    }

    @AfterEach
    public void clean() {
        operations = null;
    }

    @Test
    public void reverse_test() {
        //GIVEN
        String input = "test";

        //WHEN
        String result = operations.reverse(input);

        //THEN
        assertThat("tset", is(result));
    }

    @Test
    public void reverse_should_be_null_test() {
        //GIVEN
        String input = null;

        //WHEN
        String result = operations.reverse(input);

        //THEN
        assertThat(null, is(result));
    }

    @Test
    public void concat_test() {
        //GIVEN
        String firstInput = "asa";
        String secondInput = "tr";

        //WHEN
        String result = operations.concat(firstInput, secondInput);

        //THEN
        assertThat("asatr", is(result));
    }

    @Test
    public void concat_should_be_null_test() {
        //GIVEN
        String firstInput = null;
        String secondInput = "tr";

        //WHEN
        String result = operations.concat(firstInput, secondInput);

        //THEN
        assertThat(null, is(result));
    }

    @Test
    public void isPalindrome_test() {
        //GIVEN
        String input = "asa";

        //WHEN
        boolean result = operations.isPalindrome(input);

        //THEN
        assertThat(true, is(result));
    }

    @Test
    public void isPalindrome_test2() {
        //GIVEN
        String input = "asa   ";

        //WHEN
        boolean result = operations.isPalindrome(input);

        //THEN
        assertThat(false, is(result));
    }
}
