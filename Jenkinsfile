pipeline {
  agent any
  stages {
    stage('Fase 1') {
      steps {
        echo 'inicio build'
        mail(subject: 'Teste', body: 'E la vamos ', from: 'teste@jenkins.com', replyTo: 'teste@gmail.com', to: 'edgar@skalena.com')
      }
    }

    stage('Fase 2') {
      steps {
        echo 'Fase 2'
      }
    }

  }
}