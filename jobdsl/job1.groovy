pipeline {
    agent { label 'slave' }
    stages {
        stage('build') {
            steps {
                echo "Hello World!"
            }
        }
    }
}
