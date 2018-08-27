package pl.aszul.Task1Page13;

import java.math.BigDecimal;

public class Book {
    private String id;
    private String cat;
    private String name;
    private BigDecimal price;
    private boolean inStock;
    private String author_t;
    private String series_t;
    private byte sequence_i;
    private String genre_s;

    public Book(String input) {
        String[] inputArray = input.split(",");
        id = inputArray[0];
        cat = inputArray[1];
        name = inputArray[2];
        price = new BigDecimal(inputArray[3]);
        inStock = inputArray[4].equals("true");
        author_t = inputArray[5];
        series_t = inputArray[6];
        sequence_i = Byte.valueOf(inputArray[7]);
        genre_s = inputArray[8];
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", cat='" + cat + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                ", author_t='" + author_t + '\'' +
                ", series_t='" + series_t + '\'' +
                ", sequence_i=" + sequence_i +
                ", genre_s='" + genre_s + '\'' +
                '}';
    }

    public String toStringCSV() {
        return id +
                ", " + cat +
                ", " + name +
                ", " + price +
                ", " + inStock +
                ", " + author_t +
                ", " + series_t +
                ", " + sequence_i +
                ", " + genre_s;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getAuthor_t() {
        return author_t;
    }

    public void setAuthor_t(String author_t) {
        this.author_t = author_t;
    }

    public String getSeries_t() {
        return series_t;
    }

    public void setSeries_t(String series_t) {
        this.series_t = series_t;
    }

    public byte getSequence_i() {
        return sequence_i;
    }

    public void setSequence_i(byte sequence_i) {
        this.sequence_i = sequence_i;
    }

    public String getGenre_s() {
        return genre_s;
    }

    public void setGenre_s(String genre_s) {
        this.genre_s = genre_s;
    }
}
