def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
  sh 'mvn package'
}
newDeploy(jobname,ip,context)
{
  sh 'scp /home/ubuntu/.jenkins/workspace/declarativesharedlibrary1/webapp/target/webapp.war ubuntu@172.31.20.104:${context}.war'
}
