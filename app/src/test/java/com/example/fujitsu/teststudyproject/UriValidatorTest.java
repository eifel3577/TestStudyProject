package com.example.fujitsu.teststudyproject;



import android.content.Context;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class UriValidatorTest {

    UriValidator uriValidator;
    Context mockContext;


    @Before
    public void setUp() throws Exception {
        mockContext = Mockito.mock(Context.class);
        uriValidator = new UriValidator(mockContext);
    }
}