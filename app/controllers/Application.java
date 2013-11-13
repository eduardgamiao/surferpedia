package controllers;

import java.util.Map;
import models.SurferDB;
import models.UpdateDB;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.formdata.LoginFormData;
import views.formdata.SurferFormData;
import views.formdata.SurferTypes;
import views.html.Index;
import views.html.Login;
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
    return ok(Index.render(SurferDB.getSurfers(), Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
  }

  /**
   * Return new surfer page.
   * 
   * @return Result of the form.
   */
  @Security.Authenticated(Secured.class)
  public static Result newSurfer() {
    SurferFormData data = new SurferFormData();
    Form<SurferFormData> formData = Form.form(SurferFormData.class).fill(data);
    Map<String, Boolean> typeMap = SurferTypes.getTypes(data.type);
    return ok(ManageSurfer.render(formData, typeMap, false, Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
  }

  /**
   * Get a Surfer from the database.
   * 
   * @param slug The slug of the Surfer to retrieve.
   * @return The Surfer with the matching slug.
   */
  public static Result getSurfer(String slug) {
    if (SurferDB.ifSlugExist(slug)) {
      return ok(ShowSurfer.render(slug, Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
    }
    else {
      return badRequest(Index.render(SurferDB.getSurfers(), Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
    }
  }

  /**
   * Edit a surfer.
   * @param slug SLug of the Surfer to edit.
   * @return A page to edit the Surfer.
   */
  @Security.Authenticated(Secured.class)
  public static Result manageSurfer(String slug) {
    if (SurferDB.ifSlugExist(slug)) {
      SurferFormData data = new SurferFormData(SurferDB.getSurfer(slug));
      Form<SurferFormData> formData = Form.form(SurferFormData.class).fill(data);
      Map<String, Boolean> typeMap = SurferTypes.getTypes(data.type);
      SurferDB.removeSlug(data.slug);
      return ok(ManageSurfer.render(formData, typeMap, true, Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
    }
    else {
      return badRequest(Index.render(SurferDB.getSurfers(), Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
    }
  }

  /**
   * Method for handling POST methods for the form.
   * 
   * @return Result of the form.
   */
  @Security.Authenticated(Secured.class)
  public static Result postSurfer() {
    Form<SurferFormData> formData = Form.form(SurferFormData.class).bindFromRequest();
    if (formData.hasErrors()) {
      Map<String, Boolean> typeMap = SurferTypes.getTypes();
      return badRequest(ManageSurfer.render(formData, typeMap, false, Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
    }
    else {
      SurferFormData form = formData.get();
      SurferDB.addSurfer(form);
      Map<String, Boolean> typeMap = SurferTypes.getTypes(form.type);
      return ok(ManageSurfer.render(formData, typeMap, true, Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
    }
  }

  /**
   * Delete a surfer.
   * 
   * @param slug Slug of Surfer to delete.
   * @return The index page.
   */
  @Security.Authenticated(Secured.class)
  public static Result deleteSurfer(String slug) {
    SurferDB.deleteSurfer(slug);
    return ok(Index.render(SurferDB.getSurfers(), Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
  }
  
  /**
   * Render the change log for the database.
   * @return A page of updates.
   */
  @Security.Authenticated(Secured.class)
  public static Result changeLog() {
    return ok(ChangeLog.render(UpdateDB.getUpdates(), Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
  }
  
  /**
   * Provides the Login page (only to unauthenticated users). 
   * @return The Login page. 
   */
  public static Result login() {
    Form<LoginFormData> formData = Form.form(LoginFormData.class);
    return ok(Login.render("Login", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx()), formData));
  }

  /**
   * Processes a login form submission from an unauthenticated user. 
   * First we bind the HTTP POST data to an instance of LoginFormData.
   * The binding process will invoke the LoginFormData.validate() method.
   * If errors are found, re-render the page, displaying the error data. 
   * If errors not found, render the page with the good data. 
   * @return The index page with the results of validation. 
   */
  public static Result postLogin() {

    // Get the submitted form data from the request object, and run validation.
    Form<LoginFormData> formData = Form.form(LoginFormData.class).bindFromRequest();

    if (formData.hasErrors()) {
      flash("error", "Login credentials not valid.");
      return badRequest(Login.render("Login", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx()), formData));
    }
    else {
      // email/password OK, so now we set the session variable and only go to authenticated pages.
      session().clear();
      session("email", formData.get().email);
      return redirect(routes.Application.index());
    }
  }
  
  /**
   * Logs out (only for authenticated users) and returns them to the Index page. 
   * @return A redirect to the Index page. 
   */
  @Security.Authenticated(Secured.class)
  public static Result logout() {
    session().clear();
    return redirect(routes.Application.index());
  }
}
