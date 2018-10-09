pipeline {
  agent any
  stages {
    stage('va') {
      steps {
        junit(allowEmptyResults: true, keepLongStdio: true, testResults: 'ha')
      }
    }
  }
}