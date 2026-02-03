package ca.bcit.comp2522.appledevice;

/**
 * Models an iPad device that stores an operating system version and whether
 * the device is protected by a case.
 *
 * @author Mischa Potter Set D
 * @author Sal Yunus Set D
 * @author Steven Chi Set D
 * @version 1.0
 */
final class IPad extends IDevice
{
    private final boolean hasCase;
    private final String osVersion;

    /**
     * Constructs an iPad with specific data.
     *
     * @param hasCase a Boolean representing if the iPad has a case
     * @param osVersion the operating system version
     */
    IPad(final Boolean hasCase,
         final String osVersion)
    {
        super("learning");

        validateOsVersion(osVersion);

        this.hasCase = hasCase;
        this.osVersion = osVersion;
    }

    /**
     * Returns does this iPad being protecting by case.
     * @return true if this iPad have case.
     */
    public boolean isHasCase()
    {
        return hasCase;
    }

    /**
     * Returns this iPadOS version.
     * @return this iPadOS version.
     */
    public String getOsVersion()
    {
        return osVersion;
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
     * @return a formatted string describing the iPad state.
     */
    @Override
    public String toString()
    {
        final StringBuilder builder;
        builder = new StringBuilder();

        builder.append("Has case: ");
        builder.append(hasCase);
        builder.append("\nOS version: ");
        builder.append(osVersion);

        return builder.toString();
    }

    /**
     * Returns true if two iPads have the same OS version.
     *
     * @param o the reference object with which to compare
     *
     * @return is the object equals to this one.
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
     * Returns a hash code value for this iPad.
     * @return a hash code value based on the last character in osVersion.
     */
    @Override
    public int hashCode()
    {
        final int prime1;
        final int prime2;
        final char osVersionLastChar;

        int result;

        prime1 = 17;
        prime2 = 31;
        osVersionLastChar = osVersion.charAt(osVersion.length() - 1);

        result = prime1 * prime2 + osVersionLastChar;

        return result;
    }

    private static void validateOsVersion(final String osVersion)
    {
        if (osVersion == null || osVersion.isBlank())
        {
            throw new IllegalArgumentException("Invalid osVersion: " +
                                               "osVersion can not be null or empty");
        }
    }
}
