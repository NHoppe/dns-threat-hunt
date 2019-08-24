// Required according to https://github.com/sbt/sbt/issues/4103#issuecomment-509162557
resolvers in ThisBuild += "Artima Maven Repository" at "http://repo.artima.com/releases"

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.7")