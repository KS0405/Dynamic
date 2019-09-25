
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
object table extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Sneakers,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(sneak:Sneakers):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.18*/("""
<h1>List Information</h1>
<table class="table table-success table-info">
    <tr>
    <td>Name</td>
    <td>"""),_display_(Seq[Any](/*6.10*/sneak/*6.15*/.getName)),format.raw/*6.23*/("""</td>
    </tr>
    <tr>
        <td>Color</td>
        <td>"""),_display_(Seq[Any](/*10.14*/sneak/*10.19*/.getColor)),format.raw/*10.28*/("""</td>
    </tr>
    <tr>
        <td>Size</td>
        <td>"""),_display_(Seq[Any](/*14.14*/sneak/*14.19*/.getSize)),format.raw/*14.27*/("""</td>
    </tr>
    <tr>
        <td>Brand</td>
        <td>"""),_display_(Seq[Any](/*18.14*/sneak/*18.19*/.getBrand)),format.raw/*18.28*/("""</td>
    </tr>
    <tr>
        <td>Gender</td>
        <td>"""),_display_(Seq[Any](/*22.14*/sneak/*22.19*/.getGender)),format.raw/*22.29*/("""</td>
    </tr>
    <tr>
        <td>Price</td>
        <td>"""),_display_(Seq[Any](/*26.14*/sneak/*26.19*/.getPrice)),format.raw/*26.28*/("""</td>
    </tr>
    <tr>
        <td>Rubber Soles</td>
        <td>"""),_display_(Seq[Any](/*30.14*/sneak/*30.19*/.getRubberSoles)),format.raw/*30.34*/("""</td>
    </tr>
    <tr>
        <td>Shoe Head Style</td>
        <td>"""),_display_(Seq[Any](/*34.14*/sneak/*34.19*/.getShoeHeadStyle)),format.raw/*34.36*/("""</td>
    </tr>
    <tr>
        <td>Shoe Line Type</td>
        <td>"""),_display_(Seq[Any](/*38.14*/sneak/*38.19*/.getShoelinetype)),format.raw/*38.35*/("""</td>
    </tr>
    <tr>
        <td>Type of Fabric</td>
        <td>"""),_display_(Seq[Any](/*42.14*/sneak/*42.19*/.getTypeOfFabric)),format.raw/*42.35*/("""</td>
    </tr>
    <tr>
        <td>Design</td>
        <td>"""),_display_(Seq[Any](/*46.14*/sneak/*46.19*/.getDesign)),format.raw/*46.29*/("""</td>
    </tr>



</table>"""))}
    }
    
    def render(sneak:Sneakers): play.api.templates.HtmlFormat.Appendable = apply(sneak)
    
    def f:((Sneakers) => play.api.templates.HtmlFormat.Appendable) = (sneak) => apply(sneak)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 25 10:40:54 ICT 2019
                    SOURCE: D:/Proj/app/views/table.scala.html
                    HASH: 9d678093c2a1df4a91d49a43a1a583968a70b496
                    MATRIX: 776->1|886->17|1036->132|1049->137|1078->145|1179->210|1193->215|1224->224|1324->288|1338->293|1368->301|1469->366|1483->371|1514->380|1616->446|1630->451|1662->461|1763->526|1777->531|1808->540|1916->612|1930->617|1967->632|2078->707|2092->712|2131->729|2241->803|2255->808|2293->824|2403->898|2417->903|2455->919|2557->985|2571->990|2603->1000
                    LINES: 26->1|29->1|34->6|34->6|34->6|38->10|38->10|38->10|42->14|42->14|42->14|46->18|46->18|46->18|50->22|50->22|50->22|54->26|54->26|54->26|58->30|58->30|58->30|62->34|62->34|62->34|66->38|66->38|66->38|70->42|70->42|70->42|74->46|74->46|74->46
                    -- GENERATED --
                */
            