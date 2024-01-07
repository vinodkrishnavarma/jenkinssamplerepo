pipelineJob('testjob1') {
  definition {
    cps {
        script(readFileFromWorkspace('jobdsl/testjob1.groovy'))
        sandbox()
    }
  }
  parameters {
    choiceParam('OPTION', ['option 1 (default)', 'option 2', 'option 3'])
  }
}
