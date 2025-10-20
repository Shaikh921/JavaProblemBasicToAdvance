// Example: Add Two java_51  Numbers
public class java_51 {

    double real;
    double imag;

    public java_51(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
        java_51 n1 = new java_51(2.3, 4.5),
                n2 = new java_51(3.4, 5.0),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static java_51 add(java_51  n1, java_51  n2)
    {
        java_51  temp = new java_51 (0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
}