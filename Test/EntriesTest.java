import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EntriesTest {
Entries entries;
    @BeforeEach
    void setUp() {
        entries= new Entries("diary1");
    }

    @AfterEach
    void tearDown() {
        entries=null;
    }
    @Test
    void testThatEntryTitleExists(){
        entries.getEntryTitle();
        assertEquals("diary1",entries.getEntryTitle());
    }
    @Test
    void testThatEntryTitleCanBeSet(){
        entries.setEntryTitle("diary");
        assertEquals("diary",entries.getEntryTitle());
    }
    @Test
    void testThatLocalDateAndTimeWorks(){
        entries.getLocalDate();
        assertNotNull(entries.getLocalDate());
        LocalDate localDate=LocalDate.now();
        assertEquals(localDate,entries.getLocalDate());
    }
    @Test
    void testThatEntryBodyCanBeSet(){
        entries.setEntryBody("My diary");
        assertEquals("My diary",entries.getEntryBody());
    }
    @Test
    void testThatEntryBodyCanBeUpdated(){
        entries.setEntryBody("My diary");
        entries.updateEntryBody(" is fine");
        String entry="My diary is fine";
        assertEquals(entry,entries.getEntryBody());
    }
   @Test
    void testThatEntryBodyCanBeDeleted(){
        entries.setEntryBody("My diary");
        entries.updateEntryBody(" is beautiful");
        assertNotNull(entries.getEntryBody());
        entries.deleteEntryBody();
        assertNull(entries.getEntryBody());
   }
}