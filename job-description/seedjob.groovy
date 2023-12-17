pipelineJob('HelloWorldJob') {
    definition {
        cps {
            script(readFileFromWorkspace('jobdsl/job1.groovy'))
            sandbox()
        }
    }
}
