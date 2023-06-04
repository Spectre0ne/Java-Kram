import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThrows;


public class neg_test{
    @Test
    public void testCalculateArea_positive() {
        Rechteck rechteck = new Rechteck(-4.0, 5.0);
        assertThrows(IllegalArgumentException.class, rechteck::calculateArea);
    }
    @Test

    public void testCalculatePerimeter_NegativeValues() {
        Rechteck rechteck = new Rechteck(-4.0, -5.0);
        assertThrows(IllegalArgumentException.class, rechteck::calculatePerimeter);
    }


    }

