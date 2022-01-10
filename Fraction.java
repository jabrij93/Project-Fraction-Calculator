import java.util.InputMismatchException;
import java.util.Objects;

public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(int num, int den) {
        numerator = num;
        denominator = den;

        if (den == 0) {
            throw new IllegalArgumentException("Not possible to use denominator zero");
        } else if (den<0) {
            numerator = num * -1;
            denominator = den * -1;
        } else {
            this.numerator = num;
            this.denominator = den;
        }
    }

    Fraction(int num) {
        this(num, 1);
    }

    Fraction(){
        this(0, 1);
    }

    //Method

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return numerator+"/"+denominator;
    }

    public double toDouble() {
        return numerator/denominator;
    }

    public Fraction add(Fraction other) {
        Fraction addFraction = new Fraction(((numerator*other.denominator)+(other.numerator*denominator)),(denominator*other.denominator));
        addFraction.toLowestTerms();
        return addFraction;
    }

    public Fraction subtract(Fraction other) {
        Fraction subFraction = new Fraction(((numerator*other.denominator)-(other.numerator*denominator)),(denominator*other.denominator));
        subFraction.toLowestTerms();
        return subFraction;
    }

    public Fraction multiply(Fraction other) {
        Fraction mulFraction = new Fraction((numerator* other.numerator),(denominator*other.denominator));
        mulFraction.toLowestTerms();
        return mulFraction;
    }

    public Fraction divide(Fraction other) {
        if (numerator == 0) {
            throw new IllegalArgumentException();
        } else {
            Fraction divFraction = new Fraction((numerator*other.denominator), (denominator* other.denominator));
            divFraction.toLowestTerms();
            return divFraction;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction otherNewFrac = (Fraction) other;
            otherNewFrac.toLowestTerms();

            Fraction thisFrac = new Fraction(numerator, denominator);
            thisFrac.toLowestTerms();

            return (thisFrac.numerator == otherNewFrac.numerator) && (thisFrac.denominator == otherNewFrac.denominator);

        } else {
            throw new InputMismatchException("Fraction expected.");
        }
    }

    private void toLowestTerms() { //	converts the current fraction to the lowest terms
        int gcd = gcd (numerator,denominator);
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }

    private static int gcd(int num, int den){ //takes in two ints and determines the greatest common divisor of the two ints, should be a static method
        while (num!=0 && den!=0) {
            int remainder = num % den;
            num = den;
            den = remainder;
        }
        return num;
    }
}
