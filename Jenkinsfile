@Library('shared-lib') _

pipeline {
    agent any

    stages {
        stage('Common Build') {
            steps {
                commonBuild()  // Calls the logic from commonBuild.groovy
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying to dev environment...'  // Customize per project
            }
        }
    }
}
