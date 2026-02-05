package ca.bcit.comp2522.appledevice;

/**
 * Models an iPhone that has the number of minutes remaining for this iPhone and the carrier.
 *
 * @author Mischa Potter Set D
 * @author Steven Chi Set D
 *
 * @version 1.0
 */
class IPhone extends IDevice
{
    private double numMinutesRemaining;
    private String carrier;

    /**
     * Constructs an IPhone with the number of minutes remaining on the phone plan and
     * the carrier name.
     *
     * @param numMinutesRemaining the number of minutes remaining on this IPhone's phone plan
     * @param carrier             the name of the carrier for this IPhone
     */
    IPhone(final double numMinutesRemaining,
           final String carrier)
    {
        super("talking");

        validateCarrier(carrier);

        this.numMinutesRemaining = numMinutesRemaining;
        this.carrier             = carrier;
    }

    /**
     * Gets the number of minutes remaining on this iPhone's phone plan.
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

    /**
     * Prints the details of this iPhone.
     */
    public void printDetails()
    {
        System.out.println(this);
    }

    /**
     * Returns true if two iPhone have the same amount of minutes remaining.
     *
     * @param o the reference object with which to compare
     * @return is the object equals to this one.
     */
    @Override
    public boolean equals(final Object o)
    {
        if (!(o instanceof IPhone))
        {
            return false;
        }

        final IPhone p;
        p = (IPhone) o;

        // comparing doubles - use tolerance?
        return this.numMinutesRemaining == p.getNumMinutesRemaining();
    }

    /**
     * Calculates the hashcode for this IPhone.
     *
     * @return the hashcode
     */
    @Override
    public int hashCode()
    {
        return (int) this.numMinutesRemaining;
    }

    /**
     * Returns a String representation of this iPhone.
     *
     * @return a formatted string describing this iPhone
     */
    @Override
    public String toString()
    {
        final StringBuilder builder;
        builder = new StringBuilder();

        builder.append(super.toString());
        builder.append("Number of minutes remaining on phone plan: ");
        builder.append(numMinutesRemaining);
        builder.append("\nCarrier: ");
        builder.append(carrier);
        builder.append("\n");

        return builder.toString();
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
}
