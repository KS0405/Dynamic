
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
object showSneakersListView extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Sneakers],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/( sneaks:List[Sneakers]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""
<br>
<h1>Sneakers List Information </h1>

<table class="table table-striped">
    <tr>
        <th>Name</th>
        <th>Color</th>
        <th>Size</th>
        <th>Brand</th>
        <th>Gender</th>
        <th>Price</th>
        <th>RubberSoles</th>
        <th>ShoeHeadStyle</th>
        <th>Shoelinetype</th>
        <th>TypeOfFabric</th>
        <th>Design</th>
    </tr>
    """),_display_(Seq[Any](/*19.6*/for(sn<-sneaks) yield /*19.21*/{_display_(Seq[Any](format.raw/*19.22*/("""
        <tr>
           <td>"""),_display_(Seq[Any](/*21.17*/sn/*21.19*/.getName)),format.raw/*21.27*/("""</td>
            <td>"""),_display_(Seq[Any](/*22.18*/sn/*22.20*/.getColor)),format.raw/*22.29*/("""</td>
            <td>"""),_display_(Seq[Any](/*23.18*/sn/*23.20*/.getSize)),format.raw/*23.28*/("""</td>
            <td>"""),_display_(Seq[Any](/*24.18*/sn/*24.20*/.getBrand)),format.raw/*24.29*/("""</td>
            <td>"""),_display_(Seq[Any](/*25.18*/sn/*25.20*/.getGender)),format.raw/*25.30*/("""</td>
            <td>"""),_display_(Seq[Any](/*26.18*/sn/*26.20*/.getPrice)),format.raw/*26.29*/("""</td>
            <td>"""),_display_(Seq[Any](/*27.18*/sn/*27.20*/.getRubberSoles)),format.raw/*27.35*/("""</td>
            <td>"""),_display_(Seq[Any](/*28.18*/sn/*28.20*/.getShoeHeadStyle)),format.raw/*28.37*/("""</td>
            <td>"""),_display_(Seq[Any](/*29.18*/sn/*29.20*/.getShoelinetype)),format.raw/*29.36*/("""</td>
            <td>"""),_display_(Seq[Any](/*30.18*/sn/*30.20*/.getTypeOfFabric)),format.raw/*30.36*/("""</td>
            <td>"""),_display_(Seq[Any](/*31.18*/sn/*31.20*/.getDesign)),format.raw/*31.30*/("""</td>
        </tr>
    """)))})),format.raw/*33.6*/("""
</table>"""))}
    }
    
    def render(sneaks:List[Sneakers]): play.api.templates.HtmlFormat.Appendable = apply(sneaks)
    
    def f:((List[Sneakers]) => play.api.templates.HtmlFormat.Appendable) = (sneaks) => apply(sneaks)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 04 11:11:05 ICT 2019
                    SOURCE: D:/Dynamic/Proj/app/views/showSneakersListView.scala.html
                    HASH: 2ba5309ff978294d344d008cf2a9165232f931e0
                    MATRIX: 797->1|915->25|1334->409|1365->424|1404->425|1470->455|1481->457|1511->465|1570->488|1581->490|1612->499|1671->522|1682->524|1712->532|1771->555|1782->557|1813->566|1872->589|1883->591|1915->601|1974->624|1985->626|2016->635|2075->658|2086->660|2123->675|2182->698|2193->700|2232->717|2291->740|2302->742|2340->758|2399->781|2410->783|2448->799|2507->822|2518->824|2550->834|2606->859
                    LINES: 26->1|29->1|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|61->33
                    -- GENERATED --
                */
            