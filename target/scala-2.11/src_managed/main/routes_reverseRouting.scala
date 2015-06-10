// @SOURCE:C:/Users/Alysson/workspace/play2-crud-activator/conf/routes
// @HASH:1d5557f6d2b8aa0091c816d68d5fa4a40f2a785c
// @DATE:Sat May 30 20:54:11 GMT-03:00 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:7
package controllers {

// @LINE:7
class ReverseApplication {


// @LINE:7
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:7
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:7
class ReverseApplication {


// @LINE:7
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
        


// @LINE:7
package controllers.ref {


// @LINE:7
class ReverseApplication {


// @LINE:7
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page
 Home page""", _prefix + """""")
)
                      

}
                          
}
        
    