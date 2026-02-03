package ca.bcit.comp2522.appledevice;

/**
 * Models an iPhone that has the number of minutes remaining for this iPhone and the carrier.
 *
 * @author Mischa Potter Set D
 * @author Sal Yunus Set D
 * @author Steven Chi Set D
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
     * Gets the number of minutes remaining on this iPhone's cell plan.
     *
     * @return the number of minutes remaining
     */
    protected double getNumMinutesRemaining()
    {
        return numMinutesRemaining;
    }

    /**
     * Gets the name of this iPhone's carrier.
     *
     * @return the carrier
     */
    protected String getCarrier()
    {
        return carrier;
    }

    /**
     * Sets the number of minutes remaining for this iPhone.
     *
     * @param numMinutesRemaining the new amount of minutes remaining
     */
    final public void setNumMinutesRemaining(final double numMinutesRemaining)
    {
        this.numMinutesRemaining = numMinutesRemaining;
    }

    /**
     * Sets this iPhone's character to a new carrier.
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
        if (carrier == null || carrier.isBlank())
        {
            throw new IllegalArgumentException("Invalid carrier: " + carrier);
        }
    }

    /**
     * Prints the details of this iPhone.
     */
    public void printDetails()
    {
        System.out.println(this);
    }

    /**
     * Returns a String representation of this iPhone.
     * @return a formatted string describing the iPhone state.
     */
    @Override
    public String toString()
    {
        final StringBuilder builder;
        builder = new StringBuilder();

        builder.append("Number of minutes remaining on phone plan: ");
        builder.append(numMinutesRemaining);
        builder.append("\nCarrier: ");
        builder.append(carrier);

        return builder.toString();
    }

    /**
     * Returns true if two iPhone have the same amount of minutes remaining.
     *
     * @param o the reference object with which to compare
     *
     * @return is the object equals to this one.
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

    @Override
    public int hashCode()
    {
        return 0;
    }
}
