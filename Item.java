public abstract class Item {
    private String title;

    public Item(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

   @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract int hashCode();
}
