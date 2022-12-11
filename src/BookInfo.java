
public class BookInfo {
  private Integer bookId;
  private String title;
  private String authors;
  private Float averageRating;
  private String isbn;
  private String isbn13;
  private String languageCode;
  private Integer numPages;
  private Integer ratingsCount;
  private Integer textReviewsCount;
  private String publicationDate; //not Date type since no need to sort by date
  private String publisher;

  public BookInfo(Integer bookId, String title, String authors, Float averageRating, String isbn, String isbn13,
      String languageCode, Integer numPages, Integer ratingsCount, Integer textReviewsCount, String publicationDate,
      String publisher) {
    this.bookId = bookId;
    this.title = title;
    this.authors = authors;
    this.averageRating = averageRating;
    this.isbn = isbn;
    this.isbn13 = isbn13;
    this.languageCode = languageCode;
    this.numPages = numPages;
    this.ratingsCount = ratingsCount;
    this.textReviewsCount = textReviewsCount;
    this.publicationDate = publicationDate;
    this.publisher = publisher;
  }

  // Getters and Setters
  public Integer getBookId() {
    return bookId;
  }
  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getAuthors() {
    return authors;
  }
  public void setAuthors(String authors) {
    this.authors = authors;
  }
  public Float getAverageRating() {
    return averageRating;
  }
  public void setAverageRating(Float averageRating) {
    this.averageRating = averageRating;
  }
  public String getIsbn() {
    return isbn;
  }
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
  public String getIsbn13() {
    return isbn13;
  }
  public void setIsbn13(String isbn13) {
    this.isbn13 = isbn13;
  }
  public String getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }
  public Integer getNumPages() {
    return numPages;
  }
  public void setNumPages(Integer numPages) {
    this.numPages = numPages;
  }
  public Integer getRatingsCount() {
    return ratingsCount;
  }
  public void setRatingsCount(Integer ratingsCount) {
    this.ratingsCount = ratingsCount;
  }
  public Integer getTextReviewsCount() {
    return textReviewsCount;
  }
  public void setTextReviewsCount(Integer textReviewsCount) {
    this.textReviewsCount = textReviewsCount;
  }
  public String getPublicationDate() {
    return publicationDate;
  }
  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }
  public String getPublisher() {
    return publisher;
  }
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  

  

}
