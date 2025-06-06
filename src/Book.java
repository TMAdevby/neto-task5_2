public class Book {
    private String title;
    private int releaseYear;
    private Author author;
    private int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        if (pages > 500) {
            return true;
        } else {
            return false;
        }
    }

    public boolean matches(String word) {
        if (title.toLowerCase().contains(word.toLowerCase()) || author.getName().toLowerCase().contains(word.toLowerCase())
                || author.getSurname().toLowerCase().contains(word.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

    public int estimatePrice() {
        int priceByPage = pages * 3 * (int) Math.floor(Math.sqrt(author.getRating()));
//        if (priceByPage > 250) {
//            return priceByPage;
//        } else {
//            return 250;
//        }
        int price;
        return price = priceByPage > 250 ? priceByPage : 250;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", author=" + author +
                ", pages=" + pages +
                '}';
    }
}
