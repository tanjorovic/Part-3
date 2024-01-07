import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cityName = promptForCityName(scanner);

        String country = promptForCountry(scanner);

        long population = promptForPopulation(scanner);

        City newCity = new City(cityName, country, population);

        CityPopulationTracker tracker = new CityPopulationTracker();
        tracker.addCity(newCity);

        System.out.println("City added to the tracker: " + newCity.getName());
        
    }
    public static boolean isNullOrBlank(String input){
        return input ==null || input.isBlank();
    }
    public static boolean incorrectPopulation(int population){
        return population<=0;
    }
    public static String promptForCityName(Scanner sc){
        while (true){
        System.out.println("Please eneter a city name: ");
        String cityName=sc.nextLine();
        if (isNullOrBlank(cityName)){
            continue;
        }
        return cityName;
        }
    }
    public static String promptForCountry(Scanner sc){
        while(true){
        System.out.println("\nPlease enter a valid country: ");
        String country = sc.nextLine();
        if(isNullOrBlank(country)){
            continue;
        }
        return country;
        }
    }
    public static long promptForPopulation(Scanner sc){
        while (true) {
            System.err.println("\n Please enter a valid population :");
            if(!sc.hasNextInt()){
                sc.next();
                continue;
            }
            long population = sc.nextLong();
            if(population<=0){
                continue;
            }
            return population;
        }
    }
}