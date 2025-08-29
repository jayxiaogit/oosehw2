public class DVD extends Item {
    private int durationMinutes;
    private String productionCompany;
    private int releaseYear;

    public DVD(String title, int durationMinutes, String productionCompany, int releaseYear) {
        super(title);
        this.durationMinutes = durationMinutes;
        this.productionCompany = productionCompany;
        this.releaseYear = releaseYear;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public int getReleaseYear() {
        return releaseyear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof DVD)) return false;
        DVD other = (DVD) obj;
        return getTitle().equals(other.getTitle()) &&
               durationMinutes == other.durationMinutes &&
               productionCompany.equals(other.productionCompany) &&
               releaseYear == other.releaseYear;
    }

    @Override
    public int hashCode() {
        return getTitle().hashCode() + durationMinutes +
               productionCompany.hashCode() + releaseYear;
    }

}
