import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicationTest {

    Duplication duplication = new Duplication();

    @Test
    void duplicationMath(){
        assertEquals(4, duplication.duplicate(2));
        assertNotEquals(3, duplication.duplicate(2));

    }

    @Test
    void addition() {
        assertEquals(10, duplication.addition(5,5));
        assertNotEquals(9, duplication.addition(5,5));
    }
}