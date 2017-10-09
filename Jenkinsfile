node {
	stage('Build Master') {
		git 'https://github.com/nardost/bookproject.git'
		sh "mvn -Dmaven.test.failure.ignore clean package"
	}
	stage('Build QA') {
		git 'https://github.com/nardost/bookproject/tree/qa'
		sh "mvn -Dmaven.test.failure.ignore clean package"
	}
	stage('Test Phase') {
		junit '**/target/surefire-reports/TEST-*.xml'
	}
	stage('Package') {
		archive 'target/*.jar' 
	}
}