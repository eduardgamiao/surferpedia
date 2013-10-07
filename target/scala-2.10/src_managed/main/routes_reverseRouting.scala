// @SOURCE:/Users/eduardgamiao/Desktop/surferpedia/conf/routes
// @HASH:0d58063285f2afe31ba847590198593b28532078
// @DATE:Sun Oct 06 14:14:04 HST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def page1(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "page1")
}
                                                

// @LINE:9
def mmanuel(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "mmanuel")
}
                                                

// @LINE:8
def mho(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "mho")
}
                                                

// @LINE:10
def dblanchard(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "dblanchard")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def page1 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.page1",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "page1"})
      }
   """
)
                        

// @LINE:9
def mmanuel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.mmanuel",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mmanuel"})
      }
   """
)
                        

// @LINE:8
def mho : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.mho",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mho"})
      }
   """
)
                        

// @LINE:10
def dblanchard : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.dblanchard",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dblanchard"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def page1(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.page1(), HandlerDef(this, "controllers.Application", "page1", Seq(), "GET", """""", _prefix + """page1""")
)
                      

// @LINE:9
def mmanuel(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.mmanuel(), HandlerDef(this, "controllers.Application", "mmanuel", Seq(), "GET", """""", _prefix + """mmanuel""")
)
                      

// @LINE:8
def mho(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.mho(), HandlerDef(this, "controllers.Application", "mho", Seq(), "GET", """""", _prefix + """mho""")
)
                      

// @LINE:10
def dblanchard(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.dblanchard(), HandlerDef(this, "controllers.Application", "dblanchard", Seq(), "GET", """""", _prefix + """dblanchard""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    