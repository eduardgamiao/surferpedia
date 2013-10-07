
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object mho extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/(""" """),_display_(Seq[Any](/*1.21*/Main("Micheal Ho")/*1.39*/ {_display_(Seq[Any](format.raw/*1.41*/("""
<div class="container">
  <div class="col-md-4">
  <div class="carousel-1"></div>
  </div>
  <div class="col-md-8">
  <p>The most consistent performer of the past three decades on the heaviest stretch of surf in the world happens to
    be one of the smallest. At a mere 5'5" and 135 pounds, Michael Ho personally proved size to be of little importance
    when it comes to bravery on the North Shore. His expertise was not limited to big surf, as he became a highly
    successful and feared competitor in all conditions, finishing in the ASP Top 16 for 10 consecutive seasons.</p>

  <p>Edmund "Chico" Ho was stationed in Cuba, serving in the U.S. Army, when his wife was expecting their first
    child. They wanted desperately to make it back to Hawaii for the blessed event, but came up short as their son
    Michael entered the world in San Mateo, California. Chico was an original Waikiki beach boys, carving tikis, shaping
    boards and fishing to support his growing family (three girls and another boy, 1993 ASP World Champion Derek Ho
    followed). He hoisted Michael onto his shoulders and introduced him to surfing at age three. A few years later, the
    youngster was competing in local amateur events with peers Kainoa and Keone Downing, Clinton Blears and Kenny
    Morrow, soon finding success as the U.S. Boys' amateur champion.</p>

  <p>Inspired by Jeff Hakman, Larry Bertlemann and Reno Abellira, Ho put equal time into developing his big-wave
    riding and hotdog surfing. By age 10, he was surfing Haleiwa on the North Shore. At 15, he represented Hawaii at the
    World Amateur Championships in Ocean Beach and surfed into the finals. After graduation from Kailua High School, he
    set his sights on professional surfing. At the time, he knew of no one getting paid to go surfing, but he was ready
    to test the waters. "Rabbit [Bartholomew] and I were talking about getting money from sponsors on a plane ride from
    somewhere. I got a couple hundred from some wetsuit company, and I was, like, 'whoa.'"</p>

  <p>As the IPS world tour first wandered the globe in 1976, Ho led a formidable Hawaiian assault, rising to third
    in 1978 and establishing himself as a barnacle in the Top 16. He twice won the Hawaiian Triple Crown, the Duke
    Classic and the World Cup, as well as claiming the 1982 Pipe Masters while surfing with a cast on his broken wrist.
    At any venue, his keen sense of positioning and wave knowledge made him an unwelcome draw for any competitor.
    Three-time world champion Tom Curren called Ho the person he least liked to compete against.</p>

  <p>For all his international achievements, nowhere was Ho more dominant than the North Shore of Oahu -- his home
    since age 17. At Sunset Beach, a spot he first surfed at 15, his knowledge of the complex conditions remains
    unparalleled. Older than most of the lineup, he shows few signs of slowing, still an avid competitor and finalist in
    the 1997 Pipe Masters. Married since 1988, he has two children -- Mason and Coco. Both have made their own names in
    professional surfing-- Mason for his air game and barrel riding, and Coco on the women's World Tour.</p>

  <p>Surfing has been, and will remain, Ho's only profession. A competitor in each World Masters Championship since
    its inception in 1997, he came through with a victory in the Over 40 Division in Lafiteria, France, in the 2000
    event. "I never beat Rabbit or MR man-on-man before, so that in itself was a feat." Known as "Uncle Mike" across the
    North Shore, he remains childlike at heart, and his passion for surfing is as strong as ever.</p>
</div>
</div>
""")))})),format.raw/*45.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 06 14:10:18 HST 2013
                    SOURCE: /Users/eduardgamiao/Desktop/surferpedia/app/views/mho.scala.html
                    HASH: 17801bcce7afec6c66bba3218e198654d9e56250
                    MATRIX: 772->1|883->18|920->20|946->38|985->40|4678->3702
                    LINES: 26->1|29->1|29->1|29->1|29->1|73->45
                    -- GENERATED --
                */
            