package models;

/**
 * A model for Surfers.
 */
public class Surfer {
  private String name;
  private String home;
  private String awards;
  private String carouselURL;
  private String bioURL;
  private String bio;
  private String slug;
  private String type;
  
  /**
   * Surfer constructor.
   * @param name Surfer name.
   * @param home Surfer home.
   * @param awards Surfer awards.
   * @param carouselURL URL for carousel image.
   * @param bioURL URL for biography.
   * @param bio Biography.
   * @param slug Slug identifier.
   * @param type Type of surfer (i.e. Male, Female or Grom).
   */
  public Surfer(String name, String home, String awards, String carouselURL, String bioURL, String bio, 
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
   * @return the name
   */
  public String getName() {
    return name;
  }
  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
  /**
   * @return the home
   */
  public String getHome() {
    return home;
  }
  /**
   * @param home the home to set
   */
  public void setHome(String home) {
    this.home = home;
  }
  /**
   * @return the awards
   */
  public String getAwards() {
    return awards;
  }
  /**
   * @param awards the awards to set
   */
  public void setAwards(String awards) {
    this.awards = awards;
  }
  /**
   * @return the carouselURL
   */
  public String getCarouselURL() {
    return carouselURL;
  }
  /**
   * @param carouselURL the carouselURL to set
   */
  public void setCarouselURL(String carouselURL) {
    this.carouselURL = carouselURL;
  }
  /**
   * @return the bioURL
   */
  public String getBioURL() {
    return bioURL;
  }
  /**
   * @param bioURL the bioURL to set
   */
  public void setBioURL(String bioURL) {
    this.bioURL = bioURL;
  }
  /**
   * @return the bio
   */
  public String getBio() {
    return bio;
  }
  /**
   * @param bio the bio to set
   */
  public void setBio(String bio) {
    this.bio = bio;
  }
  /**
   * @return the slug
   */
  public String getSlug() {
    return slug;
  }
  /**
   * @param slug the slug to set
   */
  public void setSlug(String slug) {
    this.slug = slug;
  }
  /**
   * @return the type
   */
  public String getType() {
    return type;
  }
  /**
   * @param type the type to set
   */
  public void setType(String type) {
    this.type = type;
  }

}
