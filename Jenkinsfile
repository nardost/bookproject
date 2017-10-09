node {
	stage('SCM Repo') {
			git 'https://github.com/nardost/bookproject.git'
		}
		stage('Build') {
			sh "mvn -Dmaven.test.failure.ignore clean package"
		}
		stage('Test Phase') {
			junit '**/target/surefire-reports/TEST-*.xml'
			mail to: "nardostd@gmail.com",
			cc: "nardostd@yahoo.com",
			replyTo: "nardos.tessema@gmail.com",
			from: "nardos.tessema@gmail.com",
			subject: "Jenkins Job '${JOB_NAME}' ('${BUILD_NUMBER}')"
			body: "Please check the Jenkins pipeline at ${BUILD_URL}."
		}
		stage('Package') {
			archive 'target/*.jar' 
	}
}
