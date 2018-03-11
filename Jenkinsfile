pipeline {
    agent {
        label 'Lubuntu_VM'
    }
    stages {
        stage('build') {
            steps{
                checkout scm
                sh 'ls'
                sh 'docker images'
            } 
        }
    }
}
