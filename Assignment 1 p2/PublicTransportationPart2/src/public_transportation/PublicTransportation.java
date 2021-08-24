/*
 * Assignment #1
 * Part: 2
 * Christian Jerjian (40031909)
 * Comp 249
 * 2021-07-19
 */
package public_transportation;

/**
 * The public transportation class is the base class for all vehicles.
 */
public class PublicTransportation {
    /**
     * Ticket price is the price of a single ticket to use to embark in the vehicle.
     */
    private double ticketPrice;
    /**
     * The number of stops the vehicle has to stop to.
     */
    private int numberOfStops;

//    Constructors
    /**
     * The default constructor of PublicTransportation class.
     */
    public PublicTransportation() {
    }

    /**
     * Parameterized constructor of PublicTransportation.
     * @param ticketPrice Ticket price is the price to embark in the vehicle
     * @param numberOfStops Number of stop the vehicle will make.
     */
    public PublicTransportation(double ticketPrice, int numberOfStops) {
        this.ticketPrice = ticketPrice;
        this.numberOfStops = numberOfStops;
    }

    /**
     * The copy constructor of PublicTransportation.
     * @param aPublicTransportation The passing PublicTransportation object to copy.
     */
    public PublicTransportation(PublicTransportation aPublicTransportation){
        this.ticketPrice = aPublicTransportation.ticketPrice;
        this.numberOfStops = aPublicTransportation.numberOfStops;

    }

//   Accessor and Mutators

    /**
     * Accessor of ticketPrice.
     * @return returns ticketPrice
     */
    public double getTicketPrice() {
        return ticketPrice;
    }

    /**
     * Mutator of ticketPrice
     * @param ticketPrice Passing a ticketPrice
     */
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * Accessor of numberOfStops
     * @return returns numberOfStops
     */
    public int getNumberOfStops() {
        return numberOfStops;
    }

    /**
     * Mutator of numberOfStops
     * @param numberOfStops passing a numberOfStops
     */
    public void setNumberOfStops(int numberOfStops) {
        this.numberOfStops = numberOfStops;
    }

//    toString and equals

    /**
     * The toString prints out the information about the PublicTransportation Object.
     * @return Returns a String about ticketPrice and numberOfStops
     */
    @Override
    public String toString() {
        return "PublicTransportation{" +
                "ticketPrice=" + ticketPrice +
                ", numberOfStops=" + numberOfStops +
                '}';
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
//        therefore, we can downcast anObject to PublicTransportation
        PublicTransportation aPublicTransportation = (PublicTransportation) anObject;
        return (ticketPrice == aPublicTransportation.ticketPrice && numberOfStops == aPublicTransportation.numberOfStops);
    }

}
