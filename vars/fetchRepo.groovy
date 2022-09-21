def call(num){
    if(num == 10){
        pipeline{
            agent any
            stages{
                stage("HelloNani"){
                    steps{
                        sh "echo num is $num"
                    }
                }
            }
        }
    }
    else{
        pipeline{
            agent any
            stages{
                stage("Hey"){
                    steps{
                        sh "echo num is not 10"
                    }
                }
            }
        }
    }
}
