pipeline {
	agent any
	stages {
		stage('SCM Repo') {
			git 'https://github.com/nardost/bookproject.git'
		}
		stage('Build') {
			sh "mvn -Dmaven.test.failure.ignore clean package"
		}
		stage('Test Phase') {
			junit '**/target/surefire-reports/TEST-*.xml'
		}
		stage('Package') {
			archive 'target/*.jar' 
		}
	}
	post {
		always { }
		success { }
		failure { }
		unstable { }
		changed { }
	}
}