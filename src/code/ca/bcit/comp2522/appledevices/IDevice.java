package ca.bcit.comp2522.appledevices;

/**
 * Models an IDevice, a parent of an IPad, IPhone, IPhone17, and IPod.
 *
 * @author Mischa Potter Set D
 * @author Sal Yunus Set D
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
    IDevice(String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * Gets the purpose of this IDevice.
     *
     * @return the purpose of this IDevice
     */
    public String getPurpose()
    {
        return purpose;
    }

    /**
     * Prints all the child class's instance variables.
     */
    public abstract void printDetails();
}
