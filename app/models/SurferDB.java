package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import views.formdata.SurferFormData;

/**
 * A database of Surfers.
 */
public class SurferDB {

  private static HashMap<String, Surfer> surfers = new HashMap<String, Surfer>();
  private static List<String> slugs = new ArrayList<String>();

  /**
   * Add a Surfer.
   * @param formData The data from the form.
   * @return The surfer.
   */
  public static Surfer addSurfer(SurferFormData formData) {
    Surfer surfer = null;
    if (!slugs.contains(formData.slug)) {
      surfer =
          new Surfer(formData.name, formData.home, formData.awards, formData.carouselURL, formData.bioURL,
              formData.bio, formData.slug, formData.type);
      surfers.put(surfer.getSlug(), surfer);
      slugs.add(surfer.getSlug());
    }
    return surfer;
  }
  
  /**
   * Return a list of Surfers.
   * @return A list of Surfers.
   */
  public static List<Surfer> getSurfers() {
    return new ArrayList<Surfer>(surfers.values());
  }

  /**
   * Add slug if does not exist.
   * 
   * @param slug Slug to add.
   */
  public static void addSlug(String slug) {
    if (!ifSlugExist(slug)) {
      slugs.add(slug);
    }
  }

  /**
   * Checks if the slug is unique (i.e. it does not already exist).
   * 
   * @param slug Slug to check.
   * @return True if the slug already exists, false otherwise.
   */
  public static boolean ifSlugExist(String slug) {
    return slugs.contains(slug);
  }
}
