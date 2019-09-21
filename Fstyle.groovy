freeStyleJob("Fstyelejob_gitconfig")
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
