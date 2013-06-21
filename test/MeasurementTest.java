import junit.framework.Assert;
import org.junit.Test;

//Ensures the functionality of measurements are correct
public class MeasurementTest {

        @Test
    public void testToBase()
    {
        Measurement yard = new Measurement(1,Unit.YARD);
        Assert.assertEquals(36,yard.ToBase().getValue());

    }


    @Test
    public void testEquals()
    {
         Measurement inches12=new Measurement(12,Unit.INCHES);
        Measurement feet1=new Measurement(1,Unit.FEET);

        Assert.assertEquals(true,inches12.equals(feet1));
    }

    @Test
    public void ShouldEqual1TBSPAnd3TSP()
    {
        Measurement tbsp1=new Measurement(1,Unit.TBSP);
        Measurement tsp3=new Measurement(3,Unit.TSP);

        Assert.assertEquals(true,tbsp1.equals(tsp3));
    }

    @Test
    public void ShouldEqual1OZAnd2TBSP()
    {
        Measurement oz1=new Measurement(1,Unit.OZ);
        Measurement tbsp2=new Measurement(2,Unit.TBSP);

        Assert.assertEquals(true, oz1.equals(tbsp2));
    }

    @Test
    public void ShouldEqual8OZAnd1CUP()
    {
        Measurement oz1=new Measurement(8,Unit.OZ);
        Measurement tbsp2=new Measurement(1,Unit.CUP);

        Assert.assertEquals(true,oz1.equals(tbsp2));
    }

    @Test
    public void shouldReturnFalseFor1InchAnd1Tsp()
    {
        Measurement inch1=new Measurement(1,Unit.INCHES);
        Measurement tsp1=new Measurement(1,Unit.TSP);

        Assert.assertFalse(inch1.equals(tsp1));
    }

    @Test
    public void shouldReturnFalseFor1FeetAnd1Tsp()
    {
        Measurement feet1=new Measurement(1,Unit.FEET);
        Measurement tsp1=new Measurement(1,Unit.TSP);

        Assert.assertFalse(feet1.equals(tsp1));
    }

    @Test
    public void shouldReturnFalseFor1YardAnd1Tsp()
    {
        Measurement yard1=new Measurement(1,Unit.YARD);
        Measurement tsp1=new Measurement(1,Unit.TSP);

        Assert.assertFalse(yard1.equals(tsp1));
    }

    @Test
    public void shouldEqual1KgAnd1000Gm(){
        Measurement kg1 = new Measurement(1, Unit.KG);
        Measurement gm1000 = new Measurement(1000, Unit.GM);

        Assert.assertTrue(kg1.equals(gm1000));
    }








}
