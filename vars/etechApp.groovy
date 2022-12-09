def call(string repourl){
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
 					url: "$(repourl)"
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