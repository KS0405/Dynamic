
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
object Mymain extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(content : Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.18*/("""
    <head>
        <title>Dynamic Web Programming</title>
        <link type="text/css" rel="stylesheet"
        href="/assets/stylesheets/bootstrap431/css/bootstrap.css">
    </head>
    <body>

        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                    """),_display_(Seq[Any](/*12.22*/bar())),format.raw/*12.27*/("""
                </div>

            </div>
            <div class="row">
                <div class="col-md-2" style="background-color: #0b2e13">

                """),_display_(Seq[Any](/*19.18*/manu())),format.raw/*19.24*/("""

                </div>

                <div class="col-md-10" style="background-color: cornsilk;">

                """),_display_(Seq[Any](/*25.18*/content)),format.raw/*25.25*/("""
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
                    DATE: Wed Sep 25 10:40:53 ICT 2019
                    SOURCE: D:/Proj/app/views/Mymain.scala.html
                    HASH: eb40048540802b26091dce0cce07a7f4fcba4584
                    MATRIX: 773->1|883->17|1245->343|1272->348|1473->513|1501->519|1657->639|1686->646
                    LINES: 26->1|29->1|40->12|40->12|47->19|47->19|53->25|53->25
                    -- GENERATED --
                */
            