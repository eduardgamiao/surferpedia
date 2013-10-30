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
   * 
   * @param formData The data from the form.
   * @return The surfer.
   */
  public static Surfer addSurfer(SurferFormData formData) {
    Surfer surfer =
        new Surfer(formData.name, formData.home, formData.awards, formData.carouselURL, formData.bioURL, formData.bio,
            formData.slug, formData.type, formData.footStyle);
    if (surfers.containsKey(surfer.getSlug())) {
      UpdateDB.addUpdate(new Update("Edit", surfer.getName()));
    }
    else {
      UpdateDB.addUpdate(new Update("New", surfer.getName()));
    }
    surfers.put(surfer.getSlug(), surfer);
    slugs.add(surfer.getSlug());
    return surfer;
  }

  /**
   * Return a list of Surfers.
   * 
   * @return A list of Surfers.
   */
  public static List<Surfer> getSurfers() {
    return new ArrayList<Surfer>(surfers.values());
  }

  /**
   * Get a Surfer.
   * 
   * @param slug Slug of Surfer to get.
   * @return The Surfer matching the specified slug.
   */
  public static Surfer getSurfer(String slug) {
    return surfers.get(slug);
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

  /**
   * Remove a slug.
   * 
   * @param slug Slug to remove.
   */
  public static void removeSlug(String slug) {
    slugs.remove(slug);
  }

  /**
   * Return a list of male Surfers.
   * 
   * @return A list of male Surfers.
   */
  public static List<Surfer> getMaleSurfers() {
    List<Surfer> maleSurfers = new ArrayList<Surfer>();
    for (Surfer surfer : surfers.values()) {
      if (surfer.getType().equals("Male")) {
        maleSurfers.add(surfer);
      }
    }
    return maleSurfers;
  }

  /**
   * Return a list of male Surfers.
   * 
   * @return A list of male Surfers.
   */
  public static List<Surfer> getFemaleSurfers() {
    List<Surfer> maleSurfers = new ArrayList<Surfer>();
    for (Surfer surfer : surfers.values()) {
      if (surfer.getType().equals("Female")) {
        maleSurfers.add(surfer);
      }
    }
    return maleSurfers;
  }

  /**
   * Return a list of male Surfers.
   * 
   * @return A list of male Surfers.
   */
  public static List<Surfer> getGromSurfers() {
    List<Surfer> maleSurfers = new ArrayList<Surfer>();
    for (Surfer surfer : surfers.values()) {
      if (surfer.getType().equals("Grom")) {
        maleSurfers.add(surfer);
      }
    }
    return maleSurfers;
  }

  /**
   * Delete a Surfer from the database.
   * 
   * @param slug Slug of Surfer to delete.
   */
  public static void deleteSurfer(String slug) {
    if (!(slugs.isEmpty() && surfers.isEmpty())) {
      int index = 0;
      for (String currentSlug : slugs) {
        if (currentSlug.equals(slug)) {
          break;
        }
        else {
          index++;
        }
      }
      Surfer surfer = getSurfer(slug);
      UpdateDB.addUpdate(new Update("Delete", surfer.getName()));
      surfers.remove(slug);
      slugs.remove(index);
    }
  }

  /**
   * Check if a Surfer exists.
   * 
   * @param slug Slug of surfer.
   * @return True if the Surfer exists, false otherwise.
   */
  public static boolean doesSurferExist(String slug) {
    List<Surfer> surferList = getSurfers();
    Surfer surferToCheck = getSurfer(slug);
    for (Surfer surfer : surferList) {
      if (surferToCheck.equals(surfer)) {
        return false;
      }
    }
    return true;
  }
}
