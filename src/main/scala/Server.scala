import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import akka.http.scaladsl.server.Directives._

import scala.concurrent.ExecutionContext

object Server extends App {

  val host = "0.0.0.0"
  val port = 9000

  implicit val system: ActorSystem = ActorSystem("envex")
  implicit val executor: ExecutionContext = system.dispatcher
  implicit val materializer: ActorMaterializer = ActorMaterializer()

  def tree = 
  {
    path("tree") {
      get {
        complete(Ps.getAll)
      }
    } ~ 
    path("info") {
      get {
        complete("info")
      }
    }
  }

  Http().bindAndHandle(tree, host, port)
}
