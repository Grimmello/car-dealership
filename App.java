import java.io.Console;
public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Vehicle hatchback = new Vehicle();
    hatchback.mYear = 1996;
    hatchback.mBrand = "Honda";
    hatchback.mModel = "Civic";
    hatchback.mMiles = 180000;
    hatchback.mPrice = 2000;

    Vehicle suv = new Vehicle();
    suv.mYear = 2010;
    suv.mBrand = "GMC";
    suv.mModel = "Yukon";
    suv.mMiles = 20000;
    suv.mPrice = 24000;

    Vehicle sedan = new Vehicle();
    sedan.mYear = 2012;
    sedan.mBrand = "BMW";
    sedan.mModel = "M3";
    sedan.mMiles = 80000;
    sedan.mPrice = 50000;

    Vehicle truck = new Vehicle();
    truck.mYear = 2004;
    truck.mBrand = "Nissan";
    truck.mModel = "Frontier";
    truck.mMiles = 100000;
    truck.mPrice = 6000;

    Vehicle[] allVehicles = {hatchback, suv, sedan, truck};

    System.out.println("What is your max budget");
    String stringMaxBudget = myConsole.readLine();
    int MaxBudget = Integer.parseInt(stringMaxBudget);

    System.out.println("Vehicles in your price range:");
    for ( Vehicle individualVehicle : allVehicles ) {
      if (individualVehicle.worthBuying(MaxBudget)) {
        System.out.println("----------------------");
        System.out.println( individualVehicle.mYear );
        System.out.println( individualVehicle.mBrand );
        System.out.println( individualVehicle.mModel );
        System.out.println( individualVehicle.mMiles );
        System.out.println( individualVehicle.mPrice );
      }
    }
  }
}
