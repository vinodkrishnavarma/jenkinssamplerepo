pipelineJob('MyDryrunPipeline') {
  definition {
    cps {
        script(readFileFromWorkspace('jobdsl/job2.groovy'))
        sandbox()
    }
  }
  context.parameters {
    booleanParam(name: 'dryRun', defaultValue: true, description: 'Running pipeline in dry mode')
  }
}
