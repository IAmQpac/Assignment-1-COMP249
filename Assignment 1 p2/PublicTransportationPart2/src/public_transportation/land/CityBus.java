/*
 * Assignment #1
 * Part: 2
 * Christian Jerjian (40031909)
 * Comp 249
 * 2021-07-19
 */

package public_transportation.land;
import public_transportation.PublicTransportation;

/**
 * The city bus class represents the busses objects and is a child of the public transportation class
 */
public class CityBus extends PublicTransportation {

//    --------------------- PART II: Use of Private instead of Protected -------------------------
//    The use of Private visibility modifiers means that the sub-classes (Metro and Tram) have to use the Accessors and mutators
//    methods in order to call the CityBus Attributes. This provide better security using Accessors and Mutators
//    keeps the actual attribute memory location unaccessible by the user.

    /**
     * The trajectory number the bus will travel
     */
    private long routeNumber;
    /**
     * The starting year of operation for the city bus
     */
    private int beginOperationYear;
    /**
     * The name of the line the city bus will make
     */
    private String lineName;
    /**
     * The name of the driver of the city bus
     */
    private String driverName;

    //    Constructors

    /**
     * The default constructor of CityBus class
     */
    public CityBus(){
    }

    /**
     * The parameterized constructor of CityBus Class
     * @param ticketPrice Ticket price is the price to embark in the vehicle
     * @param numberOfStops Number of stop the vehicle will make.
     * @param routeNumber The trajectory number the bus will travel
     * @param beginOperationYear The starting year of operation for the city bus
     * @param lineName The name of the line the city bus will make
     * @param driverName The name of the driver of the city bus
     */
    public CityBus(double ticketPrice, int numberOfStops, long routeNumber, int beginOperationYear, String lineName, String driverName) {
        super(ticketPrice, numberOfStops);
        this.routeNumber = routeNumber;
        this.beginOperationYear = beginOperationYear;
        this.lineName = lineName;
        this.driverName = driverName;
    }

    /**
     * The copy constructor of the CityBus Class.
     * @param aCityBus The passing CityBus object to copy
     */
    public CityBus(CityBus aCityBus){
        super(aCityBus);
        this.routeNumber = aCityBus.routeNumber;
        this.beginOperationYear = aCityBus.beginOperationYear;
        this.lineName = aCityBus.lineName;
        this.driverName = aCityBus.driverName;
    }

    //    Getters and Setters
    /**
     *  Accessor of routeNumber.
     * @return returns routeNumber
     */
    public long getRouteNumber() {
        return routeNumber;
    }

    /**
     * Mutator of routeNumber
     * @param routeNumber The trajectory number the bus will travel
     */
    public void setRouteNumber(long routeNumber) {
        this.routeNumber = routeNumber;
    }

    /**
     *   Accessor of beginOperationYear.
     * @return returns beginOperationYear
     */
    public int getBeginOperationYear() {
        return beginOperationYear;
    }

    /**
     * Mutator of beginOperationYear
     * @param beginOperationYear The starting year of operation for the city bus
     */
    public void setBeginOperationYear(int beginOperationYear) {
        this.beginOperationYear = beginOperationYear;
    }

    /**
     *  Accessor of lineName.
     * @return returns lineName
     */
    public String getLineName() {
        return lineName;
    }

    /**
     * Mutator of lineName
     * @param lineName The name of the line the city bus will make
     */
    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    /**
     *  Accessor of driverName.
     * @return returns lineName
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Mutator of driverName
     * @param driverName The name of the driver of the city bus
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     * The toString prints out the information about the CityBus Object (Including attributes from the base class) .
     * @return Returns a String about routeNumber, beginOperationYear, lineName, driverName and attributes from the parent.
     */
    @Override
    public String toString() {
        return "CityBus{" +
                "routeNumber=" + routeNumber +
                ", beginOperationYear=" + beginOperationYear +
                ", lineName='" + lineName + '\'' +
                ", driverName='" + driverName + '\'' +
                '}' + super.toString();
    }

    /**
     * The equal methods checks if the calling and passing objects have the same values.
     * @param anObject The passing object
     * @return Returns a boolean determining if the passed and called are equal.
     */
    @Override
    public boolean equals(Object anObject) {
//        if passedObject is null OR calling object does not have the same class as passed object, they are obviously not equal.
        if (anObject == null || this.getClass() != anObject.getClass()) return false;
        if (!super.equals(anObject)) return false;
        CityBus cityBus = (CityBus) anObject;
        return routeNumber == cityBus.routeNumber && beginOperationYear == cityBus.beginOperationYear && lineName.equals(cityBus.lineName) && driverName.equals(cityBus.driverName);
    }

}
