public class DVD extends Item {
    private int durationMinutes;

    public DVD(String title, int durationMinutes) {
        super(title);
        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
}
