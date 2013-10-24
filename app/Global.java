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
    SurferDB.addSurfer(new SurferFormData("Jayson", "Germany", null, "URL", "URL", "Lol", "jayson", "Female"));
    SurferDB.addSurfer(new SurferFormData("Lenie", "China", null, "URL", "URL", "Lol", "eduard", "Male"));    
  }
}
