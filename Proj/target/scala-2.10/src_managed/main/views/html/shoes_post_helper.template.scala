
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
object shoes_post_helper extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Sneakers,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(shoes : Sneakers):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""
<html>
    <head>
        <title>Show Sneakers Data</title>
        <link rel="stylesheet" href="/assets/stylesheets/css/bootstap.css">
    </head>

    <body>
        <h1>
            Shoes Information
        </h1>
        <div class="container">
            <div class="row">
                <div class="col-md-2" style="..."></div>
                <div class="col-md-8" style="...">
                    <table class="table table-success">
                        <tr>
                            <th>ชื่อรองเท้า</th>
                            <th>"""),_display_(Seq[Any](/*19.34*/shoes/*19.39*/.getName())),format.raw/*19.49*/("""</th>
                        </tr>

                        <tr>
                            <th>สี</th>
                            <th>"""),_display_(Seq[Any](/*24.34*/shoes/*24.39*/.getColor())),format.raw/*24.50*/("""</th>
                        </tr>

                        <tr>
                            <th>แบรนด์</th>
                            <th>"""),_display_(Seq[Any](/*29.34*/shoes/*29.39*/.getBrand())),format.raw/*29.50*/("""</th>
                        </tr>

                        <tr>
                            <th>พื้นรองเท้า</th>
                            <th>"""),_display_(Seq[Any](/*34.34*/shoes/*34.39*/.getRubberSoles())),format.raw/*34.56*/("""</th>
                        </tr>

                        <tr>
                            <th>หัวรองเท้า</th>
                            <th>"""),_display_(Seq[Any](/*39.34*/shoes/*39.39*/.getShoeHeadStyle())),format.raw/*39.58*/("""</th>
                        </tr>

                        <tr>
                            <th>เชื่อกผูกรองเท้า</th>
                            <th>"""),_display_(Seq[Any](/*44.34*/shoes/*44.39*/.getShoelinetype())),format.raw/*44.57*/("""</th>
                        </tr>

                        <tr>
                            <th>ดีไซน์</th>
                            <th>"""),_display_(Seq[Any](/*49.34*/shoes/*49.39*/.getDesign())),format.raw/*49.51*/("""</th>
                        </tr>

                        <tr>
                            <th>ราคา</th>
                            <th>"""),_display_(Seq[Any](/*54.34*/shoes/*54.39*/.getPrice())),format.raw/*54.50*/("""</th>
                        </tr>

                        <tr>
                            <th>ขนาด</th>
                            <th>"""),_display_(Seq[Any](/*59.34*/shoes/*59.39*/.getSize())),format.raw/*59.49*/("""</th>
                        </tr>

                        <tr>
                            <th>ประเภทของผ้า</th>
                            <th>"""),_display_(Seq[Any](/*64.34*/shoes/*64.39*/.getTypeOfFabric())),format.raw/*64.57*/("""</th>
                        </tr>
                    </table>
                </div>
            </div>
        </div>

    </body>

</html>"""))}
    }
    
    def render(shoes:Sneakers): play.api.templates.HtmlFormat.Appendable = apply(shoes)
    
    def f:((Sneakers) => play.api.templates.HtmlFormat.Appendable) = (shoes) => apply(shoes)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 25 10:40:54 ICT 2019
                    SOURCE: D:/Proj/app/views/shoes_post_helper.scala.html
                    HASH: b67928c8f7b2ea5ae0907b7e6f5b13fd302d3a46
                    MATRIX: 788->1|900->19|1491->574|1505->579|1537->589|1712->728|1726->733|1759->744|1938->887|1952->892|1985->903|2169->1051|2183->1056|2222->1073|2405->1220|2419->1225|2460->1244|2649->1397|2663->1402|2703->1420|2882->1563|2896->1568|2930->1580|3107->1721|3121->1726|3154->1737|3331->1878|3345->1883|3377->1893|3562->2042|3576->2047|3616->2065
                    LINES: 26->1|29->1|47->19|47->19|47->19|52->24|52->24|52->24|57->29|57->29|57->29|62->34|62->34|62->34|67->39|67->39|67->39|72->44|72->44|72->44|77->49|77->49|77->49|82->54|82->54|82->54|87->59|87->59|87->59|92->64|92->64|92->64
                    -- GENERATED --
                */
            