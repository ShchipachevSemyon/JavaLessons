package kyrs.Cat;

public class Cat {
    public static final int NUMBER_OF_EYES = 2;
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;
    private static int quantity;
    private double originWeight;
    private double weight;
    private double meal;
    private String name;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        Quantity();
    }

    public Cat(String name) {
        this();
        this.name = name;

    }

    public void Copy(double weight){
        this.weight = weight;
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
        if (weight < MIN_WEIGHT) {
            quantity--;
        }
    }

    public void toilet() {
        weight = weight - 100;
        if (weight < MIN_WEIGHT) {
            quantity--;
        }
    }

    public Double feed(Double amount) {
        weight = weight + amount;
        meal = amount;
        if (weight > MAX_WEIGHT) {
            quantity--;
        }
        return meal;
    }

    public static void Quantity() {
        quantity++;
    }

    public static int getQuantity() {
        return quantity;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public double getMeal() {

        return meal;
    }

    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}
