package ca.bcit.comp2522.appledevice;

/**
 * Models an iPad device that stores an operating system version and whether
 * the device is protected by a case.
 *
 * @author Mischa Potter Set D
 * @author Steven Chi Set D
 * @version 1.0
 */
final class IPad extends IDevice
{
    private boolean encased;
    private String  osVersion;

    /**
     * Constructs an iPad with specific data.
     *
     * @param encased   a Boolean representing if the iPad has a case
     * @param osVersion the operating system version
     */
    IPad(final Boolean encased,
         final String osVersion)
    {
        super("learning");

        validateOsVersion(osVersion);

        this.encased   = encased;
        this.osVersion = osVersion;
    }

    /**
     * Returns does this iPad being protecting by case.
     *
     * @return true if this iPad is encased
     */
    protected boolean getEncased()
    {
        return encased;
    }

    /**
     * Returns this iPadOS version.
     *
     * @return this iPadOS version
     */
    protected String getOsVersion()
    {
        return osVersion;
    }

    /**
     * Sets this IPad's case value.
     *
     * @param encased what the new status of the case is
     */
    public void setEncased(final boolean encased)
    {
        this.encased = encased;
    }

    /**
     * Sets this IPad's OS version to a new OS version.
     *
     * @param osVersion the new OS version
     */
    public void setOsVersion(final String osVersion)
    {
        validateOsVersion(osVersion);

        this.osVersion = osVersion;
    }

    /**
     * Prints the details of this iPad.
     */
    public void printDetails()
    {
        System.out.println(this);
    }

    /**
     * Returns a String representation of this iPad.
     *
     * @return a formatted string describing the iPad state
     */
    @Override
    public String toString()
    {
        final StringBuilder builder;
        builder = new StringBuilder();

        builder.append(super.toString());
        builder.append("Has case: ");
        builder.append(encased);
        builder.append("\nOS version: ");
        builder.append(osVersion);

        return builder.toString();
    }

    /**
     * Returns true if two iPads have the same OS version.
     *
     * @param o the reference object with which to compare
     * @return true if this IPad and the other object are equal
     */
    @Override
    public boolean equals(final Object o)
    {
        // null check is cover in instanceof
        if (!(o instanceof IPad))
        {
            return false;
        }

        final IPad p;
        p = (IPad) o;

        return this.osVersion.equals(p.getOsVersion());
    }

    /**
     * Returns a hashcode value for this iPad.
     *
     * @return a hashcode value
     */
    @Override
    public int hashCode()
    {
        return this.osVersion.hashCode();
    }

    /*
     * Validates the OS version.
     *
     * @param osVersion the OS version to be validated
     */
    private static void validateOsVersion(final String osVersion)
    {
        if (osVersion == null || osVersion.isEmpty())
        {
            throw new IllegalArgumentException("Invalid osVersion: " + osVersion);
        }
    }
}
