
pipeline {
    agent any
    tools {    
        gradle 'Gradle-8'
    }
    stages {
        stage('Build') { 
            steps {
                sh 'gradle clean build -x test' 
            }
        }
    }
}

