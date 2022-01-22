import AssemblyKeys._

name := "s3_website"

version := "0.0.1"

scalaVersion := "2.11.12"

scalacOptions += "-feature"

scalacOptions += "-language:implicitConversions"

scalacOptions += "-language:postfixOps"

scalacOptions += "-target:jvm-1.6"

libraryDependencies += "org.yaml" % "snakeyaml" % "1.13"

libraryDependencies += "org.jruby" % "jruby" % "9.3.3.0"

libraryDependencies += "com.amazonaws" % "aws-java-sdk-s3" % "1.12.145" excludeAll ExclusionRule(organization = "com.fasterxml")
libraryDependencies += "com.amazonaws" % "aws-java-sdk-cloudfront" % "1.12.145" excludeAll ExclusionRule(organization = "com.fasterxml")
libraryDependencies += "com.amazonaws" % "aws-java-sdk-sts" % "1.12.145" excludeAll ExclusionRule(organization = "com.fasterxml")

libraryDependencies += "log4j" % "log4j" % "1.2.17"

libraryDependencies += "commons-codec" % "commons-codec" % "1.9"

libraryDependencies += "commons-io" % "commons-io" % "2.4"

libraryDependencies += "org.apache.tika" % "tika-core" % "1.4"

libraryDependencies += "com.lexicalscope.jewelcli" % "jewelcli" % "0.8.9"

libraryDependencies += "org.specs2" %% "specs2" % "2.3.11" % "test"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

jarName in assembly := "s3_website.jar"

test in assembly := {}

mergeStrategy in assembly := {
 case PathList("module-info.class", xs @ _*) => MergeStrategy.discard
 case PathList("META-INF", "MANIFEST.MF", xs @ _*) => MergeStrategy.discard
 case x => MergeStrategy.first
}
