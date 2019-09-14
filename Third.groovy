freeStyleJob("Myfirst_job_SSH")
{
  description('My first job_SSH')
      scm {
        git {
            remote {
                name('origin')
                url('https://github.com/rayinianji/Programs.git')
            }
        }
      }
}
