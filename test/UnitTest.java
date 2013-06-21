import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
//Ensures that the units of measurements are functionally correct
public class UnitTest{

    @Test
    public void testToBaseForLength() {
        Assert.assertEquals(120,Unit.FEET.toBase(10));
    }

    @Test
    public void testToBaseForVolume() {
        Assert.assertEquals(60,Unit.OZ.toBase(10));

    }

    @Test
    public void testIsSameLengthCategoryTrue()
    {
        Assert.assertTrue(Unit.INCHES.isCompatible(Unit.YARD));
    }

    @Test
    public void testIsSameCategoryFalse()
    {
        Assert.assertFalse(Unit.OZ.isCompatible(Unit.FEET));
    }

    @Test
    public void testGetBaseUnit()
    {
        Assert.assertEquals(Unit.INCHES,Unit.YARD.getBaseUnit());
    }




}
