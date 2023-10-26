public abstract class Decide {
    private double result = 0;


    public double first(double weight, double height, double age) {
        return (10*weight + 6.25*height-5*age)-161;
    }

    public double second(double weight, double height, double age) {
        result = (10*weight + 6.25*height-5*age)+5;
        return result;
    }

    public double third(double weight, double height) {
        double result = weight/(Math.pow(height/100,2));
        return result;
    }

    public double fourth(double weight){
        double result = weight*30; // enter formula
        return result;
    }

    public abstract double getWeight();

    public abstract double getHeight();

    public abstract double getAge();
}