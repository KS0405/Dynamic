// @SOURCE:D:/Dynamic/Proj/conf/routes
// @HASH:2118e216ae499686f985afd66a52aae938c66cad
// @DATE:Tue Sep 10 22:50:11 ICT 2019

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
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

// @LINE:32
class ReverseAssets {
    

// @LINE:32
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:34
// @LINE:33
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
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
                                                

// @LINE:25
def deleteCompany(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deleteCompany/;id" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                

// @LINE:34
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
                                                

// @LINE:29
def shoes_post_helper(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "shoesPostHelper")
}
                                                

// @LINE:33
def kak(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                                                

// @LINE:19
def newCompany(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newCompany")
}
                                                

// @LINE:8
def hobby(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Hobby")
}
                                                

// @LINE:23
def updateCompany(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateCompany")
}
                                                

// @LINE:13
def ShowSneakersList(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "ShowSneakersList")
}
                                                

// @LINE:28
def shoes_form_helper(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shoesGetHelper")
}
                                                

// @LINE:22
def editCompany(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "editCompany/;id" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                

// @LINE:9
def travel(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Travel")
}
                                                

// @LINE:20
def createCompany(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "createCompany")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:17
def listCompany(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "listCompany")
}
                                                
    
}
                          
}
                  


// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
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

// @LINE:32
class ReverseAssets {
    

// @LINE:32
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:34
// @LINE:33
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
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
                        

// @LINE:25
def deleteCompany : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteCompany",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteCompany/;id" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:34
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
                        

// @LINE:29
def shoes_post_helper : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.shoes_post_helper",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shoesPostHelper"})
      }
   """
)
                        

// @LINE:33
def kak : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.kak",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:19
def newCompany : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newCompany",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newCompany"})
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
                        

// @LINE:23
def updateCompany : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateCompany",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateCompany"})
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
                        

// @LINE:28
def shoes_form_helper : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.shoes_form_helper",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shoesGetHelper"})
      }
   """
)
                        

// @LINE:22
def editCompany : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editCompany",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editCompany/;id" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
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
                        

// @LINE:20
def createCompany : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createCompany",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createCompany"})
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
                        

// @LINE:17
def listCompany : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.listCompany",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listCompany"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
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


// @LINE:32
class ReverseAssets {
    

// @LINE:32
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:34
// @LINE:33
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
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
                      

// @LINE:25
def deleteCompany(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteCompany(id), HandlerDef(this, "controllers.Application", "deleteCompany", Seq(classOf[String]), "GET", """""", _prefix + """deleteCompany/;id""")
)
                      

// @LINE:34
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
                      

// @LINE:29
def shoes_post_helper(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.shoes_post_helper(), HandlerDef(this, "controllers.Application", "shoes_post_helper", Seq(), "POST", """""", _prefix + """shoesPostHelper""")
)
                      

// @LINE:33
def kak(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.kak(), HandlerDef(this, "controllers.Application", "kak", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:19
def newCompany(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newCompany(), HandlerDef(this, "controllers.Application", "newCompany", Seq(), "GET", """""", _prefix + """newCompany""")
)
                      

// @LINE:8
def hobby(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.hobby(), HandlerDef(this, "controllers.Application", "hobby", Seq(), "GET", """""", _prefix + """Hobby""")
)
                      

// @LINE:23
def updateCompany(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateCompany(), HandlerDef(this, "controllers.Application", "updateCompany", Seq(), "POST", """""", _prefix + """updateCompany""")
)
                      

// @LINE:13
def ShowSneakersList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.ShowSneakersList(), HandlerDef(this, "controllers.Application", "ShowSneakersList", Seq(), "GET", """""", _prefix + """ShowSneakersList""")
)
                      

// @LINE:28
def shoes_form_helper(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.shoes_form_helper(), HandlerDef(this, "controllers.Application", "shoes_form_helper", Seq(), "GET", """""", _prefix + """shoesGetHelper""")
)
                      

// @LINE:22
def editCompany(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editCompany(id), HandlerDef(this, "controllers.Application", "editCompany", Seq(classOf[String]), "GET", """""", _prefix + """editCompany/;id""")
)
                      

// @LINE:9
def travel(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.travel(), HandlerDef(this, "controllers.Application", "travel", Seq(), "GET", """""", _prefix + """Travel""")
)
                      

// @LINE:20
def createCompany(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createCompany(), HandlerDef(this, "controllers.Application", "createCompany", Seq(), "POST", """""", _prefix + """createCompany""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:17
def listCompany(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.listCompany(), HandlerDef(this, "controllers.Application", "listCompany", Seq(), "GET", """""", _prefix + """listCompany""")
)
                      
    
}
                          
}
        
    