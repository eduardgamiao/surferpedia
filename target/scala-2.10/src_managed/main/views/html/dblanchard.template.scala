
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
object dblanchard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/(""" """),_display_(Seq[Any](/*1.21*/Main("Dorian Blanchard")/*1.45*/ {_display_(Seq[Any](format.raw/*1.47*/("""
<div class="container">
  <div class="col-md-4">
  <div class="carousel-3"></div>
  </div>
  <div class="col-md-8">
  <p>Dorian also likes to skateboard and bodyboard.  And guess what! He lives next door to 3 times World Champ Andy Irons!</p>
</div>
</div>
""")))})),format.raw/*10.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 06 14:18:00 HST 2013
                    SOURCE: /Users/eduardgamiao/Desktop/surferpedia/app/views/dblanchard.scala.html
                    HASH: a8ef21a81935e72bf4da52ff2f78a174d8a57f46
                    MATRIX: 779->1|890->18|927->20|959->44|998->46|1288->305
                    LINES: 26->1|29->1|29->1|29->1|29->1|38->10
                    -- GENERATED --
                */
            