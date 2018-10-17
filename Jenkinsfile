pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh './gradle build'
      }
    }
    stage('Test') {
      steps {
        sh './gradle check'
      }
    }
  }
  post {
    always {
      archiveArtifacts(artifacts: 'build/libs/**/*.jar', fingerprint: true)
      junit 'build/reports/**/*.xml'

    }

  }
}
