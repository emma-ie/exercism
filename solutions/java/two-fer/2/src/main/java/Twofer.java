public class Twofer {
    public String twofer(String name) {
        String named = ("One for " + name + ", one for me.");
        String noName = ("One for you, one for me.");

        String result = (name != null) ? named : noName;

        return result;
    }
}
