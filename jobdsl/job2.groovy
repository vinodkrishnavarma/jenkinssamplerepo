pipeline {
    agent { label 'built-in' }
    stages {
        stage('test job') {
            steps {
                script {  // Use 'script' to enclose conditional logic
                    if (params.dryRun) {
                        sh '''echo 'Dry run selected, skipping actual execution.''''
                    } else {
                        // Normal pipeline steps go here
                        sh '''echo 'Dry run not selected, proceeding with actual execution.''''
                    }
                }
            }
        }
    }
}
