object TrackListingApp {
    val component = ReactComponentB[Unit]("Spotify Track Listing")
      .initialState(TrackListingState.empty)
      .renderBackend[TrackListingOps]
      .build

      // http://enear.github.io/2017/03/07/scalajs-react-part1/
      // https://github.com/japgolly/scalajs-react/blob/master/doc/VDOM.md
}
