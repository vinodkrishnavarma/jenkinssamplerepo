pipeline {
    agent { label 'built-in' }
    stages {
stage('test job') {

            steps {
                if (params.dryRun) {
                echo 'Dry run selected, skipping actual execution.'
                } else {
                // Your normal pipeline steps go here...
                 echo 'Dry run Notselected, .. actual execution.'
            }
            }
        }
    }
}
