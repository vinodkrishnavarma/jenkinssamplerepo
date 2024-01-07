pipelineJob('testjob1') {
  definition {
    cps {
        script(readFileFromWorkspace('jobdsl/testjob1.groovy'))
        sandbox()
    }
  }
  parameters {
    choiceParam('OPTION', ['DryRun (default)', 'Scaledown', 'Scaleup'])
    choiceParam('OPTION', ['No', 'type'])
  }
}
