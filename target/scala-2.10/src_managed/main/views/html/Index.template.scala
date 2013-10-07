
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
object Index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/(""" """),_display_(Seq[Any](/*1.21*/Main("Surferpedia")/*1.40*/ {_display_(Seq[Any](format.raw/*1.42*/("""
<div class="container">
  <div id="carousel-example-generic" class="carousel slide">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
      <li data-target="#carousel-example-generic" data-slide-to="1"></li>
      <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <div class="carousel-1"></div>
        <div class="carousel-caption">
          <h3>Micheal Ho</h3>
        </div>
      </div>
      <div class="item">
        <div class="carousel-2"></div>
        <div class="carousel-caption">
          <h3>Malia Manuel</h3>
        </div>
      </div>
      <div class="item">
        <div class="carousel-3"></div>
        <div class="carousel-caption">
          <h3>Dorian Blanchard</h3>
        </div>
      </div>



    </div>

    <!-- Controls -->
    <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev"> <span class="icon-prev"></span>
    </a> <a class="right carousel-control" href="#carousel-example-generic" data-slide="next"> <span class="icon-next"></span>
    </a>
  </div>
</div>
""")))})),format.raw/*42.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 06 14:02:54 HST 2013
                    SOURCE: /Users/eduardgamiao/Desktop/surferpedia/app/views/Index.scala.html
                    HASH: 7dda7e1d8cb2486dc7689f52061e558a406ffaaf
                    MATRIX: 774->1|885->18|922->20|949->39|988->41|2288->1310
                    LINES: 26->1|29->1|29->1|29->1|29->1|70->42
                    -- GENERATED --
                */
            