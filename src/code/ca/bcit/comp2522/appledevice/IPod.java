package ca.bcit.comp2522.appledevice;

/**
 * Models an iPod that have number of songs stored, and maximum volume in decibels.
 *
 * @author Mischa Potter Set D
 * @author Sal Yunus Set D
 * @author Steven Chi Set D
 * @version 1.0
 */
final class IPod extends IDevice
{
    private final static int    MIN_SONGS_STORED    = 0;
    private final static int    MAX_SONGS_STORED    = 1000;
    private final static double MIN_VOLUME_DECIBELS = 0;
    private final static double MAX_VOLUME_DECIBELS = 120;

    private final int numSongsStored;
    private final double maxVolumeDb;

    /**
     * Constructs an iPod object with specific data.
     *
     * @param numSongsStored the number of songs stored in the device.
     * @param maxVolumeDb the maximum volume of decibels.
     */
    IPod(final int numSongsStored,
         final double maxVolumeDb)
    {
        super("music");

        validateNumSongsSorted(numSongsStored);
        validateMaxVolumeDb(maxVolumeDb);

        this.numSongsStored = numSongsStored;
        this.maxVolumeDb    = maxVolumeDb;
    }

    /**
     * Returns the num of songs have stored.
     * @return the num of songs have stored
     */
    public int getNumSongsStored()
    {
        return numSongsStored;
    }

    /**
     * Returns the max volume decibels user have set.
     * @return the max volume decibels user have set
     */
    public double getMaxVolumeDb()
    {
        return maxVolumeDb;
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
     * @return a formatted string describing the iPod state.
     */
    @Override
    public String toString()
    {
        final StringBuilder builder;
        builder = new StringBuilder();

        builder.append("Number of songs stored: ");
        builder.append(numSongsStored);
        builder.append("\nMax volume (in decibels): ");
        builder.append(maxVolumeDb);

        return builder.toString();
    }

    /**
     * Returns true if two iPod have the same amount of stored songs.
     *
     * @param o the reference object with which to compare
     *
     * @return is the object equals to this one.
     */
    @Override
    public boolean equals(final Object o)
    {
        // null check is cover in instanceof
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
     * @return a hash code value based on the number of songs stored.
     */
    @Override
    public int hashCode()
    {
        final int prime1;
        final int prime2;
        int result;

        prime1 = 17;
        prime2 = 31;

        result = prime1 * prime2 + numSongsStored;

        return result;
    }


    private void validateMaxVolumeDb(double maxVolumeDb)
    {
        if(maxVolumeDb < MIN_VOLUME_DECIBELS ||
           maxVolumeDb > MAX_VOLUME_DECIBELS)
        {
            throw new IllegalArgumentException("Max volume db should be between" +
                                               MIN_VOLUME_DECIBELS +" and " + MAX_VOLUME_DECIBELS);
        }
    }

    private void validateNumSongsSorted(int numSongsStored)
    {
        if(numSongsStored < MIN_SONGS_STORED ||
           numSongsStored > MAX_SONGS_STORED)
        {
            throw new IllegalArgumentException("Number of songs stored inside should be between" +
                                               MIN_SONGS_STORED +" and " + MAX_SONGS_STORED);
        }
    }
}
