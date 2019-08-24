// @SOURCE:D:/Proj/conf/routes
// @HASH:dcbb0e9d13cb00e811394e0e1bb793e4c11324d3
// @DATE:Wed Aug 21 16:39:15 ICT 2019


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_Pro1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Profile"))))
        

// @LINE:8
private[this] lazy val controllers_Application_hobby2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Hobby"))))
        

// @LINE:9
private[this] lazy val controllers_Application_travel3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Travel"))))
        

// @LINE:10
private[this] lazy val controllers_Application_Target4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Target"))))
        

// @LINE:11
private[this] lazy val controllers_Application_Mains5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Mains"))))
        

// @LINE:12
private[this] lazy val controllers_Application_ShowSneakers6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ShowSneak"))))
        

// @LINE:13
private[this] lazy val controllers_Application_ShowSneakersList7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ShowSneakersList"))))
        

// @LINE:14
private[this] lazy val controllers_Application_sneakersForm8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("SneakersForm"))))
        

// @LINE:15
private[this] lazy val controllers_Application_post9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("postSneakers"))))
        

// @LINE:17
private[this] lazy val controllers_Application_shoes_form_helper10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shoesGetHelper"))))
        

// @LINE:18
private[this] lazy val controllers_Application_shoes_post_helper11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shoesPostHelper"))))
        

// @LINE:21
private[this] lazy val controllers_Assets_at12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:22
private[this] lazy val controllers_Application_kak13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
        

// @LINE:23
private[this] lazy val controllers_Application_bar14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("photo"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Profile""","""controllers.Application.Pro()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Hobby""","""controllers.Application.hobby()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Travel""","""controllers.Application.travel()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Target""","""controllers.Application.Target()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Mains""","""controllers.Application.Mains()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ShowSneak""","""controllers.Application.ShowSneakers()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ShowSneakersList""","""controllers.Application.ShowSneakersList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """SneakersForm""","""controllers.Application.sneakersForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """postSneakers""","""controllers.Application.post()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shoesGetHelper""","""controllers.Application.shoes_form_helper()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shoesPostHelper""","""controllers.Application.shoes_post_helper()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Application.kak()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """photo""","""controllers.Application.bar()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_Pro1(params) => {
   call { 
        invokeHandler(controllers.Application.Pro(), HandlerDef(this, "controllers.Application", "Pro", Nil,"GET", """""", Routes.prefix + """Profile"""))
   }
}
        

// @LINE:8
case controllers_Application_hobby2(params) => {
   call { 
        invokeHandler(controllers.Application.hobby(), HandlerDef(this, "controllers.Application", "hobby", Nil,"GET", """""", Routes.prefix + """Hobby"""))
   }
}
        

// @LINE:9
case controllers_Application_travel3(params) => {
   call { 
        invokeHandler(controllers.Application.travel(), HandlerDef(this, "controllers.Application", "travel", Nil,"GET", """""", Routes.prefix + """Travel"""))
   }
}
        

// @LINE:10
case controllers_Application_Target4(params) => {
   call { 
        invokeHandler(controllers.Application.Target(), HandlerDef(this, "controllers.Application", "Target", Nil,"GET", """""", Routes.prefix + """Target"""))
   }
}
        

// @LINE:11
case controllers_Application_Mains5(params) => {
   call { 
        invokeHandler(controllers.Application.Mains(), HandlerDef(this, "controllers.Application", "Mains", Nil,"GET", """""", Routes.prefix + """Mains"""))
   }
}
        

// @LINE:12
case controllers_Application_ShowSneakers6(params) => {
   call { 
        invokeHandler(controllers.Application.ShowSneakers(), HandlerDef(this, "controllers.Application", "ShowSneakers", Nil,"GET", """""", Routes.prefix + """ShowSneak"""))
   }
}
        

// @LINE:13
case controllers_Application_ShowSneakersList7(params) => {
   call { 
        invokeHandler(controllers.Application.ShowSneakersList(), HandlerDef(this, "controllers.Application", "ShowSneakersList", Nil,"GET", """""", Routes.prefix + """ShowSneakersList"""))
   }
}
        

// @LINE:14
case controllers_Application_sneakersForm8(params) => {
   call { 
        invokeHandler(controllers.Application.sneakersForm(), HandlerDef(this, "controllers.Application", "sneakersForm", Nil,"GET", """""", Routes.prefix + """SneakersForm"""))
   }
}
        

// @LINE:15
case controllers_Application_post9(params) => {
   call { 
        invokeHandler(controllers.Application.post(), HandlerDef(this, "controllers.Application", "post", Nil,"POST", """""", Routes.prefix + """postSneakers"""))
   }
}
        

// @LINE:17
case controllers_Application_shoes_form_helper10(params) => {
   call { 
        invokeHandler(controllers.Application.shoes_form_helper(), HandlerDef(this, "controllers.Application", "shoes_form_helper", Nil,"GET", """""", Routes.prefix + """shoesGetHelper"""))
   }
}
        

// @LINE:18
case controllers_Application_shoes_post_helper11(params) => {
   call { 
        invokeHandler(controllers.Application.shoes_post_helper(), HandlerDef(this, "controllers.Application", "shoes_post_helper", Nil,"POST", """""", Routes.prefix + """shoesPostHelper"""))
   }
}
        

// @LINE:21
case controllers_Assets_at12(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:22
case controllers_Application_kak13(params) => {
   call { 
        invokeHandler(controllers.Application.kak(), HandlerDef(this, "controllers.Application", "kak", Nil,"GET", """""", Routes.prefix + """profile"""))
   }
}
        

// @LINE:23
case controllers_Application_bar14(params) => {
   call { 
        invokeHandler(controllers.Application.bar(), HandlerDef(this, "controllers.Application", "bar", Nil,"GET", """""", Routes.prefix + """photo"""))
   }
}
        
}

}
     