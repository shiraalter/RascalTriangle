package touro.alter;

import org.junit.Test;

import static org.junit.Assert.*;

public class RascalTest {

    @Test
    public void getValue() {
        //GIVEN
        Rascal rascal = new Rascal();
        //WHEN
       int val = rascal.getValue(1,1);
        //THEN
        assertEquals(val,1);

    }
}