package com.durai.ds;

import com.durai.ds.List.DLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DLinkedListTest {

    @Test
    public void linkedListTest() {
        DLinkedList<String> list = new DLinkedList<>();
        //Size
        assertTrue(list.size() == 0);

        //add
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        assertEquals(4, list.size());

        //remove first element
        list.remove();
        assertEquals(3, list.size());
        assertTrue(!list.contains("element1"));
        assertEquals("element2", list.get(0));

        //remove by object
        list.remove("element3");
        assertEquals(2, list.size());
        assertTrue(!list.contains("element1"));
        assertEquals("element2", list.get(0));
        assertEquals("element4", list.get(1));

    }
}
