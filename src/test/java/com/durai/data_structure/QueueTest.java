package com.durai.data_structure;

import com.durai.data_structure.queue.DQueue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QueueTest {

    @Test
    public void dynamicArrayBackedStackTest() {
        DQueue<String> queue = new DQueue<String>();
        //Size
        assertTrue(queue.size() == 0);

        //enqueue
        queue.enQueue("element1");
        queue.enQueue("element2");
        queue.enQueue("element3");
        queue.enQueue("element4");
        assertTrue(queue.size() == 4);

        //dequeue
        assertEquals("element1", queue.deQueue());
        assertTrue(queue.size() == 3);

        //index
        assertEquals(0, queue.indexOf("element2"));
        assertEquals(1, queue.indexOf("element3"));
        assertEquals(2, queue.indexOf("element4"));

        //Get Element
        assertEquals("element2", queue.get("element2"));
        assertTrue(queue.size() == 2);
        assertEquals("element4", queue.get("element4"));
        assertTrue(queue.size() == 0);

    }
}
