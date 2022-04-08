package kyrs.Cat;

public class Loader {
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        System.out.println(cat.getWeight());
        cat1.Copy(cat.getWeight());
        System.out.println(cat1.getWeight());
    }
}
