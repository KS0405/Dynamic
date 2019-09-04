
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
object showPostSneakers extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Sneakers,play.api.templates.HtmlFormat.Appendable] {

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
                <th>"""),_display_(Seq[Any](/*19.22*/shoes/*19.27*/.getName())),format.raw/*19.37*/("""</th>
            </tr>

            <tr>
                <th>สี</th>
                <th>"""),_display_(Seq[Any](/*24.22*/shoes/*24.27*/.getColor())),format.raw/*24.38*/("""</th>
            </tr>

            <tr>
                <th>แบรนด์</th>
                <th>"""),_display_(Seq[Any](/*29.22*/shoes/*29.27*/.getBrand())),format.raw/*29.38*/("""</th>
            </tr>

            <tr>
                <th>พื้นรองเท้า</th>
                <th>"""),_display_(Seq[Any](/*34.22*/shoes/*34.27*/.getRubberSoles())),format.raw/*34.44*/("""</th>
            </tr>

            <tr>
                <th>หัวรองเท้า</th>
                <th>"""),_display_(Seq[Any](/*39.22*/shoes/*39.27*/.getShoeHeadStyle())),format.raw/*39.46*/("""</th>
            </tr>

            <tr>
                <th>เชื่อกผูกรองเท้า</th>
                <th>"""),_display_(Seq[Any](/*44.22*/shoes/*44.27*/.getShoelinetype())),format.raw/*44.45*/("""</th>
            </tr>

            <tr>
                <th>ดีไซน์</th>
                <th>"""),_display_(Seq[Any](/*49.22*/shoes/*49.27*/.getDesign())),format.raw/*49.39*/("""</th>
            </tr>

            <tr>
                <th>ราคา</th>
                <th>"""),_display_(Seq[Any](/*54.22*/shoes/*54.27*/.getPrice())),format.raw/*54.38*/("""</th>
            </tr>

            <tr>
                <th>ขนาด</th>
                <th>"""),_display_(Seq[Any](/*59.22*/shoes/*59.27*/.getSize())),format.raw/*59.37*/("""</th>
            </tr>

            <tr>
                <th>ประเภทของผ้า</th>
                <th>"""),_display_(Seq[Any](/*64.22*/shoes/*64.27*/.getTypeOfFabric())),format.raw/*64.45*/("""</th>
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
                    DATE: Wed Sep 04 11:11:05 ICT 2019
                    SOURCE: D:/Dynamic/Proj/app/views/showPostSneakers.scala.html
                    HASH: ab0d110dcf7e8b237c04f3f5e729993eafed6c22
                    MATRIX: 787->1|899->19|1456->540|1470->545|1502->555|1634->651|1648->656|1681->667|1817->767|1831->772|1864->783|2005->888|2019->893|2058->910|2198->1014|2212->1019|2253->1038|2399->1148|2413->1153|2453->1171|2589->1271|2603->1276|2637->1288|2771->1386|2785->1391|2818->1402|2952->1500|2966->1505|2998->1515|3140->1621|3154->1626|3194->1644
                    LINES: 26->1|29->1|47->19|47->19|47->19|52->24|52->24|52->24|57->29|57->29|57->29|62->34|62->34|62->34|67->39|67->39|67->39|72->44|72->44|72->44|77->49|77->49|77->49|82->54|82->54|82->54|87->59|87->59|87->59|92->64|92->64|92->64
                    -- GENERATED --
                */
            