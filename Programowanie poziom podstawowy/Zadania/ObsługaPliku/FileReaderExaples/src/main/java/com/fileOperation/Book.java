package com.fileOperation;

public class Book implements Comparable<Book> {
    private String id;
    private String cat;
    private String name;
    private float price;
    private boolean inStock;
    private String author_t;
    private String series_t;
    private int sequence_i;
    private String genre_s;

    public Book(String id, String cat, String name, float price, boolean inStock, String author_t, String series_t, int sequence_i, String genre_s) {
        this.id = id;
        this.cat = cat;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.author_t = author_t;
        this.series_t = series_t;
        this.sequence_i = sequence_i;
        this.genre_s = genre_s;
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

    public float getPrice() {
        return price;
    }

    public float setPrice(float price) {
        this.price = price;
        return price;
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

    public int getSequence_i() {
        return sequence_i;
    }

    public void setSequence_i(int sequence_i) {
        this.sequence_i = sequence_i;
    }

    public String getGenre_s() {
        return genre_s;
    }

    public void setGenre_s(String genre_s) {
        this.genre_s = genre_s;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
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


      public int compareTo(Book o) {
         do {
            if (o.price > price) {
                return -1;
            } else if (o.price < price) {
                return 1;
            }
        }while(inStock != true);
        return 0;
    }
}

