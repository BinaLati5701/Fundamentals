package javaFun;

public class PythagoreanTest {
    public static void main(String[] args){
        Pythagorean calculate = new Pythagorean();
         double hypotenuse= calculate.calculateHypotenuse(8,6);
        System.out.println(hypotenuse);
    }
}
