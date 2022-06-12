/* groovylint-disable-next-line CompileStatic */
pipeline {
    agent { label 'agent1' }

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
        echo 'Say Hello!'
       }
    }
}
