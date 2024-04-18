import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator sut;
    @BeforeEach
    public void setUP(){
        sut = new Calculator();
    }
    @AfterEach
    public void tearDown(){
        sut = null;
    }
    @Test
    public void testPlus(){
        //arrange
        int a = 1, b = 2, expected = 3;
        //act
        int actual = sut.plus.apply(a,b);
        //assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinus(){
        //arrange
        int a = 2, b = 1, expected = 1;
        //act
        int actual = sut.minus.apply(a,b);
        //assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMultiply(){
        //arrange
        int a = 2, b = 5, expected = 10;
        //act
        int actual = sut.multiply.apply(a,b);
        //assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDivide(){
        //arrange
        int a = 10, b = 2, expected = 5;
        //act
        int actual = sut.divide.apply(a,b);
        //assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDivideByZero(){
        //arrange
        int a = 10, b = 0;
        Class<ArithmeticException> exceptionClass = ArithmeticException.class;
        //assert and act
        Assertions.assertThrows(exceptionClass, () -> sut.divide.apply(a, b));
    }
}
