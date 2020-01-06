import static java.lang.Math.*;

class Integrate {
    private int m;
    private static final double a = PI/6;
    private static final double b = PI/2;
    private boolean nPowerOf2;

    Integrate(int m) throws WrongArgumentException {
        this.m = m;
        if (m <= 0) {
            throw new WrongArgumentException();
        }
    }

    private int n(int i) {


            if (nPowerOf2) {
                return (int) pow(2, i);
            } else {
                return (int) pow(4, i);
            }

    }

    private double h(int i) {
        return (b - a)/n(i);
    }

    private double T(int i, int k) {
        if(0==k){
            return T(i);
        }
        return (T(i, k-1) + (T(i,k-1) - T(i-1,k-1))/(pow(h(i-k)/h(i),2)-1));
    }

    private double T(int i) {
        double result = 0;
        int n = 1;
        while (a + h(i) * n < b) {
            result += f(a + h(i) * n);
            n++;
        }
        return h(i) * (f(a) / 2 + f(b) / 2 + result);
    }

    private double f(double x) {
        return sin(x) / x;
    }

    double calculate2() {
        nPowerOf2 =true;
        return T(m,m);
    }

    double calculate4(){
        nPowerOf2 =false;
        return T(m,m);
    }

}
