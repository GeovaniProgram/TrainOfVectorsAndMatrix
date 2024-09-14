import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to the matrix creator");
        int lineMatrix = Integer.parseInt(JOptionPane.showInputDialog("Type a integer number of lines your matrix will have"));
        int columnMatrix = Integer.parseInt(JOptionPane.showInputDialog("Type a integer number of columns your matrix will have"));
        int sum = 0;
        int i;
        int j;
        int [][] matrixNumbers = new int[lineMatrix][columnMatrix];
        for (i=0; i < lineMatrix; i++) {
            for (j=0; j < columnMatrix; j++){
                matrixNumbers[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Type a integer number to allocate at the line "+ i + " and column " + j));
                sum += matrixNumbers[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "Your complete matrix is:");
        StringBuilder matrixFormatted = new StringBuilder();
        for (i=0; i < lineMatrix; i++ ) {
            for (j = 0; j < columnMatrix; j++) {
                matrixFormatted.append(matrixNumbers[i][j]).append("  ");
            }
            matrixFormatted.append("\n");
        }
        JOptionPane.showMessageDialog(null, matrixFormatted.toString(), "Matrix", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "And the sum of all numbers in matrix are: " + sum);

    }

}
