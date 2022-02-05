package com.codeCoverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMessages {

    @Test
    public void testNameValidName()
    {
        Messages obj = new Messages();
        Assertions.assertEquals("Hello Java!", obj.getMessage("Java"));
    }

    @Test
    public void testNameBlank()
    {
        Messages obj = new Messages();
        Assertions.assertEquals("Please Provide a name!", obj.getMessage(""));
    }

    @Test
    public void testNameNull()
    {
        Messages obj = new Messages();
        Assertions.assertEquals("Please Provide a name!", obj.getMessage(null));
    }

}
