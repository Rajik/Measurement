//Understands the different units of measurement
public class Measurement {

    private int value;
    private Unit unit;

    public Measurement(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }


    public int getValue() {
        return value;
    }

    public Measurement ToBase() {

        return new Measurement(unit.toBase(value), unit.getBaseUnit());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Measurement that = (Measurement) obj;

        return (this.unit.isCompatible(that.unit) && this.ToBase().value == that.ToBase().value);


    }

    @Override
    public int hashCode() {
        return value;
    }


    public Measurement add(Measurement addend) throws Exception{
        Measurement thisToBase=this.ToBase();
        Measurement addendToBase=addend.ToBase();

            if(!thisToBase.unit.isCompatible(addendToBase.unit))
            {
               // throw new
            }

        return new Measurement(thisToBase.value + addendToBase.value, thisToBase.unit);
    }
}
