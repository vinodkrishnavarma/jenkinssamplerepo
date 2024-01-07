pipeline {
    agent { label 'built-in' }
    stages {
        stage('test job') {
            steps {
                script {
                    if (params.dryRun) {
                        sh '''echo 'Dry run selected, skipping actual execution.' '''  // Removed extra triple quote
                    } else {
                        sh '''echo 'Dry run not selected, proceeding with actual execution.' '''
                    }
                }
            }
        }
    }
}
