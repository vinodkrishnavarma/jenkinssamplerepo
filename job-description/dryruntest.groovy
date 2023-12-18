pipelineJob('MyDryrunPipeline') {
  definition {
    cps {
        script(readFileFromWorkspace('jobdsl/job2.groovy'))
        sandbox()
    }
  }
  parameters {
            Map paramMap = [name: 'dryRun', defaultValue: false, description: 'Running pipeline in dry mode?']
            context.booleanParam(paramMap.name, paramMap.defaultValue, paramMap.description)
  }
}
