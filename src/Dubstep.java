public class Dubstep {
    public String SongDecoder(String song) {
        return song.replaceAll("(WUB)+", " ").trim();
    }
}
