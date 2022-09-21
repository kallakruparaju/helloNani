def call(branchname,reponame){
    print branchname
    println reponame
    git branch: "${branchname}", url: "${reponame}"
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
