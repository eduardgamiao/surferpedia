package test;

import java.util.ArrayList;
import models.Surfer;
import org.junit.Test;
import static org.fest.assertions.Assertions.assertThat;
import play.mvc.Content;
import static play.test.Helpers.contentType;
import static play.test.Helpers.contentAsString;

/**
 * 
 * Simple (JUnit) tests that can call all parts of a play app. If you are interested in mocking a whole application, see
 * the wiki for more details.
 * 
 */
public class ApplicationTest {

  /**
   * Illustrates a simple test.
   */
  @Test
  public void simpleCheck() {
    int a = 1 + 1;
    assertThat(a).isEqualTo(2);
  }

  /**
   * Illustrates how to render a template for testing.
   */
  @Test
  public void renderTemplate() {
    ArrayList<Surfer> list = new ArrayList<Surfer>();
    Content html = views.html.Index.render(list);
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("home page");
  }
}
