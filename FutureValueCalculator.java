/*****************************************
Nicole Tome 
August 1, 2020
******************************************/
//This program calculates the future value of investments utiliziipal, periods, and compounding interest. 


public class FutureValueCalculator {
        // method to compute future value
        public static double FV(double P, double r, int n) {
                // converting interest percentage to fractional rate
                r /= 100;

                // below expression will simply find the future value for principal P,
                // for n periods. Assuming interest is compounded yearly only.
                double fv = P *(Math.pow(1+r, n)-1) /r;
                // returning future value
                return fv;
        }

        public static void main(String[] args) {
                // starting with principal = 500
                double P = 500;
                // looping from r=2 to 4
                for (double r = 2; r <= 4; r++) {
                        // looping from n=5 to 7 (incremented by 2 at a time)
                        for (int n = 5; n <= 7; n += 2) {
                                // finding and displaying future value for current values of P,
                                // r and n
                                double fv = FV(P, r, n);
                                System.out
                                                .printf("P=$%.0f, r=%.0f%% per year for %d years, future value = $%.2f\n",
                                                                P, r, n, fv);
                        }
                }
                // now using P = 1000
                P = 1000;
                // printing future values for P=1000, r = 2,3,4 and n=5
                for (double r = 2; r <= 4; r++) {
                        int n = 5;
                        double fv = FV(P, r, n);
                        System.out
                                        .printf("P=$%.0f, r=%.0f%% per year for %d years, future value = $%.2f\n",
                                                        P, r, n, fv);

                }
        }
}
