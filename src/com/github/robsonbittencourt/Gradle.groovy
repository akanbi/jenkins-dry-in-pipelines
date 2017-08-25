package com.github.robsonbittencourt;

def goalGradle(String goal, boolean addStage = false, Closure body = null) {
	if(addStage) {
		stage("Gradle ${goal}") {
			executeCommandGradle(${goal})
		}
	} else {
		executeCommandGradle(${goal})
	}
}

def executeCommandGradle(String command, Closure body = null) {
	sh "./gradlew ${command}"
}