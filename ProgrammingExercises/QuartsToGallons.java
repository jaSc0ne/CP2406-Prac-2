public class QuartsToGallons {

    public static void main(String[] args){
        int QuartsPerGallon = 4;
        int NumberOfQuarts;
        NumberOfQuarts = 20;
        System.out.println("A job that requires " + NumberOfQuarts + " quarts requires " + (NumberOfQuarts/QuartsPerGallon) + " gallons and " + (NumberOfQuarts%QuartsPerGallon)+ " quarts");
    }
}
