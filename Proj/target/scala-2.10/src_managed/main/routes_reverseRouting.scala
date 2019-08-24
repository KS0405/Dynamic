// @SOURCE:D:/Proj/conf/routes
// @HASH:dcbb0e9d13cb00e811394e0e1bb793e4c11324d3
// @DATE:Wed Aug 21 16:39:15 ICT 2019

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:21
class ReverseAssets {
    

// @LINE:21
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:14
def sneakersForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "SneakersForm")
}
                                                

// @LINE:7
def Pro(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Profile")
}
                                                

// @LINE:11
def Mains(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Mains")
}
                                                

// @LINE:23
def bar(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "photo")
}
                                                

// @LINE:15
def post(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "postSneakers")
}
                                                

// @LINE:12
def ShowSneakers(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "ShowSneak")
}
                                                

// @LINE:10
def Target(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Target")
}
                                                

// @LINE:18
def shoes_post_helper(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "shoesPostHelper")
}
                                                

// @LINE:22
def kak(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                                                

// @LINE:8
def hobby(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Hobby")
}
                                                

// @LINE:13
def ShowSneakersList(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "ShowSneakersList")
}
                                                

// @LINE:17
def shoes_form_helper(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shoesGetHelper")
}
                                                

// @LINE:9
def travel(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Travel")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:21
class ReverseAssets {
    

// @LINE:21
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:23
// @LINE:22
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:14
def sneakersForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.sneakersForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "SneakersForm"})
      }
   """
)
                        

// @LINE:7
def Pro : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Pro",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Profile"})
      }
   """
)
                        

// @LINE:11
def Mains : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Mains",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Mains"})
      }
   """
)
                        

// @LINE:23
def bar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.bar",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "photo"})
      }
   """
)
                        

// @LINE:15
def post : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.post",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postSneakers"})
      }
   """
)
                        

// @LINE:12
def ShowSneakers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.ShowSneakers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ShowSneak"})
      }
   """
)
                        

// @LINE:10
def Target : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Target",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Target"})
      }
   """
)
                        

// @LINE:18
def shoes_post_helper : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.shoes_post_helper",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shoesPostHelper"})
      }
   """
)
                        

// @LINE:22
def kak : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.kak",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:8
def hobby : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.hobby",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Hobby"})
      }
   """
)
                        

// @LINE:13
def ShowSneakersList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.ShowSneakersList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ShowSneakersList"})
      }
   """
)
                        

// @LINE:17
def shoes_form_helper : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.shoes_form_helper",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shoesGetHelper"})
      }
   """
)
                        

// @LINE:9
def travel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.travel",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Travel"})
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
        


// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:21
class ReverseAssets {
    

// @LINE:21
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:14
def sneakersForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.sneakersForm(), HandlerDef(this, "controllers.Application", "sneakersForm", Seq(), "GET", """""", _prefix + """SneakersForm""")
)
                      

// @LINE:7
def Pro(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Pro(), HandlerDef(this, "controllers.Application", "Pro", Seq(), "GET", """""", _prefix + """Profile""")
)
                      

// @LINE:11
def Mains(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Mains(), HandlerDef(this, "controllers.Application", "Mains", Seq(), "GET", """""", _prefix + """Mains""")
)
                      

// @LINE:23
def bar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.bar(), HandlerDef(this, "controllers.Application", "bar", Seq(), "GET", """""", _prefix + """photo""")
)
                      

// @LINE:15
def post(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.post(), HandlerDef(this, "controllers.Application", "post", Seq(), "POST", """""", _prefix + """postSneakers""")
)
                      

// @LINE:12
def ShowSneakers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.ShowSneakers(), HandlerDef(this, "controllers.Application", "ShowSneakers", Seq(), "GET", """""", _prefix + """ShowSneak""")
)
                      

// @LINE:10
def Target(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Target(), HandlerDef(this, "controllers.Application", "Target", Seq(), "GET", """""", _prefix + """Target""")
)
                      

// @LINE:18
def shoes_post_helper(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.shoes_post_helper(), HandlerDef(this, "controllers.Application", "shoes_post_helper", Seq(), "POST", """""", _prefix + """shoesPostHelper""")
)
                      

// @LINE:22
def kak(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.kak(), HandlerDef(this, "controllers.Application", "kak", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:8
def hobby(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.hobby(), HandlerDef(this, "controllers.Application", "hobby", Seq(), "GET", """""", _prefix + """Hobby""")
)
                      

// @LINE:13
def ShowSneakersList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.ShowSneakersList(), HandlerDef(this, "controllers.Application", "ShowSneakersList", Seq(), "GET", """""", _prefix + """ShowSneakersList""")
)
                      

// @LINE:17
def shoes_form_helper(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.shoes_form_helper(), HandlerDef(this, "controllers.Application", "shoes_form_helper", Seq(), "GET", """""", _prefix + """shoesGetHelper""")
)
                      

// @LINE:9
def travel(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.travel(), HandlerDef(this, "controllers.Application", "travel", Seq(), "GET", """""", _prefix + """Travel""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    