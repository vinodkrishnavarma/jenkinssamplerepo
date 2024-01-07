pipelineJob('scale-pods') {
  definition {
    cps {
        script(readFileFromWorkspace('jobdsl/testjob1.groovy'))
        sandbox()
    }
  }
    parameters {
        activeChoiceParam('Scaling') {
            description('Select the option to scaleup or scale down cluster')
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('["SelectAny", "ScaleUp", "ScaleDown"]')
                fallbackScript('"SelectAny"')
            }

        }
        activeChoiceReactiveParam('Env') {
            description('Allows user choose from multiple choices')
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('["SelectAny", "Dev-DR", "Prod-DR"]')
                fallbackScript('"SelectAny"')
            }
            referencedParameter('Scaling')
        }
        activeChoiceReactiveParam('Cluster') {
            description('Select FE or BE cluster')
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('["SelectAny", "FE", "BE"]')
                fallbackScript('"SelectAny"')
            }
            referencedParameter('Env')
            referencedParameter('Scaling')
        }


    }
}
