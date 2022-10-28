def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
sh 'mvn package'
}
def newDeploy(WORKSPACE,ip,context)
{
  sh 'scp ${env.WORKSPACE} ubuntu@${ip}:${env.WORKSPACE}${context}.war'
}
