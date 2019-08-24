
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
object travel extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""
<html>
    <head>
        <title>Travel</title>
    </head>
        <body>
            <h1 align="center"style="background-color: #80bdff">สถานที่ท่องเที่ยวที่ชอบ </h1>
         <div class="row"      >
             <div class="col-sm-2"  style="background-color:lavender;">ภูทับเบิก พิกัดที่ตั้งของภูทับเบิกอยู่ที่ตำบลวังบาล จังหวัดเพชรบูรณ์ มีความสูงจากระดับน้ำทะเลประมาณ 1,768 เมตร ทั้งยังเป็นจุดสูงสุดของจังหวัดเพชรบูรณ์ ความสวยงามของภูทับเบิกที่ใครมาเห็นก็ต้องหลงรัก เห็นจะอยู่ที่ภูมิประเทศ มองออกไปเบื้องหน้าเห็นทะเลภูเขา ป่าไมเขียวชอุ่มอุดมสมบูรณ์ โดยรวมแล้วอากาศที่ภูทับเบิกเย็นสบายตลอดทั้งปี ตอนเช้า ๆ จะมองเห็นหมอกและกลุ่มเมฆสีขาว ตัดกับยอดภูสีเขียว ช่างสวยงามตา อีกทั้งยังเป็นเส้นทางเชื่องโยงสู่แหล่งท่องเที่ยวและประวัติศาสตร์สำคัญอย่าง “อุทยานภูหินร่องกล้า” </div><br>
                 &emsp;<img src="assets/images/Pu1.jpg" width="500"height="500">
                 &emsp;<img src="assets/images/Pu2.jpg" width="500"height="500">


         </div><br>
            <div class="row"      >
                <div class="col-sm-2"  style="background-color: lavenderblush">ฉงชิ่ง มหานครที่ใหญ่ที่สุดทางภาคตะวันตกเฉียงใต้ของจีน หนึ่งในสี่มหานครของประเทศจีน เมืองนี้มีที่เที่ยวมากมาย แต่ละที่ล้วนเดินทางง่ายดายมีทั้ง แหล่งช้อปปิ้ง มีทั้งที่เที่ยวเชิงประวัติศาสตร์ และธรรมชาติที่สุดอลังกาลที่ไม่ควรพลาด</div><br>
                    &emsp;<img src="assets/images/tour.jpg" width="500"height="500">
                    &emsp;<img src="assets/images/C1.jpg" width="500"height="500">
            </div>

        </body>



</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 21 11:27:14 ICT 2019
                    SOURCE: D:/Proj/app/views/travel.scala.html
                    HASH: e193a793794c4a839168a305762d56bbc7f11ff8
                    MATRIX: 768->1|863->3
                    LINES: 26->1|29->1
                    -- GENERATED --
                */
            