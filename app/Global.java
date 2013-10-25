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
    //SurferDB.addSurfer(new SurferFormData("Jayson", "Germany", null,
    //   "http://cdn1.cdnme.se/cdn/7/2677323/images/2012/trololo-face_195014788.jpg", "URL", "Lol", "jayson", "Female"));
    SurferDB
        .addSurfer(new SurferFormData(
            "Michael Ho",
            "Hawaii",
            null,
            "http://cdn2.coresites.mpora.com/surfeurope_new/wp-content/uploads/2013/09/Michael-Ho.jpg",
            "http://www.surfline.com/surfaz/images/ho_michael/1chang_mho_winner.jpg",
            "The most consistent performer of the past three decades on the heaviest stretch of surf in the world happens to be one of the smallest. At a mere 5\'5\" and 135 pounds, Michael Ho personally proved size to be of little importance when it comes to bravery on the North Shore. His expertise was not limited to big surf, as he became a highly successful and feared competitor in all conditions, finishing in the ASP Top 16 for 10 consecutive seasons.",
            "michaelho", "Female"));
  }
}
