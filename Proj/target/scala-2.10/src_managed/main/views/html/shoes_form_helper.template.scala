
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
object shoes_form_helper extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Sneakers],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(myForm:Form[Sneakers]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._;


Seq[Any](format.raw/*1.25*/("""
"""),format.raw/*3.1*/("""
<html>
    <head>
        <title>My Helper Form</title>
    </head>

    <body>
    """),_display_(Seq[Any](/*10.6*/helper/*10.12*/.form(action = routes.Application.shoes_post_helper())/*10.66*/{_display_(Seq[Any](format.raw/*10.67*/("""
        """),_display_(Seq[Any](/*11.10*/inputText(myForm("name"),'_label ->"ชื่อรองเท้า", 'size->"20" ,'maxlength->"30", 'required->"required"))),format.raw/*11.113*/("""

        """),_display_(Seq[Any](/*13.10*/inputText(myForm("color"),'_label ->"สี",'size->"20" ,'maxlength->"30", 'required->"required"))),format.raw/*13.104*/("""

        """),_display_(Seq[Any](/*15.10*/inputText(myForm("price"),'_label ->"ราคา", 'size->"10",'required->"required"))),format.raw/*15.88*/("""

        """),_display_(Seq[Any](/*17.10*/inputText(myForm("size"),'_label ->"ขนาด", 'size->"10",'required->"required"))),format.raw/*17.87*/("""

        """),_display_(Seq[Any](/*19.10*/select(myForm("brand"),options=Seq("Nike"->"Nike","Adidas"->"Adidas","New balance"->"New balance","Onitsuka Tiger"->"Onitsuka Tiger","Reebok"->"Reebok","Lacoste"->"Lacoste","Converse"->"Converse","Puma"->"Puma","Vans"->"Vans")))),format.raw/*19.237*/("""

        """),_display_(Seq[Any](/*21.10*/inputText(myForm("rubberSoles"),'_label ->"พื้นรองเท้า",'size->"20" ,'maxlength->"30", 'required->"required"))),format.raw/*21.119*/("""

        """),_display_(Seq[Any](/*23.10*/inputText(myForm("shoeHeadStyle"),'_label ->"หัวรองเท้า",'size->"20" ,'maxlength->"30", 'required->"required"))),format.raw/*23.120*/("""

        """),_display_(Seq[Any](/*25.10*/inputText(myForm("shoelinetype"),'_label ->"เชือกผูกรองเท้า",'size->"20" ,'maxlength->"30", 'required->"required"))),format.raw/*25.124*/("""

        """),_display_(Seq[Any](/*27.10*/inputText(myForm("typeOfFabric"),'_label ->"หนังรองเท้า",'size->"20" ,'maxlength->"30", 'required->"required"))),format.raw/*27.120*/("""

        """),_display_(Seq[Any](/*29.10*/inputText(myForm("design"),'_label ->"ดีไซน์",'size->"20" ,'maxlength->"30", 'required->"required"))),format.raw/*29.109*/("""

        <input type="submit" value="บันทึก" class="btn btn-success">
        <input type="reset" value="เคลียร์" class="btn btn-danger">
        """)))})),format.raw/*33.10*/("""

    </body>
</html>





"""))}
    }
    
    def render(myForm:Form[Sneakers]): play.api.templates.HtmlFormat.Appendable = apply(myForm)
    
    def f:((Form[Sneakers]) => play.api.templates.HtmlFormat.Appendable) = (myForm) => apply(myForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 21 16:41:36 ICT 2019
                    SOURCE: D:/Proj/app/views/shoes_form_helper.scala.html
                    HASH: fdb9c607ead03df592c68082c49899781971dc63
                    MATRIX: 794->1|928->24|955->43|1076->129|1091->135|1154->189|1193->190|1239->200|1365->303|1412->314|1529->408|1576->419|1676->497|1723->508|1822->585|1869->596|2119->823|2166->834|2298->943|2345->954|2478->1064|2525->1075|2662->1189|2709->1200|2842->1310|2889->1321|3011->1420|3191->1568
                    LINES: 26->1|30->1|31->3|38->10|38->10|38->10|38->10|39->11|39->11|41->13|41->13|43->15|43->15|45->17|45->17|47->19|47->19|49->21|49->21|51->23|51->23|53->25|53->25|55->27|55->27|57->29|57->29|61->33
                    -- GENERATED --
                */
            