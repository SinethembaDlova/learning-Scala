package valueLogger

object logger extends App{
  println("Hello world of " + getName.nameToBeGreeted("Sinethemba"))
}

object getName{
  def nameToBeGreeted(name:String) = name
}

