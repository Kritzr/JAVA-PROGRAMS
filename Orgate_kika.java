import java.util.Scanner;

public class Orgate_kika {

    public static void main(String[] args) {
        double Bias = -0.1;//decision boundary ->skip

        for (double w0 = 0.1; w0 < 1; w0 = w0 + 0.1) {
            for (double w1 = 0.1; w1 < 1; w1 = w1 + 0.1) {
                System.out.println("Bias: " + Bias);

                for (int x1 = 0; x1 < 2; x1++) {
                    for (int x2 = 0; x2 < 2; x2++) {
                        double y = Bias + w0 * x1 + w1 * x2;

                        if (y <= 0.5) {
                            y = 0;
                        } else {
                            y = 1;
                        }

                        System.out.println("x1: " + x1 + " x2: " + x2 + " output: " + y + " (w0: " + w0 + ", w1: " + w1 + ")");
                    }
                }
            }
        }
    }
}
