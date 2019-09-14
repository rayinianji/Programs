freeStyleJob("Myfirst_job")
{
  description('My first job')
      scm {
        git {
            remote {
                name('origin')
                url('https://github.com/rayinianji/Programs.git')
            }
        }
      }
}
