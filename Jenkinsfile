node {
   //def mvnHome = tool 'M3'
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/nardost/bookproject.git'
   }
   stage('Build') {
      // Run the maven build
        sh "mvn -Dmaven.test.failure.ignore clean package deploy"
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
}