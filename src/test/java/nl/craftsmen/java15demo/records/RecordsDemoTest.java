package nl.craftsmen.java15demo.records;

import nl.craftsmen.java15demo.records.CoordinateRecord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Add:
 * --enable-preview
 *
 * to your IDE's test config first before running this test
 */
public class RecordsDemoTest {

    @Test
    public void test_record() {
        CoordinateRecord coordinateRecord = new CoordinateRecord(1,1);

        //you get the getters for free
        System.out.println(coordinateRecord.x());
        System.out.println(coordinateRecord.y());
        //toString delivers a nice, readable string
        System.out.println(coordinateRecord.toString());

        //equals works on content automatically
        CoordinateRecord anotherCoordinateRecord = new CoordinateRecord(1,1);
        assertEquals(coordinateRecord, anotherCoordinateRecord);
    }
}
