pipelineJob('multichoise') {
  definition {
    cps {
        script(readFileFromWorkspace('jobdsl/multichoice-job.groovy'))
        sandbox()
    }
  }
  parameters {
    choiceParam('OPTION', ['option 1 (default)', 'option 2', 'option 3'])
  }
}
