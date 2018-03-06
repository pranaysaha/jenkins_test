node('Lubuntu_VM') {
    stage('build') {
	checkout scm
        def dockerContainer = docker.image('pranaysaha/maven-ssh')
        dockerContainer.inside(){
            //sh 'rm -rf jenkins_test'
            // sh 'git clone https://github.com/pranaysaha/jenkins_test.git'
            sh 'ls'
            // sh 'cd jenkins_test/'
            //dir ('jenkins_test') { 
              //  sh 'ls'
               // sh 'mvn package'
            //}

            // sh 'ls'
            sh 'mvn package'
        }