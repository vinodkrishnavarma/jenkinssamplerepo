pipeline {
    agent { label 'built-in' }
    stages {
stage('test job') {

            steps {
                step ('Run') {
                    if (params.dryRun) {
                    sh '''echo 'Dry run selected, skipping actual execution.''''
                    } else {
                    // Your normal pipeline steps go here...
                     sh ''' echo 'Dry run Notselected, .. actual execution.' '''
                    }
                }
            }
        }
    }
}
