pipeline{

    agent any
    tools{
        maven "maven"
    }


    stages{

        stage("SCM checkout"){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Nareshh98/CI-CD_demo2.git']])
            }
        }

        stage("Build Process"){
            steps{
                script{
                    sh 'mvn clean install'
                }
            }
        }

        stage("Build Image"){
            steps{
                script{
                    sh 'docker build -t 'challnaresh/springboot:1.0.'
                }
            }
        }
    }