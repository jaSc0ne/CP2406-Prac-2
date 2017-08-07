import javax.swing.JOptionPane;
public class QuartsToGallonsInteractive {

    public static void main(String[] args){

        int QuartsToGallons = 4;
        String NumberOfGallonsString;
        NumberOfGallonsString = JOptionPane.showInputDialog(null, "Enter the number of quarts needed: ", "Quarts to Gallons Conversion", JOptionPane.INFORMATION_MESSAGE);
        int NumberOfGallons;
        NumberOfGallons = Integer.parseInt(NumberOfGallonsString);
        JOptionPane.showMessageDialog(null, "A job that requires "+ NumberOfGallons + " gallons will need " + NumberOfGallons/QuartsToGallons + " gallons and " + NumberOfGallons%QuartsToGallons + " quarts.");
    }



}
