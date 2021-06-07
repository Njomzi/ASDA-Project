package njomza;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberDemo {
 public static void main(String[] args) {
  LineNumberReader reader = null;
    try {
      reader = new LineNumberReader(new FileReader(new File("C:\\SampleFile.txt")));
      String str;
      // Read file till the end
      while ((str = reader.readLine()) != null){
        System.out.println(reader.getLineNumber() + "- " + str);
      }         
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally { 
        if(reader != null){
            try {
              reader.close();
            } catch (IOException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
            }
          }
        }
      }
    }
 
