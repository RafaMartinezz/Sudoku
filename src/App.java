/**
 * Demonstrates how to locate the origin coordinates of 3x3 submatrices within
 * an 11x11 matrix.
 * The program initializes an 11x11 matrix with labeled coordinates, then
 * applies three methods to calculate
 * the top-left (origin) coordinates of each 3x3 submatrix within the larger
 * matrix.
 */
public class App {
    public static void main(String[] args) {
        // Initialize an 11x11 matrix with labeled coordinates
        String[][] matriz = new String[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                matriz[i][j] = i + "-" + j;
            }
        }

        // Display the original matrix with coordinate labels
        System.out.println("Matriz original");
        for (String[] fila : matriz) {
            for (String s : fila) {
                System.out.print(s + "\t");
            }
            System.out.println("");
        }

        // First approach: locate origin coordinates of 3x3 submatrices with a step
        // increment
        System.out.println("coordenadas origen Submatrices 3x3");
        for (int i = 0; i + 3 < matriz.length; i = i + 3) {
            for (int j = 0; j + 3 < matriz[i].length; j = j + 3) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println("");
        }

        // Second approach: use calculated m and n variables to manage the coordinate
        // step
        System.out.println("otro razonamiento ");
        int m = matriz.length / 3;
        int n = matriz[0].length / 3;
        int coordenadaFila = 0;
        for (int i = 0; i < m; i++) {
            int coordenadaCol = 0;
            for (int j = 0; j < n; j++) {
                System.out.print("(" + coordenadaFila + "," + coordenadaCol + ") ");
                coordenadaCol += 3;
            }
            coordenadaFila += 3;
            System.out.println("");
        }

        // Third approach: use named variables to clarify calculation as horizontal and
        // vertical steps
        System.out.println("otro razonamiento similar, hay muchos ....");
        int franjasHorizontales = matriz.length / 3;
        int franjasVerticales = matriz[0].length / 3;
        for (int i = 0; i < franjasHorizontales; i++) {
            for (int j = 0; j < franjasVerticales; j++) {
                System.out.print("(" + i * 3 + "," + j * 3 + ") ");
            }
            System.out.println("");
        }
    }
}
