import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Leap_Year_Test {


    @Test
    public void Year_Dividable_By_4_But_Not_Hundred_Should_Be_A_Leap_Year(){

        assertTrue(leapYear.isLeapYear(2004));

    }

    @Test
    public void Year_Dividable_By_4_Should_Be_A_Leap_Year(){
      assertTrue(leapYear.isLeapYear(2000));
      assertTrue(leapYear.isLeapYear(2008));
      assertTrue(leapYear.isLeapYear(1904));

    }

    @Test
    public void Year_Dividable_By_4_And_100_Should_Not_Be_A_Leap_Year(){
        assertFalse(leapYear.isLeapYear(1800));
    }


    @Test
    public void Year_Dividable_By_400_Should_Be_A_Leap_Year(){
        assertTrue(leapYear.isLeapYear(2000));
    }


    @Test
    public void Year_Not_Dividable_By_4_Should_Not_Be_A_Leap_Year(){
       assertFalse(leapYear.isLeapYear(2002));
    }

    @Test
    public void Year_Dividable_By_100_But_Not_400_Should_Not_Be_A_Leap_Year(){
        assertFalse(leapYear.isLeapYear(1900));
    }

    @Test
    public void Year_Dividable_By_4_Not_100_Or_Dividable_By_400_Is_A_Leap_Year(){
            assertTrue(leapYear.isLeapYear(2000));
            assertTrue(leapYear.isLeapYear(2012));
    }

    @Test
    public void Year_Not_Dividable_by_4_Or_Dividable_By_100_But_Not_400_Should_Not_Be_A_Leap_Year(){
        assertFalse(leapYear.isLeapYear(1900));
    }

    @Test
    public void Is_Leap_Year(){
        assertTrue(leapYear.isLeapYear(2000));

    }

}
