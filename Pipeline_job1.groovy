import jenkins.model.*;
folder ("$ProductName")
{
}
folder("$ProductName/$AppName")
{
}
//pipelineJob("$ProductName/$AppName/CICD-$AppName")
jNameci="$ProductName/$AppName/CI-$AppName"
pipelineJob (jNameci) {
parameters {
        
		stringParam('ProductName',"$ProductName", "ProductName")
    		stringParam('AppName',"$AppName", "Application Name")
           
           }
           
    definition {
        cps {
            script(readFileFromWorkspace('CI.groovy'))
	    //def approvals = org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get()
	    //approvals.approveScript(approvals.hash(jobScript,"groovy"))
            
        }      
    }
}
    
