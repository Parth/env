package webapp

object App extends JSApp {
  
  @JSExport
  override def main(): Unit = {
    println("Hello, World!")
    ReactDOM.render(TrackListingApp.component(), dom.document.getElementById("playground"))
  }
}
