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
            if (env.BRANCH_NAME == 'master') {
                steps {
                    echo 'Deploying....'
                }
            }
        }

    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '3'))
    }
}