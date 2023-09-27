package Part2;

public class Main {
    public static void main(String[] args){
        Music album1 = new Music("Black Sabbath", "Black Sabbath", 9,46.24,"Black Sabbath is the debut studio album by English heavy metal band Black Sabbath, released on 13 February 1970 by Vertigo Records in the United Kingdom and Warner Bros."+
                "\nRecords in the United States on 1 June 1970. The album is widely regarded as the first heavy metal album, and the opening track, \"Black Sabbath\", has been referred to as the first doom metal song.\n" +
                "\n Upon release, the album reached number eight on the UK Albums Charts and number 23 on the US Billboard Top LPs chart." +
                "\n Black Sabbath is included in Robert Dimery's 2005 musical reference book 1001 Albums You Must Hear Before You Die.\n");

        Music album2 = new Music("The Smiths", "The Smiths", 10, 42.55, "The Smiths is the debut studio album by English rock band the Smiths, released on 20 February 1984 by Rough Trade Records."+"\n After the original production by Troy Tate was felt to be inadequate, John Porter re-recorded the album in London, Manchester and Stockport during breaks in the band's UK tour during September 1983.\n" +
                "\n The album was well received by critics and listeners, and reached number two on the UK Albums Chart, staying on the chart for 33 weeks. It established the Smiths as a prominent band in the 1980s music scene in the United Kingdom. The album also became an international success, peaking at number 45 in the European Albums Chart, remaining in the chart for 21 weeks. After its exit of the European chart, it then re-entered in the Hot 100 Albums from September for another run of three weeks.");


        album1.displayAlbumInfo();
        album2.displayAlbumInfo();
    }

}
