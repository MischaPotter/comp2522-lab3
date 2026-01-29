package ca.bcit.comp2522.appledevices;

/**
 * Models an IPhone that has the number of minutes remaining for this IPhone and the carrier.
 *
 * @author Mischa Potter Set D
 * @author Sal Yunus Set D
 * @version 1.0
 */
class IPhone extends IDevice
{
    private final double numMinutesRemaining;
    private final String carrier;

    IPhone(final double numMinutesRemaining,
           final String carrier)
    {
        super("talking");

        validateCarrier(carrier);

        this.numMinutesRemaining = numMinutesRemaining;
        this.carrier             = carrier;
    }

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
}
