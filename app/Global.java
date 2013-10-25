import models.SurferDB;
import play.Application;
import play.GlobalSettings;
import views.formdata.SurferFormData;

/**
 * Global class for Play Framework.
 * 
 * @author eduardgamiao
 * 
 */
public class Global extends GlobalSettings {

  /**
   * Defines an initialization method.
   * 
   * @param app An applcation.
   */
  public void onStart(Application app) {
    SurferDB.addSurfer(new SurferFormData("Eduard", "Hawaii", null, "URL", "URL", "Lol", "eduard", "Male"));
    SurferDB.addSurfer(new SurferFormData("Jayson", "Germany", null, "http://cdn1.cdnme.se/cdn/7/2677323/images/2012/trololo-face_195014788.jpg", "URL", "Lol", "jayson", "Female"));
    SurferDB.addSurfer(new SurferFormData("Lenie", "China", null, "http://www.surfline.com/surfaz/images/ho_michael/1chang_mho_winner.jpg", "URL", "Lol", "eduard", "Male"));    
  }
}
