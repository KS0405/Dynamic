
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
object me extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(content : Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.18*/("""
<html>
    <head>
        <title>Dynamic Web Programming</title>
        <link type="text/css" rel="stylesheet"
        href="/assets/stylesheets/bootstrap431/css/bootstrap.css">
    </head>
    <body>

        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                    """),_display_(Seq[Any](/*13.22*/bar())),format.raw/*13.27*/("""
                </div>

            </div>
            <div class="row">
                <div class="col-md-2" style="background-color: #0b2e13">

                """),_display_(Seq[Any](/*20.18*/manu())),format.raw/*20.24*/("""

                </div>

                <div class="col-md-10" style="background-color: cornsilk;">

                """),_display_(Seq[Any](/*26.18*/content)),format.raw/*26.25*/("""
                </div>
            </div>
        </div>
    </body>
</html>"""))}
    }
    
    def render(content:Html): play.api.templates.HtmlFormat.Appendable = apply(content)
    
    def f:((Html) => play.api.templates.HtmlFormat.Appendable) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 21 11:08:43 ICT 2019
                    SOURCE: D:/Proj/app/views/me.scala.html
                    HASH: 05e19a007888ca3c3f7a5acaa42a2a322949bdab
                    MATRIX: 769->1|879->17|1248->350|1275->355|1476->520|1504->526|1660->646|1689->653
                    LINES: 26->1|29->1|41->13|41->13|48->20|48->20|54->26|54->26
                    -- GENERATED --
                */
            