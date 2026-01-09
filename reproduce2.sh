#/bin/bash -e

cd inner
./gradlew -PavoidBug=true publishToMavenLocal

cd ../outer
./gradlew core:dependencyInsight --dependency base --configuration testCompileClasspath
./gradlew -PtriggerBug=true core:dependencyInsight --dependency base --configuration testCompileClasspath

