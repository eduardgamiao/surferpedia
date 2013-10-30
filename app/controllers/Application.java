package controllers;

import java.util.List;
import java.util.Map;
import models.SurferDB;
import models.UpdateDB;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.FootStyleTypes;
import views.formdata.SurferFormData;
import views.formdata.SurferTypes;
import views.html.Index;
import views.html.ManageSurfer;
import views.html.ShowSurfer;
import views.html.ChangeLog;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * 
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render(SurferDB.getSurfers()));
  }

  /**
   * Return new surfer page.
   * 
   * @return Result of the form.
   */
  public static Result newSurfer() {
    SurferFormData data = new SurferFormData();
    Form<SurferFormData> formData = Form.form(SurferFormData.class).fill(data);
    Map<String, Boolean> typeMap = SurferTypes.getTypes(data.type);
    List<String> styles = FootStyleTypes.getStyleList();
    return ok(ManageSurfer.render(formData, typeMap, false, styles));
  }

  /**
   * Get a Surfer from the database.
   * 
   * @param slug The slug of the Surfer to retrieve.
   * @return The Surfer with the matching slug.
   */
  public static Result getSurfer(String slug) {
    if (SurferDB.ifSlugExist(slug)) {
      return ok(ShowSurfer.render(slug));
    }
    else {
      return badRequest(Index.render(SurferDB.getSurfers()));
    }
  }

  /**
   * Edit a surfer.
   * @param slug SLug of the Surfer to edit.
   * @return A page to edit the Surfer.
   */
  public static Result manageSurfer(String slug) {
    if (SurferDB.ifSlugExist(slug)) {
      SurferFormData data = new SurferFormData(SurferDB.getSurfer(slug));
      Form<SurferFormData> formData = Form.form(SurferFormData.class).fill(data);
      Map<String, Boolean> typeMap = SurferTypes.getTypes(data.type);
      List<String> styles = FootStyleTypes.getStyleList();
      SurferDB.removeSlug(data.slug);
      return ok(ManageSurfer.render(formData, typeMap, true, styles));
    }
    else {
      return badRequest(Index.render(SurferDB.getSurfers()));
    }
  }

  /**
   * Method for handling POST methods for the form.
   * 
   * @return Result of the form.
   */
  public static Result postSurfer() {
    Form<SurferFormData> formData = Form.form(SurferFormData.class).bindFromRequest();
    if (formData.hasErrors()) {
      Map<String, Boolean> typeMap = SurferTypes.getTypes();
      List<String> styles = FootStyleTypes.getStyleList();
      return badRequest(ManageSurfer.render(formData, typeMap, false, styles));
    }
    else {
      SurferFormData form = formData.get();
      SurferDB.addSurfer(form);
      Map<String, Boolean> typeMap = SurferTypes.getTypes(form.type);
      List<String> styles = FootStyleTypes.getStyleList();
      return ok(ManageSurfer.render(formData, typeMap, true, styles));
    }
  }

  /**
   * Delete a surfer.
   * 
   * @param slug Slug of Surfer to delete.
   * @return The index page.
   */
  public static Result deleteSurfer(String slug) {
    SurferDB.deleteSurfer(slug);
    return ok(Index.render(SurferDB.getSurfers()));
  }
  
  /**
   * Render the change log for the database.
   * @return A page of updates.
   */
  public static Result changeLog() {
    return ok(ChangeLog.render(UpdateDB.getUpdates()));
  }
}
