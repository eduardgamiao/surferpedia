
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
object Main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.31*/("""

<!DOCTYPE html>

<html>
<head>
<title>"""),_display_(Seq[Any](/*7.9*/page)),format.raw/*7.13*/("""</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<!--  Load site-specific customizations after bootstrap. -->
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.46*/routes/*12.52*/.Assets.at("stylesheets/main.css"))),format.raw/*12.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*13.51*/routes/*13.57*/.Assets.at("images/favicon.png"))),format.raw/*13.89*/("""">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.2/html5shiv.js"></script>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.2.0/respond.js"></script>
        <![endif]-->
</head>
<body>

  <div class="header"></div>

  <!-- Responsive navbar -->
  <div class="navbar navbar-inverse" role="navigation">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <!--  Display three horizontal lines when navbar collapsed. -->
          <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/">surferpedia</a>
      </div>

      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav">
        
          <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Males<b class="caret"></b></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href=""""),_display_(Seq[Any](/*42.29*/routes/*42.35*/.Application.mho())),format.raw/*42.53*/("""">Micheal Ho</a></li>
            </ul>
            
           <li class="dropdown">           
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Females<b class="caret"></b></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href=""""),_display_(Seq[Any](/*48.29*/routes/*48.35*/.Application.mmanuel())),format.raw/*48.57*/("""">Malia Manuel</a></li>
            </ul></li>
                      <li class="dropdown">
             <a class="dropdown-toggle" data-toggle="dropdown" href="#">Groms<b class="caret"></b></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href=""""),_display_(Seq[Any](/*53.29*/routes/*53.35*/.Application.dblanchard())),format.raw/*53.60*/("""">Dorian Blanchard</a></li>
            </ul></li>
        </ul>
      </div>
    </div>
  </div>
  """),_display_(Seq[Any](/*59.4*/content)),format.raw/*59.11*/("""
  <!-- Load Bootstrap JavaScript components. HTMLUnit (used in testing) requires JQuery 1.8.3 or below). -->
  <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
  <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
</body>
</html>
"""))}
    }
    
    def render(page:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(page)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (page) => (content) => apply(page)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 06 14:14:46 HST 2013
                    SOURCE: /Users/eduardgamiao/Desktop/surferpedia/app/views/Main.scala.html
                    HASH: 0ed2a3dc9bc5cbb1953a72e01ffae654c654aef7
                    MATRIX: 778->1|901->30|976->71|1001->75|1324->362|1339->368|1395->402|1484->455|1499->461|1553->493|2785->1689|2800->1695|2840->1713|3156->1993|3171->1999|3215->2021|3524->2294|3539->2300|3586->2325|3722->2426|3751->2433
                    LINES: 26->1|29->1|35->7|35->7|40->12|40->12|40->12|41->13|41->13|41->13|70->42|70->42|70->42|76->48|76->48|76->48|81->53|81->53|81->53|87->59|87->59
                    -- GENERATED --
                */
            