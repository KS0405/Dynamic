
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
object Target extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<html>
    <head>
        <style>
        /* Style the element with the id "myHeader" */
        #myHeader """),format.raw/*5.19*/("""{"""),format.raw/*5.20*/("""
            background-color: lightblue;
            color: black;
            padding: 40px;
            text-align: center;
        """),format.raw/*10.9*/("""}"""),format.raw/*10.10*/("""

        /* Style all elements with the class name "city" */
        .city """),format.raw/*13.15*/("""{"""),format.raw/*13.16*/("""
            background-color: tomato;
            color: white;
            padding: 10px;
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/("""
        </style>
    </head>
    <body>

            <!-- A unique element -->
        <h1 id="myHeader">เป้าหมายในชีวิตของฉัน</h1>

            <!-- Multiple similar elements -->
        <h2 class="city">เรื่องเรียน</h2>
        <p>เรียนให้จบในระดับปริญญาตรี ภานใยระยะเวลา 4 ปี </p>

        <h2 class="city">ครอบครัว</h2>
        <p>ดูแลบิดามารดาในยามแก่เฒ่า</p>

        <h2 class="city">งาน</h2>
        <p>ทำงานในสายอาชีพที่เรียนจบมา</p>

    </body>
</html>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 25 10:40:54 ICT 2019
                    SOURCE: D:/Proj/app/views/Target.scala.html
                    HASH: 03fada62aed11686d4c7cc36cb0e0c5579ef1a61
                    MATRIX: 856->0|990->107|1018->108|1180->243|1209->244|1313->320|1342->321|1469->421|1498->422
                    LINES: 29->1|33->5|33->5|38->10|38->10|41->13|41->13|45->17|45->17
                    -- GENERATED --
                */
            