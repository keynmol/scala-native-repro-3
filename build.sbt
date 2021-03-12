import scala.scalanative.build._

enablePlugins(ScalaNativePlugin)

scalaVersion := "2.13.4"

nativeConfig ~= {
  _.withLTO(LTO.thin)
    .withMode(Mode.releaseFast)
    .withGC(GC.commix)
}

