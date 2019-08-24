
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
object manu extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Bootstrap Example</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </head>
    <body>

        <div class="container mt-3">
            <div class="dropdown">
                <top type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      LAB
                </top>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="/Profile">lab 1 Profile</a>
                    <a class="dropdown-item" href="/lab2">lab 2 Table</a>
                    <a class="dropdown-item" href="/ShowSneak">lab 3 Class</a>
                    <a class="dropdown-item" href="/ShowSneakersList">Lab 4 Show List</a>
                    <a class="dropdown-item" href="/SneakersForm">Lab 5 SneakersForm</a>
                    <a class="dropdown-item" href="/shoesGetHelper">Lab 6 helper</a>
                    <a class="dropdown-item" href="Lab7">Lab 7</a>
                    <a class="dropdown-item" href="Lab7">Lab 8</a>
                    <a class="dropdown-item" href="Lab7">Lab 9</a>
                    <a class="dropdown-item" href="Lab7">Lab 10</a>
                    <a class="dropdown-item" href="Lab7">Lab 11</a>
                    <a class="dropdown-item" href="Lab7">Lab 12</a>
                    <a class="dropdown-item" href="Lab7">Lab 13</a>
                    <a class="dropdown-item" href="Lab7">Lab 14</a>
                    <a class="dropdown-item" href="Lab7">Lab 15</a>

                </div>
            </div>
        </div>

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
                    DATE: Wed Aug 21 16:38:32 ICT 2019
                    SOURCE: D:/Proj/app/views/manu.scala.html
                    HASH: 21a94ee104b62bf603d2905bfb02de2310d16258
                    MATRIX: 854->0
                    LINES: 29->1
                    -- GENERATED --
                */
            