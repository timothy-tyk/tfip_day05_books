import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    //Read the file
    //Create Map of Array of Objects. Key = Publisher, Value = Array of Objects
    //Add the read data to Map, line by line
    //write new csv file
    Map <String, ArrayList<BookInfo>> bookInfo = new HashMap<String, ArrayList<BookInfo>>();
    try {
      File booksFile = new File("books.csv");
      BufferedReader bfr = new BufferedReader(new FileReader(booksFile));
      String line=bfr.readLine();// Skip first line Header
      while((line=bfr.readLine())!=null){
        try {
          String[] info = line.split(",");

          Integer bookId = Integer.parseInt(info[0]);
          String title = info[1];
          String authors = info[2];
          Float averageRating = Float.parseFloat(info[3]);
          String isbn = info[4];
          String isbn13 = info[5];
          String languageCode = info[6];
          Integer numPages = Integer.parseInt(info[7]);
          Integer ratingsCount = Integer.parseInt(info[8]);
          Integer textReviewsCount = Integer.parseInt(info[9]);
          String publicationDate = info[10];
          String publisher = info[11];

          BookInfo bookObj = new BookInfo(bookId, title, authors, averageRating, isbn, isbn13, languageCode, numPages, ratingsCount, textReviewsCount, publicationDate, publisher);

          if(bookInfo.containsKey(publisher)){
            bookInfo.get(publisher).add(bookObj);
          }else{
            ArrayList<BookInfo> newPublisher = new ArrayList<BookInfo>();
            newPublisher.add(bookObj);
            bookInfo.put(publisher, newPublisher);
          }
        } catch (Exception e) {
          // e.printStackTrace();
          continue;
        }
        
      }
      bfr.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      for(String key : bookInfo.keySet()){
        File newFile = new File(String.format("output/%s.csv", key.trim().replaceAll(" ", "").replaceAll("/", "")));
        BufferedWriter bfw = new BufferedWriter(new FileWriter(newFile));
        ArrayList<BookInfo> books = bookInfo.get(key);
        bfw.write("BookId, Title, Authors, Average_Rating, ISBN, ISBN13, Language_Code, Num_Pages, Ratings_Count, Text_Reviews_Count, Publication_Date, Publisher\r\n");
        
        for (int i=0;i<books.size();i++){
          BookInfo book = books.get(i);
          bfw.write(String.format("%d, %s, %s, %f, %s, %s, %s, %d, %d, %d, %s, %s\r\n",book.getBookId(),book.getTitle(),book.getAuthors(),book.getAverageRating(),book.getIsbn(),book.getIsbn13(),book.getLanguageCode(),book.getNumPages(),book.getRatingsCount(),book.getTextReviewsCount(),book.getPublicationDate(),book.getPublisher() ));
        }

        bfw.flush();
        bfw.close();
        


        
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    

  }
}
