//WAP to show object cloning in java using cloneable and copy constructor both.
package Fifth;

class Complex {

    private double re, im;


    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }


    Complex(Complex c) {
        System.out.println("Copy constructor called");
        re = c.re;
        im = c.im;
    }


    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}

public class Copy_const {

    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);


        Complex c2 = new Complex(c1);

       Complex c3 = c2;

        System.out.println(c2);
    }
}
