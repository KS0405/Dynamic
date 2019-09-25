
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
object showProduct extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Product,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(product: Product):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""
<html>
    <head>

    </head>
    <body>
        <div class="container">
            <table class="table table-striped">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Amount</th>
                    <th>Total</th>
                    <th>Discount</th>
                    <th>Net</th>
                </tr>
                <tr>
                    <td>"""),_display_(Seq[Any](/*19.26*/product/*19.33*/.getId)),format.raw/*19.39*/("""</td>
                    <td>"""),_display_(Seq[Any](/*20.26*/product/*20.33*/.getName)),format.raw/*20.41*/("""</td>
                    <td>"""),_display_(Seq[Any](/*21.26*/product/*21.33*/.getPrice)),format.raw/*21.42*/("""</td>
                    <td>"""),_display_(Seq[Any](/*22.26*/product/*22.33*/.getAmount)),format.raw/*22.43*/("""</td>
                    <td>"""),_display_(Seq[Any](/*23.26*/product/*23.33*/.getTotal)),format.raw/*23.42*/("""</td>
                    <td>"""),_display_(Seq[Any](/*24.26*/product/*24.33*/.getDiscount)),format.raw/*24.45*/("""</td>
                    <td>"""),_display_(Seq[Any](/*25.26*/product/*25.33*/.getTotalPrice)),format.raw/*25.47*/("""</td>
                </tr>
            </table>
        </div>
    </body>
</html>"""))}
    }
    
    def render(product:Product): play.api.templates.HtmlFormat.Appendable = apply(product)
    
    def f:((Product) => play.api.templates.HtmlFormat.Appendable) = (product) => apply(product)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 25 10:40:54 ICT 2019
                    SOURCE: D:/Proj/app/views/showProduct.scala.html
                    HASH: 132a026d9737f8f423daf7b6e63b54b4fb10c3f4
                    MATRIX: 781->1|893->19|1384->474|1400->481|1428->487|1495->518|1511->525|1541->533|1608->564|1624->571|1655->580|1722->611|1738->618|1770->628|1837->659|1853->666|1884->675|1951->706|1967->713|2001->725|2068->756|2084->763|2120->777
                    LINES: 26->1|29->1|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25
                    -- GENERATED --
                */
            