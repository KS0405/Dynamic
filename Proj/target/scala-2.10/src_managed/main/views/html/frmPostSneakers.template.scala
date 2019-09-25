
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
object frmPostSneakers extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<br><br>
    <h1>Input Sneakers Data</h1>
    <link rel="stylesheet" href="/assets/stylesheets/css/bootstap.css">
    <form action="/postSneakers"method="post">
        <table class="table table-striped">
            <tr>
                <td>ชื่อรองเท้า </td>
                <td><input type="text" name="name" size="35"mexlength="30"required></td>
            </tr>
            <tr>
                <td> สี</td>
                <td><input type="text" name="color" size="35"mexlength="30"required> </td>
            </tr>
            <tr>
                <td> ขนาด</td>
                <td> <input type="number" name="size" size="10"mexlength="30"></td>
            </tr>

            <tr>
                <td> แบรนด์</td>
            <td>
                <select name="brand">
                    <option value="Nike">Nike</option>
                    <option value="Adidas">Adidas</option>
                    <option value="New balance">New balance</option>
                    <option value="Onitsuka Tiger">Onitsuka Tiger</option>
                    <option value="Reebok">Reebok</option>
                    <option value="Lacoste">Lacoste</option>
                    <option value="Converse">Converse</option>
                    <option value="Puma">Puma</option>
                    <option value="Vans">Vans</option>
                </select>
            </td>
            </tr>

            <tr>
                <td> ราคา</td>
                <td> <input type="number" name="price" size="10" maxlength="8"></td>

            </tr>
            <tr>
                <td> พื้นรองเท้า</td>
                <td> <textarea name="rubberSoles" cols="65" rows="3" placeholder="ป้อนลักษณะพื้นรองเท้า"></textarea></td>

            </tr>
            <tr>
                <td>หัวรองเท้า </td>
                <td><input type="text" name="shoeHeadStyle" size="35"mexlength="30"required> </td>
            </tr>
            <tr>
                <td>เชือกผูกรองเท้า </td>
                <td><input type="text" name="shoelinetype" size="35"mexlength="30"required>  </td>
            </tr>

            <tr>
                <td>หนังรองเท้า</td>
                <td><input type="text" name="typeOfFabric" size="35"mexlength="30"required>  </td>
            </tr>
            <tr>
                <td>ดีไซต์ </td>
                <td><input type="text" name="design" size="35"mexlength="30"required>  </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save "class="btn-success">
                    <input type="reset" value="clear "class="btn-success">
                </td>

            </tr>

        </table>
    </form>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 25 10:40:53 ICT 2019
                    SOURCE: D:/Proj/app/views/frmPostSneakers.scala.html
                    HASH: b7539bc1dd674509ada9a81c94964adf42d734ab
                    MATRIX: 865->0
                    LINES: 29->1
                    -- GENERATED --
                */
            