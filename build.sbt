name := "apidoc"

lazy val swagger = project
  .in(file("swagger"))
  .dependsOn(generated, lib)
  .aggregate(generated, lib)
  .settings(
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-parser" % "1.0.13"
    )
  )
