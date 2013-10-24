package controllers;

import java.util.Map;
import models.SurferDB;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.SurferFormData;
import views.formdata.SurferTypes;
import views.html.Index;
import views.html.Ho;
import views.html.Manuel;
import views.html.Devault;
import views.html.Joyce;
import views.html.KeliaMoniz;
import views.html.Kolohe;
import views.html.ManageSurfer;
import views.html.ShowSurfer;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render(SurferDB.getSurfers()));
  }
  
  /**
   * Return new surfer page.
   * @return Result of the form.
   */
  public static Result newSurfer() {
    SurferFormData data = new SurferFormData();
    Form<SurferFormData> formData = Form.form(SurferFormData.class).fill(data);
    Map<String, Boolean> typeMap = SurferTypes.getTypes(data.type);
    return ok(ManageSurfer.render(formData, typeMap));
  }
  
  public static Result getSurfer(String slug) {
    return ok(ShowSurfer.render(slug));
  }
  
  /**
   * Method for handling POST methods for the form.
   * @return Result of the form.
   */
  public static Result postSurfer() {
    Form<SurferFormData> formData = Form.form(SurferFormData.class).bindFromRequest();
    if (formData.hasErrors()) {
      Map<String, Boolean> typeMap = SurferTypes.getTypes();
      return badRequest(ManageSurfer.render(formData, typeMap));
    }
    else {
      SurferFormData form = formData.get();
      SurferDB.addSurfer(form);    
      Map<String, Boolean> typeMap = SurferTypes.getTypes(form.type);
      return ok(ManageSurfer.render(formData, typeMap));
    }
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
