def call(branchname,reponame){
    print branchname
    println reponame
    git branch: "${branchname}", url: "${reponame}"
    stage("HelloNani"){
        steps{
            sh "echo hello"
        }
    }
}
