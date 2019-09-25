
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
object newMovie extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Movie],List[Company],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(myForm:Form[Movie],companyList:List[Company]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._;


Seq[Any](format.raw/*1.48*/("""
<h1>รับข้อมูลภาพยนต์เรื่องใหม่</h1>
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/form(action=routes.Application.createMovie())/*5.47*/{_display_(Seq[Any](format.raw/*5.48*/("""
 """),_display_(Seq[Any](/*6.3*/inputText(myForm("id"),'label->"รหัสภาพยนต์",'size->"15",'Maxlength->"10"))),format.raw/*6.77*/("""
    """),_display_(Seq[Any](/*7.6*/inputText(myForm("title"),'label->"ชื่อภาพยนต์",'size->"50",'Maxlength->"45"))),format.raw/*7.83*/("""
    """),_display_(Seq[Any](/*8.6*/inputText(myForm("actor"),'label->"นักแสดงนำฝ่ายชาย",'size->"50",'Maxlength->"45"))),format.raw/*8.88*/("""
    """),_display_(Seq[Any](/*9.6*/inputText(myForm("actress"),'label->"นักแสดงนำฝ่ายหญิง",'size->"50",'Maxlength->"45"))),format.raw/*9.91*/("""
    """),_display_(Seq[Any](/*10.6*/inputText(myForm("year"),'label->"ปีที่ผลิตภาพยนต์",'size->"5",'Maxlength->"4"))),format.raw/*10.85*/("""
    """),_display_(Seq[Any](/*11.6*/select(myForm("company.id"),options=companyList.map(company=>company.getId->company.getName),'label->"บริษัทผู้ผลิต"))),format.raw/*11.123*/("""
    <input type="submit" value="บันทึก">
    <input type="reset" value="ยกเลิก">

""")))})),format.raw/*15.2*/("""
   """),_display_(Seq[Any](/*16.5*/if(flash.containsKey("errMessage"))/*16.40*/{_display_(Seq[Any](format.raw/*16.41*/("""
   <div class="alert alert-danger">
      <strong>Error!</strong>
      """),_display_(Seq[Any](/*19.8*/flash/*19.13*/.get("errMessage"))),format.raw/*19.31*/("""
   </div>
""")))})))}
    }
    
    def render(myForm:Form[Movie],companyList:List[Company]): play.api.templates.HtmlFormat.Appendable = apply(myForm,companyList)
    
    def f:((Form[Movie],List[Company]) => play.api.templates.HtmlFormat.Appendable) = (myForm,companyList) => apply(myForm,companyList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 25 13:13:57 ICT 2019
                    SOURCE: D:/Proj/app/views/newMovie.scala.html
                    HASH: 8fc49f49637e3dfe39aca08c5f8b8312e9522650
                    MATRIX: 796->1|953->47|1016->102|1052->104|1105->149|1143->150|1180->153|1275->227|1315->233|1413->310|1453->316|1556->398|1596->404|1702->489|1743->495|1844->574|1885->580|2025->697|2140->781|2180->786|2224->821|2263->822|2372->896|2386->901|2426->919
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|35->7|35->7|36->8|36->8|37->9|37->9|38->10|38->10|39->11|39->11|43->15|44->16|44->16|44->16|47->19|47->19|47->19
                    -- GENERATED --
                */
            