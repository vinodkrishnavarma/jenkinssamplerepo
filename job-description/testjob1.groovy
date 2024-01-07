pipelineJob('testjob1') {
  definition {
    cps {
        script(readFileFromWorkspace('jobdsl/job3.groovy'))
        sandbox()
    }
  }
  parameters {
    choiceParam('OPTION', ['DryRun (default)', 'Scaledown', 'Scaleup'])
    choiceParam('OPTION', ['No', 'type'])
  }
}
