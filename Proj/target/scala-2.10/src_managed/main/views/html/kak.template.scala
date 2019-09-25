
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
object kak extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""
<html>
    <head>
        <title>
    welcome to My Profile
        </title>
    </head>
    <body style="background-color: cornsilk">
        <div class="row">

        </div>

        <h1 align="center" style="background-color: #fd7e14;">Konkanok Supharut</h1>
        <hr align="center" color="orange" size="35" hr>
        <p align="center">
            <img src="assets/images/T.jpg" width="250"height="300">
        </p>
        <br>
        <table class="table table-striped" bgcolor="#ffb6c1" >
            <div align="center"class="col-sm-12"  style="background-color:lavender;">ชื่อเล่น : หยก </div>
            <div align="center"class="col-sm-12"  style="background-color: lightpink">อายุ : 21 </div>
            <div align="center"class="col-sm-12"  style="background-color:lavender;">วันเดือนปีเกิด : วันจันทร์ ที่ 4 เดือน พฤษภาคม 2541 </div>
            <div align="center"class="col-sm-12"  style="background-color:lightpink;">ที่อยู่อาศัย : เอื่ออาทร 135/416 ซ.4/2 ต.เมืองเก่า อ.เมือง จ.ขอนแก่น 40000</div>
            <div align="center"class="col-sm-12"  style="background-color:lavender;">เบอร์โทรศัพท์ : 0933982204 </div>
            <div align="center"class="col-sm-12"  style="background-color:lightpink;">ระดับการศึกษา : มัธยมต้น:เทศบาลบ้านตูม </div>
            <div align="center"class="col-sm-12"  style="background-color:lavender;">ระดับการศึกษา : มัธยมปลาย:กัลยาณวัตร </div>
            <div align="center"class="col-sm-12"  style="background-color:lightpink;">ระดับการศึกษา : ปริญญาตรี:มหาวิทยาลัยเทคโนโลยีราชมงคลอีสาน วิทยาเขตขอนแก่น</div>

        </table>
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
                    DATE: Wed Sep 25 10:40:53 ICT 2019
                    SOURCE: D:/Proj/app/views/kak.scala.html
                    HASH: 50d0373f218b2a2515f54e4a6c2038856df9cd5a
                    MATRIX: 765->1|860->3
                    LINES: 26->1|29->1
                    -- GENERATED --
                */
            