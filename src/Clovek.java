public class Clovek {
    boolean isMale;
    double vaha;

    public Clovek(boolean isMale, double vaha) {
        this.isMale = isMale;
        this.vaha = vaha;
    }

    @Override
    public String toString() {
        return "Clovek{" +
                "isMale=" + isMale +
                ", vaha=" + vaha +
                '}';
    }
}
