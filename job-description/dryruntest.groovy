pipelineJob('MyDryrunPipeline') {
  definition {
    cps {
        script(readFileFromWorkspace('jobdsl/job1.groovy'))
        sandbox()
    }
  }
  parameters {
    booleanParam(name: 'dryRun', defaultValue: true, description: 'Running pipeline in dry mode')
  }
}
