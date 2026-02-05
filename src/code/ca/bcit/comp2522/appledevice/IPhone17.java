package ca.bcit.comp2522.appledevice;

/**
 * Models an IPhone17, a subclass of an IPhone.
 *
 * @author Mischa Potter Set D
 * @author Steven Chi Set D
 *
 * @version 1.0
 */

final class IPhone17 extends IPhone
{
    public boolean highResCamera;
    public int     memoryGb;

    /**
     * Constructs an IPhone17 with the number of minutes remaining on the cell plan,
     * the name of the carrier, if this IPhone17 has a high resolution camera, and
     * the amount of memory for this IPhone17.
     *
     * @param numMinutesRemaining the number of minutes remaining on this IPhone's phone plan
     * @param carrier             the name of the carrier for this IPhone
     * @param highResCamera       a boolean representing if the camera is high resolution or not for this IPhone
     * @param memoryGb            the amount of memory in gigabytes for this IPhone
     */
    public IPhone17(final double numMinutesRemaining,
                    final String carrier,
                    final boolean highResCamera,
                    final int memoryGb)
    {
        super(numMinutesRemaining, carrier);

        this.highResCamera = highResCamera;
        this.memoryGb      = memoryGb;
    }

    /**
     * Returns the status of this IPhone17 having a high resolution camera.
     *
     * @return true if this IPhone17 has a high resolution camera
     */
    public boolean isHighResCamera()
    {
        return highResCamera;
    }

    /**
     * Sets the state of if this IPhone17 has a high resolution camera.
     *
     * @param highResCamera the new state of the high resolution camera
     */
    public void setHighResCamera(final boolean highResCamera)
    {
        this.highResCamera = highResCamera;
    }

    /**
     * Gets how much memory this IPhone17 has in gigabytes.
     *
     * @return the amount of memory in gigabytes
     */
    public int getMemoryGb()
    {
        return memoryGb;
    }

    /**
     * Sets the memory in gigabytes of this IPhone17.
     *
     * @param memoryGb the new amount of memory in gigabytes
     */
    public void setMemoryGb(final int memoryGb)
    {
        this.memoryGb = memoryGb;
    }

    /**
     * Checks if this IPhone17 and another object are equal.
     *
     * @param o the reference object with which to compare
     * @return true if the objects are equal
     */
    public boolean equals(final Object o)
    {
        if (!(o instanceof IPhone17))
        {
            return false;
        }

        final IPhone17 p;
        p = (IPhone17) o;

        return this.highResCamera == p.isHighResCamera() && super.equals(p);
    }

    /**
     * Returns the hashcode for an IPhone17.
     *
     * @return the hashcode for this IPhone17
     */
    @Override
    public int hashCode()
    {
        return (int) this.getNumMinutesRemaining();
    }

    /**
     * Returns the details of this IPhone17 as a formatted String.
     *
     * @return a formatted string describing this IPhone17
     */
    @Override
    public String toString()
    {
        final StringBuilder builder;
        builder = new StringBuilder();

        builder.append(super.toString());
        builder.append("Has a high resolution camera: ");
        builder.append(highResCamera);
        builder.append("\nAmount of memory (gb): ");
        builder.append(memoryGb);
        builder.append("\n");

        return builder.toString();
    }
}
