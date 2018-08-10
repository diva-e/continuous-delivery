node {
    stage('Build') {
        echo 'Building....'
        mvn clean install
    }
    stage('Test') {
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
    stage('Deploy') {
        echo 'Deploying....'
    }
}