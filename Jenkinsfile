node {
	checkout scm
	stage('Build') {
		sh 'mvn -Dmaven.test.failure.ignore clean package'
	}
	stage('Test') {
		try {
			junit '**/target/surefire-reports/TEST-*.xml'
		} catch(err) {
		mail to: 'nardostd@gmail.com',
			cc: 'nardostd@yahoo.com',
			replyTo: 'nardos.tessema@gmail.com',
			from: 'nardos.tessema@gmail.com',
			subject: "Jenkins Job ${JOB_NAME} #${BUILD_NUMBER} is UNSTABLE",
			body: "Please check the Jenkins pipeline at ${BUILD_URL}."
		}
	}
	stage('Deploy') {
		archive 'target/*.jar' 
	}
}
