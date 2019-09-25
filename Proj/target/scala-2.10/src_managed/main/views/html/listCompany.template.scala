
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
object listCompany extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Company],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(companyList:List[Company]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.29*/("""
<h1>รายชื่อบริษัท</h1>

<table class="table table-stripe">
    <tr>
        <th>รหัสบริษัท</th>
        <th>ชื่อบริษัท</th>
        <th>ที่อยู่</th>
        <th>รายละเอียด</th>
        <td><a href="/newCompany" class="btn btn-info">เพิ่มรายชื่อบริษัท</a></td>
    </tr>
    """),_display_(Seq[Any](/*12.6*/for(company <-companyList) yield /*12.32*/{_display_(Seq[Any](format.raw/*12.33*/("""
        <tr>
            <td>"""),_display_(Seq[Any](/*14.18*/company/*14.25*/.getId)),format.raw/*14.31*/("""</td>
            <td>"""),_display_(Seq[Any](/*15.18*/company/*15.25*/.getName)),format.raw/*15.33*/("""</td>
            <td>"""),_display_(Seq[Any](/*16.18*/company/*16.25*/.getAddress)),format.raw/*16.36*/("""</td>
            <td>"""),_display_(Seq[Any](/*17.18*/company/*17.25*/.getDetail)),format.raw/*17.35*/("""</td>
            <td>
                <a href="/editCompany/"""),_display_(Seq[Any](/*19.40*/company/*19.47*/.getId)),format.raw/*19.53*/("""" class="btn btn-info">แก้ไข</a>
                <a href="/deleteCompany/"""),_display_(Seq[Any](/*20.42*/company/*20.49*/.getId)),format.raw/*20.55*/(""""class="btn btn-danger"
                onclick="return confirm('โปรดยืนยันการลบข้อมูลบริษัทที่เลือก?')"
                >ลบ</a>
            </td>

        </tr>
    """)))})),format.raw/*26.6*/("""
</table>
"""))}
    }
    
    def render(companyList:List[Company]): play.api.templates.HtmlFormat.Appendable = apply(companyList)
    
    def f:((List[Company]) => play.api.templates.HtmlFormat.Appendable) = (companyList) => apply(companyList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 25 11:32:59 ICT 2019
                    SOURCE: D:/Proj/app/views/listCompany.scala.html
                    HASH: 3fa77283c9c7422f831808e2bd07637a65bbbdeb
                    MATRIX: 787->1|908->28|1219->304|1261->330|1300->331|1367->362|1383->369|1411->375|1470->398|1486->405|1516->413|1575->436|1591->443|1624->454|1683->477|1699->484|1731->494|1829->556|1845->563|1873->569|1983->643|1999->650|2027->656|2225->823
                    LINES: 26->1|29->1|40->12|40->12|40->12|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|47->19|47->19|47->19|48->20|48->20|48->20|54->26
                    -- GENERATED --
                */
            