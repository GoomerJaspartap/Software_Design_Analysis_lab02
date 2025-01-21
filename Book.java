public class Book {
    String title, author, genre, publisher;
    Integer qty;
    public Book(String Title, String Author, String Genre, Integer stock, String Publisher){
        title = Title;
        author = Author;
        genre = Genre;
        qty = stock;
        publisher = Publisher;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public Integer getQty(){
        return this.qty;
    }
    public String getGenre(){
        return this.genre;
    }
    public String getPublisher(){
        return this.publisher;
    }
}
