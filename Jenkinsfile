pipeline {
	agent any

	tools {
		maven 'maven_devops'
	}

	triggers {
		githubPush()
	}

	environment {
		POM = 'jugandoArreglos/pom.xml'
	}

	stages {
		stage('Descarga') {
			steps {
				git url: 'https://github.com/brayan6603/JugandoArreglos.git', branch: 'main'
			}
		}

		stage('Compilacion') {
			steps {
				sh "mvn -f $POM -B"
			}
		}

		stage('Prueba') {
			steps {
				sh "mvn -f $POM test"
			}
			post {
				always {
					junit 'jugandoArreglos/target/surefire-reports/*.xml'
				}
			}
		}

		stage('Empaquetado') {
			steps {
				archiveArtifacts artifacts: 'jugandoArreglos/target/*.jar', fingerprint: true
			}
		}
	}

	post {
		success {
			echo 'Build succeeded'
		}
		failure {
			echo 'Build failed'
		}
		always {
			cleanWs()
		}
	}
}