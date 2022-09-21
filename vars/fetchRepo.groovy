def call(branchname,reponame){
    print branchname
    println reponame
    git branch: "${branchname}", url: "${reponame}"
    pipeline{
        agent any
        stages{
            stage{
                steps{
                    sh "echo hello"
                }
            }
        }
    }
}
