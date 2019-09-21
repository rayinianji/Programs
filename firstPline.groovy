pipelineJob('CIPipeline') {
    definition {
        cps {
            script(readFileFromWorkspace('CI.groovy'))
            sandbox()
        }
    }
}
