import org.apache.commons.math3.util.Precision;

public class Calculator implements ICalculator {
    private double a;
    private double b;
    private double c;
    private double e;
    private int precision;


        //из калькулятора, который разработал я, переменовать переменную "d" на "precision"
    public Calculator( double a, double b, int precision){
            this.a = a;
            this.b = b;
            this.c = c;
            this.e = e;
            this.precision = precision;
        }


        @Override
        public double add ( double a, double b) {
            c = a + b;
            e = Precision.round(c, (int) precision);
            double addResult = e;
            return addResult;
    }

        @Override
        public double subtract ( double a, double b){
            c = a - b;
            e = Precision.round(c, (int) precision);
            double subsResult = e;

            return subsResult;
    }

        @Override
        public double multiply ( double a, double b){
            c = a * b;
            e = Precision.round(c, (int) precision);
            double multiResult = e;

            return multiResult;
    }

        @Override
        public double divide ( double a, double b){
            c = a / b;
            e = Precision.round(c, (int) precision);
            double divResult = e;

            return divResult;
    }

    }
