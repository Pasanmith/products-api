package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable{

    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct(){

    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions){
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg(){
        return weightKg;
    }

    public String getDimensions(){
        return dimensions;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String getSummary(){
        return "Product: Name: " + getName()
                + "| Price: " + getPrice()
                + "| Weight: " + weightKg
                + "Dimensions: " + dimensions;
    }

    public void applyDiscount(double rate){
        double cappedRate = Math.min(0.2, rate);
        discountedPrice = getPrice() * (1 - cappedRate);

    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
}
