package ca.bcit.comp2522.appledevice;

/**
 * Models an IDevice, a parent of an IPad, IPhone, IPhone17, and IPod.
 *
 * @author Mischa Potter Set D
 * @author Steven Chi Set D
 * @version 1.0
 */

abstract class IDevice
{
    private final String purpose;

    /**
     * Constructs an IDevice that takes this IDevice's purpose.
     *
     * @param purpose a word describing the purpose of the IDevice
     */
    IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * Gets the purpose of this IDevice.
     *
     * @return the purpose of this IDevice
     */
    protected String getPurpose()
    {
        return purpose;
    }

    /**
     * Prints all the child class's instance variables.
     */
    public abstract void printDetails();

    /**
     * Returns all the instance variables in a single String.
     *
     * @return a String contains all instance variables
     */
    @Override
    public String toString()
    {
        return "Part of the IDevice family\n";
    }
}
