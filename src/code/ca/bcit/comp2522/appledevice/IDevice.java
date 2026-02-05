package ca.bcit.comp2522.appledevice;

import java.util.Objects;

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

    /**
     * Checks if another object is equal to an IDevice.
     *
     * @param o the reference object with which to compare.
     * @return true if the objects are equal
     */
    @Override
    public boolean equals(final Object o)
    {
        if (!(o instanceof IDevice))
        {
            return false;
        }

        final IDevice d;
        d = (IDevice) o;

        return purpose.equals(d.getPurpose());
    }

    /**
     * Gets the hashcode for this IDevice.
     *
     * @return the hashcode
     */
    @Override
    public int hashCode()
    {
        return Objects.hashCode(purpose);
    }
}
