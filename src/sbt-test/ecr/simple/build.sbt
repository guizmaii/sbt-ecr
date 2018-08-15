import com.amazonaws.regions.Regions

scalaVersion  := "2.11.8"

enablePlugins(EcrPlugin)

region         in Ecr := Regions.US_EAST_1
