
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
object mmanuel extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/(""" """),_display_(Seq[Any](/*1.21*/Main("Malia Manuel")/*1.41*/ {_display_(Seq[Any](format.raw/*1.43*/("""
<div class="container">
  <div class="col-md-4">
  <div class="carousel-2"></div>
  </div>
  <div class="col-md-8">
<p>Surfing has been ingrained in Malia’s blood since she was born. As a baby, her parents would take turns watching her on the sand while the other would catch waves on the beaches of Kauai. As soon as she turned two, Malia started surfing with them. Born and raised in the small lush town of Wailua, Kauai. Malia has been highly influenced by her culture. Her father is born and raised on Kauai and part Hawaiian, her mother is from Southern California, making Malia “hapa haole”, she said laughing.</p>
<p>At the age of 8, she began surfing in contests and fell in love with the surfing industry. “I never planned on being a professional surfer, it kind of chose me”, says Malia. “I’ve been competing since I was 8 years old and to now be one of the 17 Women going for the World Title, seems pretty surreal still.”</p>
<p>Aside from surfing, Malia artistically paints her own surf boards with a Hawaiian / Polynesian theme, inscribed somewhere in her paintings, is the word “KAUNU”. The word, which means “passion” in Hawaiian, embodies her happy-go-lucky spirit. She also is an avid yoga student and runner. Whether it’s hiking in the mountains, going to yoga, running, Malia is the true spirit of island aloha and grace. It’s rare to see her without a smile on her face or doing something other than creating beauty through her art, sport activities, or surfing.</p>
<p>Growing up in Hawaii, she has been highly influenced by the many famous Kauai boys, making her style progressive and fluid, yet incredibly graceful and poised. At 14, Malia is the youngest ever female or male to win the US Open of Surfing (2008), amongst other accomplishments.</p>
<p>Malia is filled with a stoked passion, striking good looks, and all the natural talent to be best surfer in the world. While she loves competing, she is going to do it at her own pace, with a huge smile on her face and with the grace of a Hawaiian dancer.</p>
</div>
</div>
""")))})),format.raw/*14.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 06 14:17:12 HST 2013
                    SOURCE: /Users/eduardgamiao/Desktop/surferpedia/app/views/mmanuel.scala.html
                    HASH: 7db291bd8e52c69df99708647154a53dd8f792dd
                    MATRIX: 776->1|887->18|924->20|952->40|991->42|3073->2093
                    LINES: 26->1|29->1|29->1|29->1|29->1|42->14
                    -- GENERATED --
                */
            