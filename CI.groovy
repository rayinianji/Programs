node('master')
{
wrks = env.WORKSPACE

  stage ('Preparing')
   {
    println(" preparing...... ")
	
	  git(
                url: "https://github.com/rayinianji/Programs.git",
                branch: "master"
	    )
	

	 dir('config') {
          git(
                url: "https://github.com/rayinianji/conf",
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
