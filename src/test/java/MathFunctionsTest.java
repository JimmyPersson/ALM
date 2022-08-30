import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathFunctionsTest {

    MathFunctions mathFunctions = new MathFunctions();

    @Test
    void duplicationMath(){
        assertEquals(4, mathFunctions.duplicate(2));
        assertNotEquals(3, mathFunctions.duplicate(2));

    }

    @Test
    void addition() {
        assertEquals(10, mathFunctions.addition(5,5));
        assertNotEquals(9, mathFunctions.addition(5,5));
    }
}