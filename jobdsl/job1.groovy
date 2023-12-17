pipeline {
    agent any

    stages {
        stage('List folders in /tmp') {
            steps {
                script {
                    // Use Groovy File class to access the directory.
                    def tmpDir = new File('/tmp')

                    // Get a list of subdirectories.
                    def subdirs = tmpDir.listFiles(File::isDirectory)

                    // If the directory is empty, inform the user.
                    if (subdirs.size() == 0) {
                        echo '/tmp is empty.'
                    } else {
                        // If folders exist, print them one per line.
                        echo "Folders in /tmp:"
                        subdirs.each { dir -> echo "- $dir.name" }
                    }
                }
            }
        }
    }
}
