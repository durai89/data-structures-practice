package com.durai.ds;

import com.durai.ds.list.SingleLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SingleLinkedListTest {

    @Test
    public void linkedListTest() {
        SingleLinkedList<String> list = new SingleLinkedList<>();
        //Size
        assertTrue(list.size() == 0);

        //add
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        assertEquals(4, list.size());

        //reverse
        list.reverse();
        assertEquals(4, list.size());
        assertEquals("element4", list.get(0));
        assertEquals("element3", list.get(1));
        assertEquals("element2", list.get(2));
        assertEquals("element1", list.get(3));

        list.reverse();

        //add at specified index
        list.add("element3a", 2);
        assertEquals(5, list.size());
        assertEquals("element3a", list.get(2));
        assertEquals("element3", list.get(3));

        //remove first element
        list.remove();
        assertEquals(4, list.size());
        assertTrue(!list.contains("element1"));
        assertEquals("element2", list.get(0));

        //remove by object
        list.remove("element3");
        assertEquals(3, list.size());
        assertEquals("element2", list.get(0));
        assertEquals("element3a", list.get(1));
        assertEquals("element4", list.get(2));
    }
}
