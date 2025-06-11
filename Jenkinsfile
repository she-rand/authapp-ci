pipeline {
  agent any

  tools {
    jdk 'Java21'
    maven 'Maven3'
  }

  environment {
    SONARQUBE_ENV = 'SonarQube'
  }

  stages {
    stage('Checkout') {
      steps {
        git 'https://github.com/TU_USUARIO/authapp-ci.git'
      }
    }

    stage('Build y Test') {
      steps {
        sh 'mvn clean test'
      }
    }

    stage('SonarQube Analysis') {
      steps {
        withSonarQubeEnv("${SONARQUBE_ENV}") {
          sh '''
            mvn sonar:sonar \
              -Dsonar.projectKey=authapp \
              -Dsonar.host.url=http://sonarqube:9000 \
              -Dsonar.login=TU_TOKEN
          '''
        }
      }
    }
  }
}
