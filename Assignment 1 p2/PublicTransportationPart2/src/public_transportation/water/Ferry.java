/*
 * Assignment #1
 * Part: 2
 * Christian Jerjian (40031909)
 * Comp 249
 * 2021-07-19
 */

package public_transportation.water;
import public_transportation.PublicTransportation;
import java.util.Objects;

/**
 * The Ferry class is a sub-class of PublicTransportation. It represents public transportation on water.
 * It contains the buildYear and shipName.
 */
public class Ferry extends PublicTransportation {
    /**
     * The year the Ferry was built.
     */
    private int buildYear;
    /**
     * The name of the ship.
     */
    private String shipName;

    /**
     * Default constructor of Ferry class.
     */
    public Ferry(){
    }

    /**
     * Parameterized constructor of Ferry class.
     * @param ticketPrice Ticket price is the price of a single ticket to use to embark in the Ferry.
     * @param numberOfStops The number of stops the Ferry has to stop to.
     * @param buildYear The year the Ferry was built.
     * @param shipName The name of the ship.
     */
    public Ferry(double ticketPrice, int numberOfStops, int buildYear, String shipName) {
        super(ticketPrice, numberOfStops);
        this.buildYear = buildYear;
        this.shipName = shipName;
    }

    /**
     * The copy constructor of the Ferry class.
     * @param aFerry A Ferry object to copy.
     */
    public Ferry(Ferry aFerry) {
        super(aFerry);
        this.buildYear = aFerry.buildYear;
        this.shipName = aFerry.shipName;
    }

    /**
     * Accessor of buildYear.
     * @return returns buildYear.
     */
    public int getBuildYear() {
        return buildYear;
    }

    /**
     * Mutator of buildYear
     * @param buildYear Year the Ferry was built.
     */
    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    /**
     * Accessor of shipName
     * @return Returns the name of the ship.
     */
    public String getShipName() {
        return shipName;
    }

    /**
     * Mutator of shipName.
     * @param shipName The name of the ship.
     */
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    /**
     * The toString prints out the information about the Ferry Object (including attributes inherited from base class).
     * @return Returns a String about buildYear, shipName, ticketPrice, numberOfStops
     */
    @Override
    public String toString() {
        return "Ferry{" +
                "buildYear=" + buildYear +
                ", shipName='" + shipName + '\'' +
                '}' + super.toString();
    }

    /**
     * The equal methods checks if the calling ferry object and passing object have the same values.
     * @param anObject The passing object
     * @return Returns a boolean determining if the passed and called are equal.
     */
    @Override
    public boolean equals(Object anObject) {
        if (anObject == null || getClass() != anObject.getClass()) return false;
        if (!super.equals(anObject)) return false;
        Ferry ferry = (Ferry) anObject;
        return buildYear == ferry.buildYear && Objects.equals(shipName, ferry.shipName);
    }

}
