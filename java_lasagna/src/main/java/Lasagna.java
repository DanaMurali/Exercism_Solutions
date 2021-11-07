public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
   public static int expectedMinutesInOven () {
       int expectedMinutes = 40;
       return expectedMinutes;
   }

    // TODO: define the 'remainingMinutesInOven()' method

    public static int remainingMinutesInOven(int minutesInOven) {
       int remainingMinutes = 40 - minutesInOven;
       return remainingMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public static int preparationTimeInMinutes(int numberOfLayers){
        int prepTime = 2 * numberOfLayers;
        return prepTime;
    }
 
    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int numberOfLayers, int minutesInOven){
        int totalTime = (2 * numberOfLayers) + minutesInOven;
        return totalTime;
    }
}
