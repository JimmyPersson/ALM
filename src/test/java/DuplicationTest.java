import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicationTest {

    @Test
    void duplicationMath(){

        Duplication duplication = new Duplication();
        assertEquals(4, duplication.duplicate(2));
        assertNotEquals(3, duplication.duplicate(2));

    }
}