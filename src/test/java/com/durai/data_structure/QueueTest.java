package com.durai.data_structure;

import com.durai.data_structure.stack.DStack;
import com.durai.data_structure.stack.DynamicArrayBackedStack;
import com.durai.data_structure.stack.ListBackedStack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StackTest {

    @Test
    public void dynamicArrayBackedStackTest() {
        DStack<String> stack = new DynamicArrayBackedStack<String>();
        //Size
        assertTrue(stack.size() == 0);

        //Push
        stack.push("Stack Push Test1");
        stack.push("Stack Push Test2");
        stack.push("Stack Push Test3");
        stack.push("Stack Push Test4");
        assertTrue(stack.size() == 4);

        //peek
        assertEquals("Stack Push Test4", stack.peek());

        //contains
        assertTrue(stack.contains("Stack Push Test1"));
        assertTrue(stack.contains("Stack Push Test2"));
        assertTrue(stack.contains("Stack Push Test3"));
        assertTrue(stack.contains("Stack Push Test4"));

        //Index
        assertEquals(0, stack.indexOf("Stack Push Test1"));
        assertEquals(1, stack.indexOf("Stack Push Test2"));
        assertEquals(2, stack.indexOf("Stack Push Test3"));
        assertEquals(3, stack.indexOf("Stack Push Test4"));

        //Pop
        stack.pop();
        assertTrue(stack.size() == 3);

        //Get Element
        assertEquals("Stack Push Test2", stack.get("Stack Push Test2"));
        assertTrue(stack.size() == 1);
        assertEquals("Stack Push Test1", stack.get("Stack Push Test1"));
        assertTrue(stack.size() == 0);

    }

    @Test
    public void listBackedStackTest() {
        DStack<String> stack = new ListBackedStack<String>();
        //Size
        assertTrue(stack.size() == 0);

        //Push
        stack.push("Stack Push Test1");
        stack.push("Stack Push Test2");
        stack.push("Stack Push Test3");
        stack.push("Stack Push Test4");
        assertTrue(stack.size() == 4);

        //peek
        assertEquals("Stack Push Test4", stack.peek());

        //contains
        assertTrue(stack.contains("Stack Push Test1"));
        assertTrue(stack.contains("Stack Push Test2"));
        assertTrue(stack.contains("Stack Push Test3"));
        assertTrue(stack.contains("Stack Push Test4"));

        //Index
        assertEquals(0, stack.indexOf("Stack Push Test1"));
        assertEquals(1, stack.indexOf("Stack Push Test2"));
        assertEquals(2, stack.indexOf("Stack Push Test3"));
        assertEquals(3, stack.indexOf("Stack Push Test4"));

        //Pop
        stack.pop();
        assertTrue(stack.size() == 3);

        //Get Element
        assertEquals("Stack Push Test2", stack.get("Stack Push Test2"));
        assertTrue(stack.size() == 1);
        assertEquals("Stack Push Test1", stack.get("Stack Push Test1"));
        assertTrue(stack.size() == 0);

    }
}
