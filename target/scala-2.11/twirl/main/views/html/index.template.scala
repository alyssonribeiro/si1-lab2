
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>play2-crud</title>
    </head>
    <body>
	    <ul>
		  <li><a href="/app">CRUD index</a></li>
		</ul>
    </body>
</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat May 30 20:54:12 GMT-03:00 2015
                  SOURCE: C:/Users/Alysson/workspace/play2-crud-activator/app/views/index.scala.html
                  HASH: 072bf89940909324bba02ebf2fd570c895ad397a
                  MATRIX: 798->0
                  LINES: 29->1
                  -- GENERATED --
              */
          