node('master')
{
  stage ('Preparing')
   {
    println(" preparing ")
   }
   stage ('clone')
   {
     println(" Cloning ")
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
