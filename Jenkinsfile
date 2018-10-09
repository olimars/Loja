pipeline {
  agent any
  stages {
    stage('Ver') {
      steps {
        build(propagate: true, quietPeriod: 1, job: 'loja.java', wait: true)
      }
    }
  }
}