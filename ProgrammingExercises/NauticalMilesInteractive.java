import javax.swing.JOptionPane;
public class NauticalMilesInteractive {
    public static void main(String[] args){
        double KilometersPerNauticalMile = 1.852;
        double MilesPerNauticalMile = 1.150779;
        String NumberOfNauticalMilesString;

        NumberOfNauticalMilesString = JOptionPane.showInputDialog(null, "Enter the number of nautical miles: ", "Nautical Miles to Kilometers and Miles Conversion", JOptionPane.INFORMATION_MESSAGE);
        double NumberOfNauticalMiles = Double.parseDouble(NumberOfNauticalMilesString);
        JOptionPane.showMessageDialog(null, NumberOfNauticalMiles + " nautical miles is " + NumberOfNauticalMiles*KilometersPerNauticalMile + " kilometers and " + NumberOfNauticalMiles*MilesPerNauticalMile + " miles.");
    }
}
