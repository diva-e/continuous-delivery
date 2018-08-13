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
            when {
                anyOf {
                    branch 'master'
                    branch 'develop'
                }
            }
            steps {
                echo 'Deploying ...'
                sh 'mvn deploy'
            }
        }
    }

    options {
        buildDiscarder(logRotator(numToKeepStr: '3'))
    }
}