pipelineJob('scale-pods') {
  definition {
    cps {
        script(readFileFromWorkspace('jobdsl/testjob1.groovy'))
        sandbox()
    }
  }
    parameters {
        activeChoiceParam('Env') {
            description('Allows user choose from multiple choices')
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('["Dev-DR", "Prod-DR"]')
                fallbackScript('"fallback choice"')
            }

        }
    }
}
