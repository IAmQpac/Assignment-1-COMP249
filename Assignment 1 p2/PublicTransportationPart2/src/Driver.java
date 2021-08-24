/*
 * Assignment #1
 * Part: 2
 * Christian Jerjian (40031909)
 * Comp 249
 * 2021-07-19
 */

import public_transportation.PublicTransportation;
import public_transportation.air.AirCraft;
import public_transportation.land.CityBus;
import public_transportation.land.Metro;
import public_transportation.land.Tram;
import public_transportation.water.Ferry;

/**
 * The driver class of the program where the program starts running.
 */
public class Driver {

    /**
     * Copies an array of City Busses (CityBus, Metro, and Tram). It depends on the each class's copy constructor.
     * @param arrayPT the Array of City Busses to be copied
     * @return Returns a deep copy of the initial Array of City busses.
     */
    public static PublicTransportation[] copyCityBuss(PublicTransportation[] arrayPT){

        PublicTransportation[] temp = new PublicTransportation[arrayPT.length];

        for (int i = 0; i < temp.length; i++) {
            if (arrayPT[i] instanceof Metro){
                //If it is a metro, i can downcast it
                temp[i] = new Metro((Metro) arrayPT[i]);
            } else if (arrayPT[i] instanceof Tram){
                //If it is a Tram, i can downcast it
                temp[i] = new Tram((Tram)arrayPT[i]);
            }
            else if (arrayPT[i] instanceof CityBus){
                //If it is a CityBus, i can downcast it
                temp[i] = new CityBus((CityBus)arrayPT[i]);
            }
        }
        return temp;
    }

    /**
     * The main method is where we find the player count and run the driver.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
//        Creating 6 objects
        PublicTransportation aPublicTransportation = new PublicTransportation(2.55, 16);
        CityBus aCityBus = new CityBus(3.99, 25, 34123, 2016, "Henri-Bourassa", "Kevin");
        Metro aMetro = new Metro(1.99, 13, 78934,1995,"Orange Line", "Lamis", 3, "Montreal");
        Tram aTram = new Tram(4.25, 21, 23451, 1980, "Cote Vertu", "John", 100);
        AirCraft anAircraft = new AirCraft(799,1, AirCraft.ClassType.GLIDER, AirCraft.MaintenanceType.MONTHLY);
        Ferry aFerry = new Ferry(7.99, 7, 1965,"Titanic");

        PublicTransportation[] publicTransportationArray = {aPublicTransportation, aCityBus, aMetro, aTram, anAircraft, aFerry};

        System.out.println("Creating 6 Objects and testing their toString methods:");
//       toString all the objects
        for (int i = 0; i < publicTransportationArray.length; i++) {
            System.out.println(publicTransportationArray[i]);
        }

        System.out.println();

//        ------------------------- Test Equality -----------------------------------
        System.out.println("Testing equals methods:");
        System.out.println("aCityBus equal aMetro: " + aCityBus.equals(aMetro));
        System.out.println("anAircraft equal aTram: " + anAircraft.equals(aTram));
        System.out.println("aFerry equal aPublicTransportation: " + aFerry.equals(aPublicTransportation));
        System.out.println("aCityBus equal aCityBus: " + aCityBus.equals(aCityBus));
        System.out.println();

//        ------------------------- Creating 15 PublicTransportation Objects -----------------------------------

        PublicTransportation[] vehicules = new PublicTransportation[15];
        vehicules[0] = new PublicTransportation(3.55, 8);
        vehicules[1] = new CityBus(4.99, 5, 34123, 2016, "Sainte-MArie", "Christian");
        vehicules[2] = new Metro(2.99, 16, 78934,1995,"Blue Line", "Lamis", 3, "Montreal");
        vehicules[3] = new Tram(5.25, 28, 23451, 1980, "Sauve", "John", 100);
        vehicules[4] = new AirCraft(999,2, AirCraft.ClassType.BALLOON, AirCraft.MaintenanceType.WEEKLY);
        vehicules[5] = new Ferry(4.99, 3, 1965,"Titanic");
        vehicules[6] = new CityBus(5.99, 23, 78514, 2014, "Decarie", "Kevin");
        vehicules[7] = new Metro(6.99, 11, 65322,1992,"Green Line", "Lamis", 5, "Ottawa");
        vehicules[8] = new AirCraft(1099,3, AirCraft.ClassType.HELICOPTER, AirCraft.MaintenanceType.YEARLY);
        vehicules[9] =  new Metro(2.50, 13, 78934,1995,"Pink Line", "Hunter", 2, "Toronto");
        vehicules[10] = new Ferry(19.99, 12, 1961,"Wow");
        vehicules[11] = new PublicTransportation(3.55, 16);
        vehicules[12] =  new Tram(2.65, 25, 1454, 1980, "Vertu", "Bob", 100);
        vehicules[13] = new Tram(7.25, 27, 62354, 1980, "LaChine", "Joe", 100);
        vehicules[14] = new Ferry(9.99, 4, 1945,"Sebastian");

//        ------------------------- Tracing for Least and Most Expansive -----------------------------------
//        Least Expansive
        int min=0;
        for (int i = 0; i < vehicules.length; i++) {
            if (vehicules[min].getTicketPrice() > vehicules[i].getTicketPrice()){
                min = i;
            }
        }
//       Most expansive
        int max =0;
        for (int i = 0; i < vehicules.length; i++) {
            if (vehicules[max].getTicketPrice() < vehicules[i].getTicketPrice()){
                max = i;
            }
        }

//      Print
        System.out.println("The least expansive transportation has a price of (" + vehicules[min].getTicketPrice() + "$) and is placed in index " + min);
        System.out.println("\t >Information of the vehicule: " + vehicules[min]);
        System.out.println();
        System.out.println("The most expansive transportation has a price of (" + vehicules[max].getTicketPrice() + "$) and is placed in index " + max);
        System.out.println("\t >Information of the vehicule: " + vehicules[max]);
        System.out.println();


//                          ------------------------- Part 2 -----------------------------------
        System.out.println("------------------------------Part 2 -------------------------------");

        /*
        The copyCityBuss method works. It works because I used downcasted the class and made sure that the copied object's class matches the copy constructor class.
        Also, I made sure that I test of instanceOf subclass first and then base class, because the subclass is always an instanceOf a base class.
        This way, the copied class and the copy constructor always match and the objects can be copied.
         */

        PublicTransportation[] vehicules2 = new PublicTransportation[12];
        vehicules2[0] = new PublicTransportation(3.55, 8);
        vehicules2[1] = new CityBus(4.99, 5, 34123, 2016, "Sainte-MArie", "Christian");
        vehicules2[2] = new Metro(2.99, 16, 78934,1995,"Blue Line", "Lamis", 3, "Montreal");
        vehicules2[3] = new Tram(5.25, 28, 23451, 1980, "Sauve", "John", 100);
        vehicules2[4] = new AirCraft(999,2, AirCraft.ClassType.HELICOPTER, AirCraft.MaintenanceType.YEARLY);
        vehicules2[5] = new Ferry(4.99, 3, 1965,"Titanic");
        vehicules2[6] = new CityBus(5.99, 23, 78514, 2014, "Decarie", "Kevin");
        vehicules2[7] = new Metro(6.99, 11, 65322,1992,"Green Line", "Lamis", 5, "Ottawa");
        vehicules2[8] = new AirCraft(1099,3, AirCraft.ClassType.GLIDER, AirCraft.MaintenanceType.WEEKLY);
        vehicules2[9] =  new Metro(2.50, 13, 78934,1995,"Pink Line", "Hunter", 2, "Toronto");
        vehicules2[10] = new Ferry(19.99, 12, 1961,"Wow");
        vehicules2[11] = new PublicTransportation(3.55, 16);

        PublicTransportation[] copyOfVehicules2;
        copyOfVehicules2 = copyCityBuss(vehicules2);


        System.out.println("Printing vehicules2 Array:");
        System.out.println("(---> means that it is an instance of CityBus)");
        System.out.println();
        for (int i = 0; i < vehicules2.length; i++) {
            if (vehicules2[i] instanceof CityBus)
                System.out.println("--->" + vehicules2[i]);
            else System.out.println(vehicules2[i]);
        }

        System.out.println();

        System.out.println("Printing copyOfVehicule2 Array (Only instances of CityBus) :");
        System.out.println();
        for (int i = 0; i < copyOfVehicules2.length; i++) {
            if (copyOfVehicules2[i] == null){
                continue;
            }
            System.out.println(copyOfVehicules2[i]);
        }

        System.out.println();
        System.out.println("------------------------------------------------");

        System.out.println("Proving that it is indeed a deep copy and not a Shallow copy:" +
                "\nI set vehicules2[1] (an instance of CityBus) to 100$ and will print out the price of copyOfVehicules2[1]. \nIf the price does" +
                "not change (remains 4.99$) then we have indeed a deep copy.\n");
        vehicules2[1].setTicketPrice(100);
        System.out.println("copyOfVehicules2[1]'s ticket price is : " + copyOfVehicules2[1].getTicketPrice());
    }
}
