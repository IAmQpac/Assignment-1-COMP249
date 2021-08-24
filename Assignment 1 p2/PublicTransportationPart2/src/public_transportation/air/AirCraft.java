/*
 * Assignment #1
 * Part: 2
 * Christian Jerjian (40031909)
 * Comp 249
 * 2021-07-19
 */

package public_transportation.air;
import com.sun.tools.javac.Main;
import public_transportation.PublicTransportation;

import java.util.Objects;

/**
 * The AirCraft class represents the blueprint of all AirCrafts and is a sub-class of PublicTransportation.
 */
public class AirCraft extends PublicTransportation {
    /**
     * The ClassType enum represents the different type that the Aircraft can be.
     */
    public enum ClassType{
        HELICOPTER, GLIDER, BALLOON;
    }

    /**
     * The MaintenanceType enum represents the different maintenance period an AirCraft requires
     */
    public enum MaintenanceType{
        WEEKLY, MONTHLY, YEARLY
    }

    /**
     * The classType a specific AirCraft is.
     */
    private AirCraft.ClassType classType;
    /**
     * The maintenanceType a specific AirCraft is.
     */
    private AirCraft.MaintenanceType maintenanceType;



    //    Constructors
    /**
     * The default constructor of the Aircraft class
     */
    public AirCraft(){
    }

    /**
     * The parameterized constructor of the AirCraft Class
     * @param ticketPrice Ticket price is the price to embark in the vehicle
     * @param numberOfStops Number of stop the vehicle will make.
     * @param classType The classType a specific AirCraft is.
     * @param maintenanceType The maintenanceType a specific AirCraft is.
     */
    public AirCraft(double ticketPrice, int numberOfStops, ClassType classType, MaintenanceType maintenanceType) {
        super(ticketPrice, numberOfStops);
        this.classType = classType;
        this.maintenanceType = maintenanceType;
    }


    /**
     * The copy constructor of the AirCraft Class.
     * @param anAirCraft The passing AirCraft object to copy
     */
    public AirCraft(AirCraft anAirCraft) {
        super(anAirCraft);
        this.classType = anAirCraft.classType;
        this.maintenanceType = anAirCraft.maintenanceType;
    }

    /**
     *  Accessor of classType.
     * @return returns classType
     */
    public ClassType getClassType() {
        return classType;
    }

    /**
     * Mutator of routeNumber
     * @param classType The classType a specific AirCraft is.
     */
    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    /**
     *  Accessor of maintenanceType.
     * @return returns maintenanceType
     */
    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    /**
     * Mutator of routeNumber
     * @param maintenanceType The maintenanceType a specific AirCraft is.
     */
    public void setMaintenanceType(MaintenanceType maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    /**
     * The toString prints out the information about the the Aircraft Object (Including attributes from the base class) .
     * @return Returns a String about classType, maintenanceType, and attributes from the parent.
     */
    @Override
    public String toString() {
        return "AirCraft{" +
                "classType=" + classType +
                ", maintenanceType=" + maintenanceType +
                '}' + super.toString();
    }


    /**
     * The equal methods checks if the calling and passing objects have the same values.
     * @param anObject The passing object
     * @return Returns a boolean determining if the passed and called are equal.
     */
    @Override
    public boolean equals(Object anObject) {
        // if passedObject is null OR calling object does not have the same class as passed object, they are obviously not equal.
        if (anObject == null || getClass() != anObject.getClass()) return false;
        if (!super.equals(anObject)) return false;
        AirCraft airCraft = (AirCraft) anObject;
        return classType == airCraft.classType && maintenanceType == airCraft.maintenanceType;
    }

}
