package ca.bcit.comp2522.appledevice;

/**
 * Models an IPhone that has the number of minutes remaining for this IPhone and the carrier.
 *
 * @author Mischa Potter Set D
 * @author Sal Yunus Set D
 * @version 1.0
 */
class IPhone extends IDevice
{
    private double numMinutesRemaining;
    private String carrier;

    IPhone(final double numMinutesRemaining,
           final String carrier)
    {
        super("talking");

        validateCarrier(carrier);

        this.numMinutesRemaining = numMinutesRemaining;
        this.carrier             = carrier;
    }

    /**
     * Gets the number of minutes remaining on this IPhone's cell plan.
     *
     * @return the number of minutes remaining
     */
    protected double getNumMinutesRemaining()
    {
        return numMinutesRemaining;
    }

    /**
     * Gets the name of this IPhone's carrier.
     *
     * @return the carrier
     */
    protected String getCarrier()
    {
        return carrier;
    }

    /**
     * Sets the number of minutes remaining for this IPhone.
     *
     * @param numMinutesRemaining the new amount of minutes remaining
     */
    final public void setNumMinutesRemaining(final double numMinutesRemaining)
    {
        this.numMinutesRemaining = numMinutesRemaining;
    }

    /**
     * Sets this IPhone's character to a new carrier.
     *
     * @param carrier the new carrier
     */
    final public void setCarrier(final String carrier)
    {
        validateCarrier(carrier);

        this.carrier = carrier;
    }

    /*
     * Validates the carrier.
     *
     * @param carrier to be validated
     */
    private static void validateCarrier(final String carrier)
    {
        if (carrier == null || carrier.isEmpty())
        {
            throw new IllegalArgumentException("Invalid carrier: " + carrier);
        }
    }

    /**
     * Prints the details of this IPhone.
     */
    public void printDetails()
    {
        System.out.println("Number of minutes remaining on phone plan: " + numMinutesRemaining +
                           "\nCarrier: " + carrier);
    }

    /**
     * Implementation for equals method.
     *
     * @param o the reference object with which to compare
     * @return
     */
    @Override
    public boolean equals(Object o)
    {
        if (o == null || !(o instanceof IPhone))
        {
            return false;
        }
        final IPhone p;
        p = (IPhone) o;
        return this.numMinutesRemaining == p.getNumMinutesRemaining();
    }
}
