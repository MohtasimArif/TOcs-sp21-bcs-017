pipeline {
    agent any // Use any available agent
    
    stages {
        stage('Checkout') {
            steps {
                // Pull the code from the repository
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Example build step for a Java project
                echo 'Building the project...'
                sh './gradlew build' // Or 'mvn clean package' for Maven
            }
        }
        stage('Test') {
            steps {
                // Run tests
                echo 'Running tests...'
                sh './gradlew test' // Or use appropriate test command
            }
        }
        stage('Deploy') {
            steps {
                // Deploy to a server
                echo 'Deploying the application...'
                sh 'scp target/myapp.jar user@server:/path/to/deploy'
            }
        }
    }

    post {
        always {
            // Actions to perform after the pipeline
            echo 'Pipeline completed!'
        }
        success {
            // Actions for successful builds
            echo 'Build succeeded!'
        }
        failure {
            // Actions for failed builds
            echo 'Build failed!'
        }
    }
}
