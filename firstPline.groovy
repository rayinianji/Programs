pipelineJob('MyFirstPipeLine') {
    definition {
        cps {
            script(readFileFromWorkspace('CI.groovy'))
            sandbox()
        }
    }
}
