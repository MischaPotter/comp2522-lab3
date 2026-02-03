package ca.bcit.comp2522.appledevice;

/**
 * Models an IPad.
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
     * Constructs an IPad that has/doesn't have a case and an operating system version.
     *
     * @param hasCase a Boolean representing if the IPad has a case
     * @param osVersion the operating system version
     */
    IPad(final Boolean hasCase, final String osVersion)
    {
        super("learning");
        validateOsVersion(osVersion);

        this.hasCase = hasCase;
        this.osVersion = osVersion;
    }

    public void printDetails()
    {

    }

    private static void validateOsVersion(final String osVersion)
    {
        if ()
    }
}
