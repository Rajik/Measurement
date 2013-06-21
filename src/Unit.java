//Understands the relationship between units of measurement
public enum Unit {

    INCHES(Category.LENGTH, 1), FEET(Category.LENGTH, 12), YARD(Category.LENGTH, 36), TSP(Category.VOLUME, 1), TBSP(Category.VOLUME, 3), OZ(Category.VOLUME, 6), CUP(Category.VOLUME, 48),GM(Category.WEIGHT,1),KG(Category.WEIGHT,1000);

    private int conversionFactor;
    private Category category;

    private Unit(Category category, int conversionFactor) {
        this.category = category;
        this.conversionFactor = conversionFactor;
    }

    public int toBase(int value) {
        return value * conversionFactor;
    }

    public Unit getBaseUnit()
    {
        if(category==Category.LENGTH)
            return Unit.INCHES;
        else if(category==Category.VOLUME)
            return Unit.TSP;
        return Unit.GM;



    }

    public boolean isCompatible(Unit other) {
        return this.category == other.category;

    }

}
