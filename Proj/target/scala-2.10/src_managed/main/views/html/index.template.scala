
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(content:Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""
<nav class="navbar navbar-expand-sm bg-success navbar-light">
        <!--Brand/logo-->
    <a class="navbar-brand" href="/">
        <img src="assets/images/logo.png"alt="logo" style="width:120px;height:120px;">
    </a>
        <!-- Links -->
    <ul class="navbar-nav">
            <!--<li class="nav-item">
                    <a class="nav-link" href="/">Home</a>
                </li>-->
        <li class="nav-item">
            <a class="nav-link" href="/profile">Profile</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/photographyskills">Photography skills</a>
        </li>


    </ul>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-12" style="background-color: tomato">
            <br>
            <h1 style="font-family: AngsanaUPC;" align="center">Dynamic Web Programming</h1>
            <br>
        </div>
    </div>

    <div class="row">
        <div class="col-md-1" style="background-color: white">
             <br>
        </div>
        <div class="col-md-11" style="background-color:lightsalmon">
        """),_display_(Seq[Any](/*37.10*/content)),format.raw/*37.17*/("""
        </div>
    </div>
</div>

"""))}
    }
    
    def render(content:Html): play.api.templates.HtmlFormat.Appendable = apply(content)
    
    def f:((Html) => play.api.templates.HtmlFormat.Appendable) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 04 11:11:04 ICT 2019
                    SOURCE: D:/Dynamic/Proj/app/views/index.scala.html
                    HASH: 1fb782aab905edf22142243b0fc3392f6e8bc78d
                    MATRIX: 772->1|880->15|2027->1126|2056->1133
                    LINES: 26->1|29->1|65->37|65->37
                    -- GENERATED --
                */
            