
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
        <th><a href="/newCompany">เพิ่มรายชื่อบริษัทใหม่</a> </th>
    </tr>

    """),_display_(Seq[Any](/*13.6*/for(company <-companyList) yield /*13.32*/{_display_(Seq[Any](format.raw/*13.33*/("""
        <tr>
            <td>"""),_display_(Seq[Any](/*15.18*/company/*15.25*/.getId)),format.raw/*15.31*/("""</td>
            <td>"""),_display_(Seq[Any](/*16.18*/company/*16.25*/.getName)),format.raw/*16.33*/("""</td>
            <td>"""),_display_(Seq[Any](/*17.18*/company/*17.25*/.getAddress)),format.raw/*17.36*/("""</td>
            <td>"""),_display_(Seq[Any](/*18.18*/company/*18.25*/.getDetail)),format.raw/*18.35*/("""</td>

        </tr>
    """)))})),format.raw/*21.6*/("""
</table>
"""))}
    }
    
    def render(companyList:List[Company]): play.api.templates.HtmlFormat.Appendable = apply(companyList)
    
    def f:((List[Company]) => play.api.templates.HtmlFormat.Appendable) = (companyList) => apply(companyList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 10 22:50:11 ICT 2019
                    SOURCE: D:/Dynamic/Proj/app/views/listCompany.scala.html
                    HASH: 144d40f227aeba4d68880819c5676aa4f432657d
                    MATRIX: 787->1|908->28|1204->289|1246->315|1285->316|1352->347|1368->354|1396->360|1455->383|1471->390|1501->398|1560->421|1576->428|1609->439|1668->462|1684->469|1716->479|1773->505
                    LINES: 26->1|29->1|41->13|41->13|41->13|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|49->21
                    -- GENERATED --
                */
            