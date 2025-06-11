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
              -Dsonar.login=sqa_ed723ecaad45315bbb97486feacb6a5590e4e477
          '''
        }
      }
    }
  }
}
