import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HighOrderKtTest {

    @Test
    fun `when chosen operation is Addition, then both values, should bem summed`(){
        val expectedValue = "5.0"

        val selectedFunction = chooseOperation(Operation.ADDITION)
        val result = doOperation(2.0,3.0, selectedFunction)

        assertEquals(expectedValue, result)
    }

    @Test
    fun `when chosen operation is Subtraction, then both values, should bem subtracted`(){
        val expectedValue = "-1.0"

        val selectedFunction = chooseOperation(Operation.SUBTRACTION)
        val result = doOperation(2.0,3.0, selectedFunction)

        assertEquals(expectedValue, result)
    }

    @Test
    fun `when chosen operation is Multiplication, then both values, should been multiplied`(){
        val expectedValue = "6.0"

        val selectedFunction = chooseOperation(Operation.MULTIPLICATION)
        val result = doOperation(2.0,3.0, selectedFunction)

        assertEquals(expectedValue, result)
    }

    @Test
    fun `when chosen operation is Division, then both values, should bem divided`(){
        val expectedValue = "1.0"

        val selectedFunction = chooseOperation(Operation.DIVISION)
        val result = doOperation(3.0,3.0, selectedFunction)

        assertEquals(expectedValue, result)
    }

}