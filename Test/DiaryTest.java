import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
Diary diary;
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
        diary=null;
    }

   @Test
    void testThatNumberOfEntriesCanBeSet(){
        diary = new Diary(10);
        diary.getNumberOfEntry();
        assertEquals(10,diary.getNumberOfEntry());
   }
   @Test
    void testThatEntryCanBeAdded(){
        diary = new Diary(2);
        Entries entries1= new Entries("Entry1");
        entries1.setEntryBody("Hello");
        Entries entries2= new Entries("Entry2");
        entries2.setEntryBody("World");
        diary.addEntries(entries1);
        diary.addEntries(entries2);
        assertEquals(entries1,diary.getEntry()[0]);
        assertEquals(entries2,diary.getEntry()[1]);

   }
    @Test
    void testThatEntryCanBeDeleted(){
        diary = new Diary(2);
        Entries entries1= new Entries("Entry1");
        entries1.setEntryBody("One");
        Entries entries2=  new Entries("Entry2");
        entries2.setEntryBody("two");
        diary.addEntries(entries1);
        diary.addEntries(entries2);
        diary.deleteEntries(entries1);
        assertNull(diary.getEntry()[0]);
        diary.deleteEntries(entries2);
        assertNull(diary.getEntry()[1]);
    }


}