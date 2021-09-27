import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;

public class Sample
{
  public static void main(String[] args) throws IOException, URISyntaxException
  {
    URL resource = Sample.class.getClassLoader().getResource("sample.html");
    String content = FileUtils.readFileToString(Paths.get(resource.toURI()).toFile(), "utf-8");

    String regEx = "<html.*(?:</html|</body)";

    Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    Matcher matcher = pattern.matcher(content);
    try
    {
      matcher.find();
    }
    catch (Throwable t)
    {
      t.printStackTrace();
    }
  }
}
