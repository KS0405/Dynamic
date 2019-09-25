
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
object editCompany extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Company],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(companyForm:Form[Company]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._;


Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*3.1*/("""    <h1>แก้ไขข้อมูลบริษัท</h1>
    """),_display_(Seq[Any](/*4.6*/form(action = routes.Application.updateCompany())/*4.55*/ {_display_(Seq[Any](format.raw/*4.57*/("""
    """),_display_(Seq[Any](/*5.6*/inputText(companyForm("id"), 'label -> "รหัสบริษัท", 'size -> "13", 'maxlegth -> "10",'readOnly->"readOnly"))),format.raw/*5.114*/("""
    """),_display_(Seq[Any](/*6.6*/inputText(companyForm("name"), 'label -> "ชื่อบริษัท", 'size -> "50", 'maxlegth -> "40"))),format.raw/*6.94*/("""
    """),_display_(Seq[Any](/*7.6*/textarea(companyForm("address"), 'label -> "ที่อยู่", 'row -> "5", 'col -> "50"))),format.raw/*7.86*/("""
    """),_display_(Seq[Any](/*8.6*/textarea(companyForm("detail"), 'label -> "รายละเอียด", 'row -> "5", 'col -> "50"))),format.raw/*8.88*/("""

    <input type="submit" value="บันทึก" class="btn btn-success">
    <input type="reset" value="เคลียร์" class="btn btn-danger">

""")))})),format.raw/*13.2*/("""

    """),_display_(Seq[Any](/*15.6*/if(flash.containsKey("err"))/*15.34*/{_display_(Seq[Any](format.raw/*15.35*/("""
        <div class="alert alert-danger">
    <strong>Error!</strong>
    """),_display_(Seq[Any](/*18.6*/flash/*18.11*/.get("err"))),format.raw/*18.22*/("""
        </div>
    """)))})),format.raw/*20.6*/("""
"""))}
    }
    
    def render(companyForm:Form[Company]): play.api.templates.HtmlFormat.Appendable = apply(companyForm)
    
    def f:((Form[Company]) => play.api.templates.HtmlFormat.Appendable) = (companyForm) => apply(companyForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 25 10:40:53 ICT 2019
                    SOURCE: D:/Proj/app/views/editCompany.scala.html
                    HASH: 1640ed3f7e1c842804ebe7ff9a93b52a7270412c
                    MATRIX: 787->1|925->28|952->47|1022->83|1079->132|1118->134|1158->140|1288->248|1328->254|1437->342|1477->348|1578->428|1618->434|1721->516|1885->649|1927->656|1964->684|2003->685|2113->760|2127->765|2160->776|2212->797
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|33->5|33->5|34->6|34->6|35->7|35->7|36->8|36->8|41->13|43->15|43->15|43->15|46->18|46->18|46->18|48->20
                    -- GENERATED --
                */
            