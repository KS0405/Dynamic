
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
object bar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<html>
    <body>
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
                <!-- Brand/logo -->
            <a class="navbar-brand" href="#">
                <img src="assets/images/Dynamic.png" alt="logo" style="width:40px;">
            </a>
                <!-- Links -->
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="Mains">หน้าหลัก</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Hobby">งานอดิเรก</a>
                </li>
                <li class="nav-item">
                <a class="nav-link" href="Travel">สถานที่ท่องเที่ยวที่ชอบ</a>
            </li>
                <li class="nav-item">
                    <a class="nav-link" href="Target">เป้าหมาย</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="product">TEST</a>
                </li>

            </ul>
        </nav>
    </body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 25 10:40:52 ICT 2019
                    SOURCE: D:/Proj/app/views/bar.scala.html
                    HASH: ac5a12f70720cf6dfe8cbf216435643b5aa75976
                    MATRIX: 853->0
                    LINES: 29->1
                    -- GENERATED --
                */
            