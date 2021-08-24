/*
 * Assignment #1
 * Part: 2
 * Christian Jerjian (40031909)
 * Comp 249
 * 2021-07-19
 */

package public_transportation.land;

/**
 * The Metro class represents the Metro object and is a child of the City Bus.
 */
public class Metro extends CityBus {

//  Now that the attributes are private, we need to use the accessors and mutators to have access to this data.
//  This is good OOP practice because it doesn't show the actual memory location of the attributes to other classes.
    /**
     * The number of vehicule in a single metro
     */
    private int numOfVehicule;
    /**
     * The name of the city the metro is in.
     */
    private String city;

    //    Constructors

    /**
     * The default constructor of Metro class.
     */
    public Metro(){
    }

    /**
     * The parameterized constructor of Metro Class
     * @param ticketPrice Ticket price is the price to embark in the vehicle
     * @param numberOfStops Number of stop the vehicle will make.
     * @param routeNumber The trajectory number the bus will travel
     * @param beginOperationYear The starting year of operation for the city bus
     * @param lineName The name of the line the city bus will make
     * @param driverName The name of the driver of the city bus
     * @param numOfVehicule The number of vehicule in a single metro
     * @param city The name of the city the metro is in.
     */
    public Metro(double ticketPrice, int numberOfStops, long routeNumber, int beginOperationYear, String lineName, String driverName, int numOfVehicule, String city) {
        super(ticketPrice, numberOfStops, routeNumber, beginOperationYear, lineName, driverName);
        this.numOfVehicule = numOfVehicule;
        this.city = city;
    }

    /**
     * The copy constructor of the Metro Class.
     * @param aMetro The passing Metro object to initialize
     */
    public Metro(Metro aMetro) {
        super(aMetro);
        this.numOfVehicule = aMetro.numOfVehicule;
        this.city = aMetro.city;
    }

//    Getters and Setters
    /**
     * Accessor of numOfVehicule.
     * @return returns numOfVehicule.
     */
    public int getNumOfVehicule() {
        return numOfVehicule;
    }

    /**
     * Mutator of numOfVehicule
     * @param numOfVehicule The number of vehicule in a single metro
     */
    public void setNumOfVehicule(int numOfVehicule) {
        this.numOfVehicule = numOfVehicule;
    }

    /**
     * Accessor of city.
     * @return returns city
     */
    public String getCity() {
        return city;
    }

    /**
     * Mutator of city
     * @param city The name of the city the metro is in.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * The toString prints out the information about the Metro Object (Including attributes from CityBus and PublicTransportation) .
     * @return Returns a String about numOfVehicule, city and attributes from the CityBus and PublicTransportation.
     */
    @Override
    public String toString() {
        return "Metro{" +
                "numOfVehicule=" + numOfVehicule +
                ", city='" + city + '\'' +
                '}' + super.toString();
    }

    /**
     * The equal methods checks if the calling and passing objects have the same values.
     * @param anObject The passing object
     * @return Returns a boolean determining if the passed and called are equal.
     */
    @Override
    public boolean equals(Object anObject) {
        if (anObject == null || getClass() != anObject.getClass()) return false;
        if (!super.equals(anObject)) return false;
        Metro metro = (Metro) anObject;
        return numOfVehicule == metro.numOfVehicule && city.equals(metro.city);
    }


}
