pipeline {
    agent { label 'built-in' }
    stages {
        stage('test job') {
            steps {
                script {
                    if (params.dryRun) {
                        echo 'Dry run selected, skipping actual execution.'
                    } else {
                        echo 'Dry run not selected, proceeding with actual execution.'
                    }
                }
            }
        }
    }
}
