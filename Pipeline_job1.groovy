import jenkins.model.*;
folder ("$ProductName")
{
}
folder("$ProductName/$Appname")
{
}
pipelineJob("$ProductName/$AppName/CICD-$AppName")
{    

parameters {
        
		stringParam('ProductName',"$ProductName", "ProductName")
    		stringParam('AppName',"$AppName", "Application Name")
           
           }
           
    definition {
        cps {
            script(readFileFromWorkspace('CI.groovy'))
            sandbox()
        }      
    }
}
    
