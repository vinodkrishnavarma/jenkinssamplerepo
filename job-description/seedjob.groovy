pipelineJob('python_dsl_job_example') {
    definition {
        cps {
            script(readFileFromWorkspace('job1.groovy'))
            sandbox()
        }
    }
}
