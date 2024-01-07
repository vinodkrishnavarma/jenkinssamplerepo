pipelineJob('scale-pods') {
  definition {
    cps {
        script(readFileFromWorkspace('jobdsl/testjob1.groovy'))
        sandbox()
    }
  }
    parameters {
        activeChoiceParam('CHOICE-1') {
            description('Allows user choose from multiple choices')
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('["choice1", "choice2"]')
                fallbackScript('"fallback choice"')
            }

        }
    }
}
