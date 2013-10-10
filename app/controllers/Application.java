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
    return ok(Index.render("Welcome to the home page."));
  }
  
  /**
   * Returns Ho, a page about Michael Ho.
   * @return The Ho.
   */
  public static Result ho() {
    return ok(Ho.render("Welcome to Michael Ho."));
    
  }
  
  /**
   * Returns Manuel, a page about Malia Manuel.
   * @return The Manuel.
   */
  public static Result manuel() {
    return ok(Manuel.render("Welcome to Malia Manuel."));
    
  }
  
  /**
   * Returns Devault, a page about Imaikalnai DeVault.
   * @return The Devault.
   */
  public static Result devault() {
    return ok(Devault.render("Welcome to Dorian Blanchard."));
    
  }
  
  /**
   * Returns Joyce, a page about Joyce Hoffman.
   * @return The Joyce.
   */
  public static Result joyce() {
    return ok(Joyce.render("Welcome to Dorian Blanchard."));
    
  }
  
  /**
   * Returns Kelia, a page about Kelia Moniz.
   * @return The Kelia.
   */
  public static Result kelia() {
    return ok(KeliaMoniz.render("Welcome to Kelia Moniz."));
    
  }
  
  /**
   * Returns Kolohe, a page about Kolohe.
   * @return The Kolohe.
   */
  public static Result kolohe() {
    return ok(Kolohe.render("Welcome to Kolohe."));
    
  }
}
