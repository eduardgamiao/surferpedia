package controllers;

import play.mvc.Controller;

import play.mvc.Result;
import views.html.Index;
import views.html.Ho;
import views.html.Manuel;
import views.html.Devault;
import views.html.Joyce;
import views.html.KeliaMoniz;
import views.html.Kolohe;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render());
  }
  
  /**
   * Returns the Michael Ho page.
   * @return The Michael Ho webpage.
   */
  public static Result ho() {
    return ok(Ho.render());
    
  }
  
  /**
   * Returns a page about Malia Manuel.
   * @return The Malia Manuel webpage.
   */
  public static Result manuel() {
    return ok(Manuel.render());
    
  }
  
  /**
   * Returns a page about Imaikalnai DeVault.
   * @return The Imaikalani Devault webpage.
   */
  public static Result devault() {
    return ok(Devault.render());
    
  }
  
  /**
   * Returns a page about Joyce Hoffman.
   * @return The Joyce Hoffman webpage.
   */
  public static Result joyce() {
    return ok(Joyce.render());
    
  }
  
  /**
   * Returns a page about Kelia Moniz.
   * @return The Kelia Moniz webpage.
   */
  public static Result kelia() {
    return ok(KeliaMoniz.render());
    
  }
  
  /**
   * Returns a page about Kolohe Anidino..
   * @return The Kolohe Anidino webpage.
   */
  public static Result kolohe() {
    return ok(Kolohe.render());
    
  }
}
