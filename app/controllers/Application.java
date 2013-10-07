package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Page1;
import views.html.mho;
import views.html.mmanuel;
import views.html.dblanchard;
import views.html.joyce;
import views.html.KeliaMoniz;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result page1() {
    return ok(Page1.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns mho, a page about Micheal Ho.
   * @return The mho.
   */
  public static Result mho() {
    return ok(mho.render("Welcome to Micheal Ho."));
    
  }
  
  /**
   * Returns mmanuel, a page about Malia Manuel.
   * @return The mmanuel.
   */
  public static Result mmanuel() {
    return ok(mmanuel.render("Welcome to Malia Manuel."));
    
  }
  
  /**
   * Returns dblanchard, a page about Dorian Blanchard.
   * @return The dblanchard.
   */
  public static Result dblanchard() {
    return ok(dblanchard.render("Welcome to Dorian Blanchard."));
    
  }
  
  /**
   * Returns joyce, a page about Joyce Hoffman.
   * @return The joyce.
   */
  public static Result joyce() {
    return ok(joyce.render("Welcome to Dorian Blanchard."));
    
  }
  
  /**
   * Returns Kelia, a page about Kelia Moniz.
   * @return The Kelia.
   */
  public static Result kelia() {
    return ok(KeliaMoniz.render("Welcome to Dorian Blanchard."));
    
  }
}
