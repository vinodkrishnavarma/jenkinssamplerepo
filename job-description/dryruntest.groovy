pipelineJob('MyDryrunPipeline') {
  definition {
    cps {
        script(readFileFromWorkspace('jobdsl/job2.groovy'))
        sandbox()
    }
  }
  parameters {
    booleanParam(name: 'dryRun', defaultValue: false, description: 'Running pipeline in dry mode')
  }
}
