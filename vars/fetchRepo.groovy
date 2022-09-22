def call(num){
    if(num == 10){
        pipeline{
            agent any
            stages{
                stage("HelloNani"){
                    steps{
                        sh "echo num is $num"
                        def res = libraryResource "hello.txt" 
                        println res
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
