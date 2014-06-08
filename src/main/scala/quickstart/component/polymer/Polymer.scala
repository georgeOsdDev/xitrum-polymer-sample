package quickstart.component.polymer

import xml.Text
import xitrum.{Action, Component}


//trait PolymerCore extends {
//  this: Action => 
//  private val buf = new StringBuilder
//  def addPolymer(polymer: Any) = {
//    buf.append(polymer)
//  }
//  
//  lazy val polymerForView = 
//    if (buf.isEmpty) {
//      ""
//    } else {
//      s"""
//      <script src=${publicUrl("bower_components/platform/platform.js")}></script>
//      ${buf.toString}
//      """
//    }
//}

class TwitterButton extends Component {

  val polymer = <link rel="import" href={publicUrl("bower_components/twitter-button/dist/twitter-button.html")} />

  def render(
      text:    Option[String],
      _type:   Option[String],
      href:    Option[String],
      user:    Option[String],
      hashtag: Option[String],
      height:  Option[String], 
      width:   Option[String]
      ) = {
    
    <twitter-button
      text={text.orNull}
      type={_type.getOrElse("share")}
      href={href.orNull}
      user={user.orNull}
      hashtag={hashtag.orNull}
      height={height.orNull}
      width={width.orNull}
    ></twitter-button>
  }
}
