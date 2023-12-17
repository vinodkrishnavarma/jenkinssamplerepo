pipelineJob('python_dsl_job_example') {
    definition {
        cps {
            script(readFileFromWorkspace('jobdsl/job1.groovy'))
            sandbox()
        }
    }
}
