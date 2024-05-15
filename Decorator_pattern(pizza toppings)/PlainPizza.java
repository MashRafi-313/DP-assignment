class PlainPizza extends Pizza {
   
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 100.00; // base cost of plain pizza
    }
}
