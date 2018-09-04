package com.durai.data_structure;

import com.durai.data_structure.stack.DStack;
import com.durai.data_structure.stack.DynamicArrayBackedStack;
import com.durai.data_structure.stack.ListBackedStack;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StackTest {

    @Test
    public void dynamicArrayBackedStackTest() {
        DStack<String> stack = new DynamicArrayBackedStack<String>();
        //Size
        assertTrue(stack.size() == 0);

        //Push
        stack.push("element1");
        stack.push("element2");
        stack.push("element3");
        stack.push("element4");
        assertTrue(stack.size() == 4);

        //peek
        assertEquals("element4", stack.peek());

        //contains
        assertTrue(stack.contains("element1"));
        assertTrue(stack.contains("element2"));
        assertTrue(stack.contains("element3"));
        assertTrue(stack.contains("element4"));

        //Index
        assertEquals(0, stack.indexOf("element1"));
        assertEquals(1, stack.indexOf("element2"));
        assertEquals(2, stack.indexOf("element3"));
        assertEquals(3, stack.indexOf("element4"));

        //Pop
        stack.pop();
        assertTrue(stack.size() == 3);

        //Get Element
        assertEquals("element2", stack.get("element2"));
        assertTrue(stack.size() == 1);
        assertEquals("element1", stack.get("element1"));
        assertTrue(stack.size() == 0);

    }

    @Test
    public void listBackedStackTest() {
        DStack<String> stack = new ListBackedStack<String>();
        //Size
        assertTrue(stack.size() == 0);

        //Push
        stack.push("element1");
        stack.push("element2");
        stack.push("element3");
        stack.push("element4");
        assertTrue(stack.size() == 4);

        //peek
        assertEquals("element4", stack.peek());

        //contains
        assertTrue(stack.contains("element1"));
        assertTrue(stack.contains("element2"));
        assertTrue(stack.contains("element3"));
        assertTrue(stack.contains("element4"));

        //Index
        assertEquals(0, stack.indexOf("element1"));
        assertEquals(1, stack.indexOf("element2"));
        assertEquals(2, stack.indexOf("element3"));
        assertEquals(3, stack.indexOf("element4"));

        //Pop
        stack.pop();
        assertTrue(stack.size() == 3);

        //Get Element
        assertEquals("element2", stack.get("element2"));
        assertTrue(stack.size() == 1);
        assertEquals("element1", stack.get("element1"));
        assertTrue(stack.size() == 0);

    }
}
