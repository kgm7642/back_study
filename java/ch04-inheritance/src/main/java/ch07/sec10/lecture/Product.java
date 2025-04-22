package ch07.sec10.lecture;

public abstract class Product {
    private int nonStaticField;
    private int staticField;

    public Product() {
    }

    public abstract void abstMethod();
    public void nonStaticMethod() {
        System.out.println("추상클래스안의 nonStaticMethode() 호출됨 !");
    }

    public static void staticMethod() {
        System.out.println("추상클래스안의 staticMethod() 호출됨 !");
    }
}
