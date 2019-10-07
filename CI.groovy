node('master')
{
wrks = env.WORKSPACE

  stage ('Preparing')
   {
    println(" preparing...... ")
	
	  git(
                url: "https://github.com/rayinianji/pls.git",
                branch: "master"
	    )
	

	 dir('config') {
          git(
                url: "https://github.com/rayinianji/conf.git",
                branch: "master"
	        )  
        }
        
   }
   stage ('clone')
   {
     println(" Cloning--------------- ")
	load 'app/clne.groovy'
   }
     stage ('Build')
   {
   println("Building")
   }
   
   stage ('Deplyo')
   {
   println("Deplyoing")
   }
     stage ('Notify')
   {
   println("Notifying")
   }
   }
