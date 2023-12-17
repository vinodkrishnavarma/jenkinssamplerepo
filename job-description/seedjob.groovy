pipeline {
    agent any

    stages {
        stage('Fetch Job DSL scripts') {
            steps {
                git(
                    url: 'https://github.com/vinodkrishnavarma/jenkinssamplerepo.git',
                    branch: 'main',
                    credentialsId: 'github-credentials' // replace with your credential ID
                )
            }
        }
        stage('Process Job DSL scripts') {
            steps {
                // Use the Process Job DSLs plugin to execute the fetched scripts
                sh 'jobdsl-plugin process-dsl < jobdsl/job1.groovy'
            }
        }
    }

    post {
        success {
            echo 'Job DSL scripts processed successfully!'
        }
        failure {
            echo 'Job DSL processing failed!'
        }
    }
}
