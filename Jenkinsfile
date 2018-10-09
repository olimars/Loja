pipeline {
  agent any
  stages {
    stage('Ver') {
      steps {
        build(propagate: true, quietPeriod: 1, job: 'fg', wait: true)
      }
    }
  }
}