package views.formdata;

import java.util.HashMap;
import java.util.Map;

/**
 * Implements types of Surfers.
 */
public class SurferTypes {
  
  private static String [] types = {"Male", "Female", "Grom"};

  /**
   * Return a mapping of the types of Surfers.
   * @return A mapping of Surfer types.
   */
  public static Map<String, Boolean> getTypes() {
    Map<String, Boolean> surferMap = new HashMap<String, Boolean>();
    for (String type : types) {
      surferMap.put(type, false);
    }
    return surferMap;
  }
  
  /**
   * Return a mapping of the types of Surfers.
   * @param type The type of Surfer.
   * @return A mapping of Surfer types.
   */
  public static Map<String, Boolean> getTypes(String type) {
    Map<String, Boolean> surferMap = SurferTypes.getTypes();
    if (isType(type)) {
      surferMap.put(type, true);
    }
    return surferMap;
  }
  
  /**
   * Check if the Surfer type is valid.
   * @param type The type to check.
   * @return True if the type is valid, false otherwise. 
   */
  public static Boolean isType(String type) {
    return SurferTypes.getTypes().containsKey(type);
  }
}
