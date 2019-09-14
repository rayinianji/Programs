freeStyleJob("Myfirst_job_SSH")
{
  description('My first job_SSH')
      scm {
        git {
            remote {
                name('origin')
                url('git@github.com:rayinianji/Programs.git')
            }
        }
      }
}
