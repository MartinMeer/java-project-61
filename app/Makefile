run-dist:
	./build/install/app/bin/app
run-dist-help:
	./build/install/app/bin/app -h
run-dist-version:
	./build/install/app/bin/app -V
mkInstallDist:
	./gradlew clean
	./gradlew installDist
lint:
	./gradlew checkstyleMain
dependency:
	./gradlew dependencyUpdates
doc:
	./gradlew javadoc