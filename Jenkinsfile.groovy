pipeline {
    agent {label 'agent1'}

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
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
            sh 'I print it always'
        }
        success {
            sh 'I print in only when success'
        }
    }
}