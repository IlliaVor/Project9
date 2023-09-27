package Part2;

public class Music {

    //properties
    private String title;
    private String information;
    private String band;
    private int numberOfTracks;
    private double totalDuration;

    // Constructor
    public Music(String title, String band, int numberOfTracks, double totalDuration, String information) {
        this.title = title;
        this.band = band;
        this.numberOfTracks = numberOfTracks;
        this.totalDuration = totalDuration;
        this.information = information;

    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }


    public String getArtist() {
        return band;
    }


    public void setArtist(String band) {
        this.band = band;
    }


    public int getNumberOfTracks() {
        return numberOfTracks;
    }


    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }


    public double getTotalDuration() {
        return totalDuration;
    }


    public void setTotalDuration(double totalDuration) {
        this.totalDuration = totalDuration;
    }

    //In hours
    public double calculateTotalDurationInHours() {
        return totalDuration / 60.0;
    }


    public void displayAlbumInfo() {
        System.out.println("Music Album Information:");

        System.out.println("Title: " + title);
        System.out.println("Band: " + band);
        System.out.println("Number of Tracks: " + numberOfTracks);
        System.out.println("Total Duration (minutes): " + totalDuration);
        System.out.println("Total Duration (hours): " + calculateTotalDurationInHours());
        System.out.println("About the album: " + information);
        System.out.println("-------------------------");
    }
}

