pipeline {
  agent any
  stages {
    stage('Bul') {
      steps {
        build(quietPeriod: 1, job: 'ff')
      }
    }
  }
}