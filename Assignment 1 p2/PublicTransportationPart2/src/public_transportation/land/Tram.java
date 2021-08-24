/*
 * Assignment #1
 * Part: 2
 * Christian Jerjian (40031909)
 * Comp 249
 * 2021-07-19
 */

package public_transportation.land;

/**
 * The Tram class represents the Metro object and is a child of the City Bus.
 */
public class Tram extends CityBus {
    /**
     * The maximum speed a Tram can reach
     */
    private int maxSpeed;

    /**
     * The default constructor of Tram class.
     */
    public Tram(){
    }

    /**
     * The parameterized constructor of Tram class.
     * @param ticketPrice Ticket price is the price to embark in the vehicle
     * @param numberOfStops Number of stop the vehicle will make.
     * @param routeNumber The trajectory number the Tram will travel
     * @param beginOperationYear The starting year of operation for the Tram
     * @param lineName The name of the line the Tram will make
     * @param driverName The name of the driver of the Tram
     * @param maxSpeed The maximum speed of the Tram
     */
    public Tram(double ticketPrice, int numberOfStops, long routeNumber, int beginOperationYear, String lineName, String driverName, int maxSpeed) {
        super(ticketPrice, numberOfStops, routeNumber, beginOperationYear, lineName, driverName);
        this.maxSpeed = maxSpeed;
    }

    /**
     * The copy constructor of the Tram class.
     * @param aTram The passing Tram object to initialize
     */
    public Tram(Tram aTram) {
        super(aTram);
        this.maxSpeed = aTram.maxSpeed;
    }

    //    Getters and Setters

    /**
     * Accessor of maxSpeed.
     * @return returns maxSpeed
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Mutator of maxSpeed
     * @param maxSpeed The max speed of the Tram
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * The toString prints out the information about the Tram Object (Including attributes from CityBus and PublicTransportation).
     * @return Returns a String about maxSpeed and attributes from the CityBus and PublicTransportation.
     */
    @Override
    public String toString() {
        return "Tram{" +
                "maxSpeed=" + maxSpeed +
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
        Tram tram = (Tram) anObject;
        return maxSpeed == tram.maxSpeed;
    }

}
