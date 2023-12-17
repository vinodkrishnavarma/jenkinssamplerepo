pipeline {
    agent { label 'built-in' }
    stages {
        stage('build') {
            steps {
                echo "Hello World!"
            }
        }
    }
}
