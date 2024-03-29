// @SOURCE:D:/Proj/conf/routes
// @HASH:2a23f5647d217e469e915269c5058f7d302eebe7
// @DATE:Wed Sep 25 13:09:22 ICT 2019


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
private[this] lazy val controllers_Application_listCompany10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("listCompany"))))
        

// @LINE:19
private[this] lazy val controllers_Application_newCompany11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newCompany"))))
        

// @LINE:20
private[this] lazy val controllers_Application_createCompany12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createCompany"))))
        

// @LINE:22
private[this] lazy val controllers_Application_editCompany13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editCompany/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_Application_updateCompany14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateCompany"))))
        

// @LINE:25
private[this] lazy val controllers_Application_deleteCompany15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteCompany/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:28
private[this] lazy val controllers_Application_shoes_form_helper16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shoesGetHelper"))))
        

// @LINE:29
private[this] lazy val controllers_Application_shoes_post_helper17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shoesPostHelper"))))
        

// @LINE:31
private[this] lazy val controllers_Application_frmProduct18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product"))))
        

// @LINE:32
private[this] lazy val controllers_Application_postProduct19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("postProduct"))))
        

// @LINE:35
private[this] lazy val controllers_Application_listMovie20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("listMovie"))))
        

// @LINE:36
private[this] lazy val controllers_Application_newMovie21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newMovie"))))
        

// @LINE:37
private[this] lazy val controllers_Application_createMovie22 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createMovie"))))
        

// @LINE:38
private[this] lazy val controllers_Application_editMovie23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editMovie/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:39
private[this] lazy val controllers_Application_updateMovie24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateMovie"))))
        

// @LINE:40
private[this] lazy val controllers_Application_deleteMovie25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteMovie/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:42
private[this] lazy val controllers_Assets_at26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:43
private[this] lazy val controllers_Application_kak27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
        

// @LINE:44
private[this] lazy val controllers_Application_bar28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("photo"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Profile""","""controllers.Application.Pro()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Hobby""","""controllers.Application.hobby()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Travel""","""controllers.Application.travel()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Target""","""controllers.Application.Target()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Mains""","""controllers.Application.Mains()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ShowSneak""","""controllers.Application.ShowSneakers()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ShowSneakersList""","""controllers.Application.ShowSneakersList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """SneakersForm""","""controllers.Application.sneakersForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """postSneakers""","""controllers.Application.post()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """listCompany""","""controllers.Application.listCompany()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newCompany""","""controllers.Application.newCompany()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createCompany""","""controllers.Application.createCompany()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editCompany/$id<[^/]+>""","""controllers.Application.editCompany(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateCompany""","""controllers.Application.updateCompany()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteCompany/$id<[^/]+>""","""controllers.Application.deleteCompany(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shoesGetHelper""","""controllers.Application.shoes_form_helper()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shoesPostHelper""","""controllers.Application.shoes_post_helper()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product""","""controllers.Application.frmProduct()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """postProduct""","""controllers.Application.postProduct()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """listMovie""","""controllers.Application.listMovie()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newMovie""","""controllers.Application.newMovie()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createMovie""","""controllers.Application.createMovie()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editMovie/$id<[^/]+>""","""controllers.Application.editMovie(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateMovie""","""controllers.Application.updateMovie()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteMovie/$id<[^/]+>""","""controllers.Application.deleteMovie(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Application.kak()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """photo""","""controllers.Application.bar()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_Application_listCompany10(params) => {
   call { 
        invokeHandler(controllers.Application.listCompany(), HandlerDef(this, "controllers.Application", "listCompany", Nil,"GET", """""", Routes.prefix + """listCompany"""))
   }
}
        

// @LINE:19
case controllers_Application_newCompany11(params) => {
   call { 
        invokeHandler(controllers.Application.newCompany(), HandlerDef(this, "controllers.Application", "newCompany", Nil,"GET", """""", Routes.prefix + """newCompany"""))
   }
}
        

// @LINE:20
case controllers_Application_createCompany12(params) => {
   call { 
        invokeHandler(controllers.Application.createCompany(), HandlerDef(this, "controllers.Application", "createCompany", Nil,"POST", """""", Routes.prefix + """createCompany"""))
   }
}
        

// @LINE:22
case controllers_Application_editCompany13(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.editCompany(id), HandlerDef(this, "controllers.Application", "editCompany", Seq(classOf[String]),"GET", """""", Routes.prefix + """editCompany/$id<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_Application_updateCompany14(params) => {
   call { 
        invokeHandler(controllers.Application.updateCompany(), HandlerDef(this, "controllers.Application", "updateCompany", Nil,"POST", """""", Routes.prefix + """updateCompany"""))
   }
}
        

// @LINE:25
case controllers_Application_deleteCompany15(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.deleteCompany(id), HandlerDef(this, "controllers.Application", "deleteCompany", Seq(classOf[String]),"GET", """""", Routes.prefix + """deleteCompany/$id<[^/]+>"""))
   }
}
        

// @LINE:28
case controllers_Application_shoes_form_helper16(params) => {
   call { 
        invokeHandler(controllers.Application.shoes_form_helper(), HandlerDef(this, "controllers.Application", "shoes_form_helper", Nil,"GET", """""", Routes.prefix + """shoesGetHelper"""))
   }
}
        

// @LINE:29
case controllers_Application_shoes_post_helper17(params) => {
   call { 
        invokeHandler(controllers.Application.shoes_post_helper(), HandlerDef(this, "controllers.Application", "shoes_post_helper", Nil,"POST", """""", Routes.prefix + """shoesPostHelper"""))
   }
}
        

// @LINE:31
case controllers_Application_frmProduct18(params) => {
   call { 
        invokeHandler(controllers.Application.frmProduct(), HandlerDef(this, "controllers.Application", "frmProduct", Nil,"GET", """""", Routes.prefix + """product"""))
   }
}
        

// @LINE:32
case controllers_Application_postProduct19(params) => {
   call { 
        invokeHandler(controllers.Application.postProduct(), HandlerDef(this, "controllers.Application", "postProduct", Nil,"POST", """""", Routes.prefix + """postProduct"""))
   }
}
        

// @LINE:35
case controllers_Application_listMovie20(params) => {
   call { 
        invokeHandler(controllers.Application.listMovie(), HandlerDef(this, "controllers.Application", "listMovie", Nil,"GET", """""", Routes.prefix + """listMovie"""))
   }
}
        

// @LINE:36
case controllers_Application_newMovie21(params) => {
   call { 
        invokeHandler(controllers.Application.newMovie(), HandlerDef(this, "controllers.Application", "newMovie", Nil,"GET", """""", Routes.prefix + """newMovie"""))
   }
}
        

// @LINE:37
case controllers_Application_createMovie22(params) => {
   call { 
        invokeHandler(controllers.Application.createMovie(), HandlerDef(this, "controllers.Application", "createMovie", Nil,"POST", """""", Routes.prefix + """createMovie"""))
   }
}
        

// @LINE:38
case controllers_Application_editMovie23(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.editMovie(id), HandlerDef(this, "controllers.Application", "editMovie", Seq(classOf[String]),"GET", """""", Routes.prefix + """editMovie/$id<[^/]+>"""))
   }
}
        

// @LINE:39
case controllers_Application_updateMovie24(params) => {
   call { 
        invokeHandler(controllers.Application.updateMovie(), HandlerDef(this, "controllers.Application", "updateMovie", Nil,"POST", """""", Routes.prefix + """updateMovie"""))
   }
}
        

// @LINE:40
case controllers_Application_deleteMovie25(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.deleteMovie(id), HandlerDef(this, "controllers.Application", "deleteMovie", Seq(classOf[String]),"GET", """""", Routes.prefix + """deleteMovie/$id<[^/]+>"""))
   }
}
        

// @LINE:42
case controllers_Assets_at26(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:43
case controllers_Application_kak27(params) => {
   call { 
        invokeHandler(controllers.Application.kak(), HandlerDef(this, "controllers.Application", "kak", Nil,"GET", """""", Routes.prefix + """profile"""))
   }
}
        

// @LINE:44
case controllers_Application_bar28(params) => {
   call { 
        invokeHandler(controllers.Application.bar(), HandlerDef(this, "controllers.Application", "bar", Nil,"GET", """""", Routes.prefix + """photo"""))
   }
}
        
}

}
     