package quickstart.action

import xitrum.annotation.GET
import quickstart.component.polymer.TwitterButton

@GET("")
class SiteIndex extends DefaultLayout {
  def execute() {
    
//    addPolymer(TwitterButton.polymer)
//    val twitterButton = newComponent[TwitterButton]()
//    at("polymerForView") = polymerForView
    respondView()
  }
}
