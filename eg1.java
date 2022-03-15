import java.io.IOException;  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  
class eg1
{  
 public static void main( String gg[])
{ 
try
{
 Document document = Jsoup.connect("https://www.w3schools.com").get();  
 String title = document.title();  
 System.out.println("title is: " + title);  
}catch(IOException ioException)
{
System.out.println(ioException.getMessage());
}
}  
}  