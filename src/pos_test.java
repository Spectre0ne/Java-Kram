import org.junit.Assert;
import org.junit.Test;



public class pos_test{
    @Test
    public void testCalculateArea_positive(){
        Rechteck rechteck = new Rechteck(4.0,5.0);
        double expectedArea = (4.0*5.0);
        double actualArea = rechteck.calculateArea();
        Assert.assertEquals(Double.doubleToLongBits(expectedArea), Double.doubleToLongBits(actualArea));



    }
    @Test
    public void CalculatePerimeter_positive(){
        Rechteck rechteck = new Rechteck(4.0,5.0);
        double expectedPerimeter = 2*(4.0+5.0);
        double actualPerimeter = rechteck.calculatePerimeter();
        Assert.assertEquals(Double.doubleToLongBits(expectedPerimeter), Double.doubleToLongBits(actualPerimeter));



    }
}
