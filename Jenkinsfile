pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building....'
                mvn clean install
            }
        }
        stage('Test') {
            steps {
                echo 'Testing....'
                mvn test
            }
            post {
                failure {
                    echo 'Test failure!'
                }
                success {
                    echo 'Test success!'
                }
            }
        }
        stage('Deploy') {
            echo 'Deploying....'
        }
    }
    post {
        always {
            echo 'I will always say Hello again!'
        }
    }
}