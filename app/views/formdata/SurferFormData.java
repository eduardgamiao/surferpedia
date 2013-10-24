package views.formdata;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import play.data.validation.ValidationError;
import models.Surfer;
import models.SurferDB;

/**
 * Handles data from the Surfer form.
 */
public class SurferFormData {

  /** Surfer name. */
  public String name;
  
  /** Surfer home. */
  public String home;
  
  /** Surfer awards. */
  public String awards;
  
  /** Carousel URL. */
  public String carouselURL;
  
  /** Bio URL. */
  public String bioURL;
  
  /** Biography. */
  public String bio;
  
  /** Surfer slug. */
  public String slug;
  
  /** Surfer type. */
  public String type;
  
  /**
   * Blank constructor.
   */
  public SurferFormData() {
    
  }
  
  /**
   * SurferFormData constructor.
   * @param name Surfer name.
   * @param home Surfer home.
   * @param awards Surfer awards.
   * @param carouselURL URL for carousel image.
   * @param bioURL URL for biography.
   * @param bio Biography.
   * @param slug Slug identifier.
   * @param type Type of surfer (i.e. Male, Female or Grom).
   */
  public SurferFormData(String name, String home, String awards, String carouselURL, String bioURL, String bio, 
                String slug, String type) {
    this.name = name;
    this.home = home;
    this.awards = awards;
    this.carouselURL = carouselURL;
    this.bioURL = bioURL;
    this.bio = bio;
    this.slug = slug;
    this.type = type;
  }
  
  /**
   * SurferFormData constructor.
   * @param surfer Surfer to be stored in database.
   */
  public SurferFormData(Surfer surfer) {
    this.name = surfer.getName();
    this.home = surfer.getHome();
    this.awards = surfer.getAwards();
    this.carouselURL = surfer.getCarouselURL();
    this.bioURL = surfer.getBioURL();
    this.bio = surfer.getBio();
    this.slug = surfer.getSlug();
    this.type = surfer.getType();
    
  }
  
  /**
   * Provides import validation of SuferFormData.
   * @return A list of errors. The list can be null if no errors are found.
   */
  public List<ValidationError> validate() {
    ArrayList<ValidationError> errors = new ArrayList<ValidationError>();
    
    if (name == null || name.length() == 0) {
      errors.add(new ValidationError("name", "Name is required."));
    }
    if (home == null || home.length() == 0) {
      errors.add(new ValidationError("home", "Name is required."));
    }
    if (carouselURL == null || carouselURL.length() == 0) {
      errors.add(new ValidationError("carouselURL", "Carousel URL is required."));      
    }
    if (bioURL == null || bioURL.length() == 0) {
      errors.add(new ValidationError("bioURL", "Biography URL is required."));      
    }
    if (bio == null || bio.length() == 0) {
      errors.add(new ValidationError("bio", "Biography is required."));
    }
    if (slug == null || slug.length() == 0) {      
      errors.add(new ValidationError("slug", "Slug is required."));
    }
    if (SurferDB.ifSlugExist(slug)) {
      errors.add(new ValidationError("slug", "The slug \"" + slug + "\" already exists."));
    }
    if (!validateSlug(slug)) {
      errors.add(new ValidationError("slug", "Slug needs to be alphanumeric."));      
    }
    if (!SurferTypes.isType(type)) {
      errors.add(new ValidationError("type", "Surfer type \"" + type + "\" is not valid."));        
    }
    
    return errors.isEmpty() ? null : errors;
  }
  
  /**
   * Checks if a slug is alphanumeric.
   * @param slugToCheck The slug to check.
   * @return True if the slug is alphanumeric, false otherwise.
   */
  public Boolean validateSlug(String slugToCheck) {
    Pattern pattern = Pattern.compile("^[A-Za-z0-9]+$");
    Matcher matcher = pattern.matcher(slugToCheck);
    return matcher.matches();
  }
}
