package views.formdata;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines the types of footstyles.
 */
public class FootStyleTypes {
  
  private static String [] types = {"Regular", "Goofy"};
  
  /**
   * Get foot style list.
   * @return Foot style list.
   */
  public static List<String> getStyleList() {
    List<String> footStyles = new ArrayList<String>();
    for (String current : types) {
      footStyles.add(current);
    }
    return footStyles;
  }
}
