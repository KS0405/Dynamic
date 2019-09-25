
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
object listMovie extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Movie],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(movieList:List[Movie]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.25*/("""

<h1>Movie List</h1>
<table class="table table-stripe">
    <tr>
        <td>รหัสภาพยนต์</td>
        <td>ชื่อเรื่อง</td>
        <td>นักแสดงนำฝ่ายชาย</td>
        <td>นักแสดงนำฝ่ายหญิง</td>
        <td>ปี</td>
        <td>บริษัทผู้ผลิต</td>
        <td>ที่อยู่</td>
        <th><a href="/newMovie" class="btn btn-info">เพิ่มรายชื่อภาพยนต์</a> </th>
    </tr>
    """),_display_(Seq[Any](/*15.6*/for(movie <- movieList) yield /*15.29*/{_display_(Seq[Any](format.raw/*15.30*/("""
        <tr>
            <td>"""),_display_(Seq[Any](/*17.18*/movie/*17.23*/.getId)),format.raw/*17.29*/(""" </td>
            <td>"""),_display_(Seq[Any](/*18.18*/movie/*18.23*/.getTitle)),format.raw/*18.32*/("""</td>
            <td>"""),_display_(Seq[Any](/*19.18*/movie/*19.23*/.getActor)),format.raw/*19.32*/("""</td>
            <td>"""),_display_(Seq[Any](/*20.18*/movie/*20.23*/.getActress)),format.raw/*20.34*/("""</td>
            <td>"""),_display_(Seq[Any](/*21.18*/movie/*21.23*/.getYear)),format.raw/*21.31*/("""</td>
            <td>"""),_display_(Seq[Any](/*22.18*/movie/*22.23*/.getCompany.getName)),format.raw/*22.42*/("""</td>
            <td>"""),_display_(Seq[Any](/*23.18*/movie/*23.23*/.getCompany.getAddress)),format.raw/*23.45*/("""</td>

            <td>
                <a href="/editMovie/"""),_display_(Seq[Any](/*26.38*/movie/*26.43*/.getId)),format.raw/*26.49*/("""" class="btn btn-info">แก้ไข</a>
                <a href="/deleteMovie/"""),_display_(Seq[Any](/*27.40*/movie/*27.45*/.getId)),format.raw/*27.51*/(""""class="btn btn-danger"
                onclick="return confirm('โปรดยืนยันการลบข้อมูลภาพยนต์ที่เลือก?')"
                >ลบ</a>
            </td>
        </tr>
    """)))})),format.raw/*32.6*/("""
</table>"""))}
    }
    
    def render(movieList:List[Movie]): play.api.templates.HtmlFormat.Appendable = apply(movieList)
    
    def f:((List[Movie]) => play.api.templates.HtmlFormat.Appendable) = (movieList) => apply(movieList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 25 12:02:22 ICT 2019
                    SOURCE: D:/Proj/app/views/listMovie.scala.html
                    HASH: c6f6266999a700393bc77136d98de408c000585a
                    MATRIX: 783->1|900->24|1301->390|1340->413|1379->414|1446->445|1460->450|1488->456|1548->480|1562->485|1593->494|1652->517|1666->522|1697->531|1756->554|1770->559|1803->570|1862->593|1876->598|1906->606|1965->629|1979->634|2020->653|2079->676|2093->681|2137->703|2234->764|2248->769|2276->775|2384->847|2398->852|2426->858|2624->1025
                    LINES: 26->1|29->1|43->15|43->15|43->15|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|54->26|54->26|54->26|55->27|55->27|55->27|60->32
                    -- GENERATED --
                */
            