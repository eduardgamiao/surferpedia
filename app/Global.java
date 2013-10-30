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
    SurferDB
        .addSurfer(new SurferFormData(
            "Malia Manuel",
            "Hawaii",
            null,
            "http://cdn3.coresites.mpora.com/cooler_new/wp-content/uploads/2013/03/"
            + "Screen-Shot-2013-03-05-at-11.06.28.jpg",
            "http://b.vimeocdn.com/ps/369/581/3695817_300.jpg",
            "Malia Manuel hasn't been a surfer for that long. Let's be honest, surfer Malia Manuel hasn't been a kid "
            + "for too long. At 14, Malia is the new Women's Honda U.S. Open of Surfing presented by O'Neill champion."
            + " Malia was part of the youngest women's final at the Women's Honda U.S. Open of Surfing presented by "
            + "O'Neill in Huntington Beach and took top prize winning with a two-wave score of 14.34 points. Malia "
            + "was surprised by her string of upsets and overall victory since it was her first open and her first ever"
            + " 2-person surfing heat.",
            "maliamanuel", "Female", "Regular"));
    SurferDB
        .addSurfer(new SurferFormData(
            "Michael Ho",
            "Hawaii",
            null,
            "http://www.lat34.com/wp-content/uploads/2009/12/1208_Servais-HIRES-10_Michael-Ho_Andy-Irons_Peter-Mel.jpg",
            "http://www.surfline.com/surfaz/images/ho_michael/1chang_mho_winner.jpg",
            "The most consistent performer of the past three decades on the heaviest stretch of surf in the world "
            + "happens to be one of the smallest. At a mere 5\'5\" and 135 pounds, Michael Ho personally proved size "
            + "to be of little importance when it comes to bravery on the North Shore. His expertise was not limited "
            + "to big surf, as he became a highly successful and feared competitor in all conditions, finishing in the "
            + "ASP Top 16 for 10 consecutive seasons.",
            "michaelho", "Male", "Goofy"));
    SurferDB
        .addSurfer(new SurferFormData(
            "Imaikalani DeVault",
            "Hawaii",
            null,
            "http://1.bp.blogspot.com/_QSMLCW3-TJg/TSZMn2iFMgI/AAAAAAAAAGw/6Fcfb_ucoTk/s1600/imai%2Bbarrel3.jpg",
            "http://p.cdn-surfline.com/AA1/IMG-1655-2-655x_.jpg",
            "The Valley Isle's Imaikalani DeValult is yet another contender from Maui poised to break onto the world "
            + "stage. Like so many of the other Maui boys that came before him, Imai's stomping grounds are the"
            + " rippable peaks of Ho'okipa. Above the lip, he's on the same level as many of his peers and his style "
            + "is downright buttery. Although he's had some solid results in the past, for Imaikalani to further his "
            + "career to the next level, he'll need to make another hard push on the contest scene next year. Lucky"
            + " for him, he's got Volcom's esteemed coach, Dave Riddle, in his corner lighting the path ahead.",
            "imaikalanidevault", "Grom", "Regular"));
  }
  
}
