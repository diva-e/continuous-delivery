pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building ...'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing ...'
                sh 'mvn verify'
            }
            post {
                success {
                    echo 'Test success :)'
                }
                failure {
                    echo 'Test failure :('
                }
            }
        }

        stage('Deploy') {
            steps {
                if (true) {
                    echo 'Deploying ...'
                } else {
                    echo 'Skip Deploying ...'
                }
            }
        }

    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '3'))
    }
}