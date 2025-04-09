def call() {
    stage('Checkout') {
        checkout scm
    }
    stage('Unit Tests') {
        echo 'Running unit tests...'
        sh './gradlew test'  // Change this based on your build tool
    }
}
