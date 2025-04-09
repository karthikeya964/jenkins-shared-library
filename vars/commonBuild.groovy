def call() {
    stage('Checkout') {
        checkout scm
    }
    stage('Unit Tests') {
        echo 'Running unit tests...'
        sh 'mvn test'  // Change this based on your build tool
    }
}
