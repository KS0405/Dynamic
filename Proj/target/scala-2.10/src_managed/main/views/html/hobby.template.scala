
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
object hobby extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""
<html>
    <head>
        <title>My Hobby</title>
    </head>
    <br>
    <body>
        <h1 align="center"style="background-color: #ffc107">งานอดิเรกของฉัน</h1>
        <br>
        <h3 align="center" style="background-color: #fd7e14" >ฟังเพลง</h3>
        <div class="row">
            <div align="center"class="col-sm-3"  style="background-color:lavender;">Getsunova</div>
            <div align="center"class="col-sm-3"  style="background-color:lavenderblush;">GOT7</div>
            <div align="center"class="col-sm-3"  style="background-color:lavender;">BlackPink</div>
            <div align="center"class="col-sm-3"  style="background-color:lavenderblush;">Day6</div>
        </div>
        <p><br>
                &emsp;&emsp; <img src="assets/images/get.jpg" width="200"height="200">
                &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<img src="assets/images/got7.jpg" width="200"height="200">
                &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<img src="assets/images/black.jpg" width="200"height="200">
                &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<img src="assets/images/Day6.jpg" width="200"height="200">
        </p>
        <h3 align="center" style="background-color: hotpink" >อ่านหนังสือ</h3>
        <div class="row">
            <div align="center"class="col-sm-3"  style="background-color:lavender;">เวยเวย</div>
            <div align="center"class="col-sm-3"  style="background-color:lavenderblush;">หมื่นฟุต</div>
            <div align="center"class="col-sm-3"  style="background-color:lavender;">Shark Wars1</div>
            <div align="center"class="col-sm-3"  style="background-color:lavenderblush;">Shark Wars2</div>
        </div>
        <p><br>
                &emsp;&emsp;&emsp;<img src="assets/images/wei.jpg" width="200"height="300">
                &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<img src="assets/images/fut.jpg" width="200"height="300">
                &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<img src="assets/images/shark1.jpg" width="200"height="300">
                &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<img src="assets/images/shark2.jpg" width="200"height="300">
        </p>

    </body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 25 10:40:53 ICT 2019
                    SOURCE: D:/Proj/app/views/hobby.scala.html
                    HASH: 1b0bfaa231faaab04a4964b0ee54a0a807000be5
                    MATRIX: 767->1|862->3
                    LINES: 26->1|29->1
                    -- GENERATED --
                */
            