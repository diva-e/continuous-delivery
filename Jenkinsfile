pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building....'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing....'
                sh 'mvn verify'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
    post {
        always {
            echo 'I will always say Hello again!'
        }
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '3'))
    }
}