node {
	stage('SCM Repo') {
			git 'https://github.com/nardost/bookproject.git'
		}
		stage('Build') {
			sh "mvn -Dmaven.test.failure.ignore clean package"
		}
		stage('Test Phase') {
			junit '**/target/surefire-reports/TEST-*.xml'
			mail bcc: '', body: 'Sneding and email through the Jenkinsfile', cc: 'nardostd@yahoo.com', from: 'nardos.tessema@gmail.com', replyTo: 'nardos.tessema@gmail.com', subject: 'Jenkins is Working', to: 'nardostd@gmail.com'
		}
		stage('Package') {
			archive 'target/*.jar' 
	}
}
