folder ("$ProductName")
{}
folder ("$ProductName/$AppName")
{}
pipelineJob("$ProductName/$AppName/CICD-$AppName") {
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
