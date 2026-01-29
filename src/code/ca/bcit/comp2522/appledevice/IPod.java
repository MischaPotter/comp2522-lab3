package ca.bcit.comp2522.appledevice;

/**
 *
 * @author Mischa Potter Set D
 * @author Sal Yunus Set D
 * @version 1.0
 */

final class IPod extends IDevice
{
    private final int    numSongsStored;
    private final double maxVolumeDb;

    IPod(final int numSongsStored,
         final double maxVolumeDb)
    {
        super("music");

        this.numSongsStored = numSongsStored;
        this.maxVolumeDb    = maxVolumeDb;
    }

    public void printDetails()
    {
        System.out.println("Number of songs stored: " + numSongsStored + "\nMax volume (in decibels): " + maxVolumeDb);
    }
}
