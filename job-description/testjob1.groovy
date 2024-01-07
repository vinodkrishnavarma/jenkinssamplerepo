pipelineJob('testjob1') {
  definition {
    cps {
        script(readFileFromWorkspace('jobdsl/job3.groovy'))
        sandbox()
    }
  }
  parameters {
    choiceParam('OPTION', ['option 1 (default)', 'option 2', 'option 3'])
  }
}
