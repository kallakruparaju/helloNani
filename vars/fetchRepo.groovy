def call(){
    pipeline{
        agent any
        stages{
            stage("HelloNani"){
                steps{
                    sh "echo hello"
                }
            }
        }
    }
}
