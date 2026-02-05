package ca.bcit.comp2522.appledevice;

/**
 * Models an iPod that have number of songs stored, and maximum volume in decibels.
 *
 * @author Mischa Potter Set D
 * @author Steven Chi Set D
 *
 * @version 1.0
 */
final class IPod extends IDevice
{
    private final static int    MIN_SONGS_STORED    = 0;
    private final static int    MAX_SONGS_STORED    = 1000;
    private final static double MIN_VOLUME_DECIBELS = 0;
    private final static double MAX_VOLUME_DECIBELS = 120;

    private int    numSongsStored;
    private double maxVolumeDecibels;

    /**
     * Constructs an iPod object with specific data.
     *
     * @param numSongsStored    the number of songs stored in the device
     * @param maxVolumeDecibels the maximum volume of decibels
     */
    IPod(final int numSongsStored,
         final double maxVolumeDecibels)
    {
        super("music");

        validateNumSongsSorted(numSongsStored);
        validateMaxVolumeDb(maxVolumeDecibels);

        this.numSongsStored    = numSongsStored;
        this.maxVolumeDecibels = maxVolumeDecibels;
    }

    /**
     * Returns the num of songs have stored.
     *
     * @return the num of songs have stored
     */
    protected int getNumSongsStored()
    {
        return numSongsStored;
    }

    /**
     * Returns the max volume decibels user have set.
     *
     * @return the max volume decibels user have set
     */
    protected double getMaxVolumeDecibels()
    {
        return maxVolumeDecibels;
    }


    public void setNumSongsStored(final int numSongsStored)
    {
        this.numSongsStored = numSongsStored;
    }

    public void setMaxVolumeDecibels(final double maxVolumeDecibels)
    {
        this.maxVolumeDecibels = maxVolumeDecibels;
    }

    /**
     * Prints the details of this iPod.
     */
    public void printDetails()
    {
        System.out.println(this);
    }

    /**
     * Returns a String representation of this iPod.
     *
     * @return a formatted string describing the iPod state
     */
    @Override
    public String toString()
    {
        final StringBuilder builder;
        builder = new StringBuilder();

        builder.append(super.toString());
        builder.append("Number of songs stored: ");
        builder.append(numSongsStored);
        builder.append("\nMax volume (in decibels): ");
        builder.append(maxVolumeDecibels);
        builder.append("\n");

        return builder.toString();
    }

    /**
     * Returns true if two iPod have the same amount of stored songs.
     *
     * @param o the reference object with which to compare
     * @return true if the object equals to this one
     */
    @Override
    public boolean equals(final Object o)
    {
        if (!(o instanceof IPod))
        {
            return false;
        }

        final IPod p;
        p = (IPod) o;

        return this.numSongsStored == p.getNumSongsStored();
    }

    /**
     * Returns a hash code value for this iPod.
     *
     * @return a hash code value based on the number of songs stored
     */
    @Override
    public int hashCode()
    {
        return this.numSongsStored;
    }

    /*
     * Validates the max volume (in decibels).
     *
     * @param maxVolumeDecibels the max volume in decibels to be validated
     */
    private static void validateMaxVolumeDb(final double maxVolumeDecibels)
    {
        if (maxVolumeDecibels < MIN_VOLUME_DECIBELS ||
            maxVolumeDecibels > MAX_VOLUME_DECIBELS)
        {
            throw new IllegalArgumentException("Invalid volume: " + maxVolumeDecibels);
        }
    }

    /*
     * Validates the number of songs being stored on this IPod.
     *
     * @param numSongsStored the number of songs stored to be validated
     */
    private static void validateNumSongsSorted(final int numSongsStored)
    {
        if (numSongsStored < MIN_SONGS_STORED ||
            numSongsStored > MAX_SONGS_STORED)
        {
            throw new IllegalArgumentException("Invalid number of songs stored: " + numSongsStored);
        }
    }
}
