def call(string repoUrl){
 	pipeline{
 		agent any
 		stages{
 			stage('tools initialization'){
 				steps{
 					sh 'lscpu'
 					sh 'java -version'
 				}
 			}
 			stage('checkout code'){
 				steps{
 					git branch: 'main'
 					url: "$(repoUrl)"
 				}
 			}
 			stage ('checkout code'){
 				steps{
 					sh 'df -h'
 				}
 			}
 		}
 	}
 }