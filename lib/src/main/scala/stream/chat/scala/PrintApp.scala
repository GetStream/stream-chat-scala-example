package stream.chat.scala

import io.getstream.models.App

object PrintApp extends scala.App {
  println(App.get.request)
}
