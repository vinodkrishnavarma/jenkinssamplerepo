pipelineJob('scale-pods') {
  definition {
    cps {
        script(readFileFromWorkspace('jobdsl/testjob1.groovy'))
        sandbox()
    }
  }
    parameters {
        activeChoiceParam('States') {
            description('Select a state option')
            filterable()
            choiceType('SINGLE_SELECT')
            groovyScript {
                script('["Sao Paulo", "Rio de Janeiro", "Parana:selected", "Acre"]')
                fallbackScript('return ["ERROR"]')
            }
        }
        activeChoiceReactiveParam('Cities') {
            description('Active Choices Reactive parameter')
            filterable()
            choiceType('CHECKBOX')
            groovyScript {
                script('''
                    if (States.equals('Sao Paulo')) {
                      return ['Barretos', 'Sao Paulo', 'Itu'];
                    } else if (States.equals('Rio de Janeiro')) {
                      return ['Rio de Janeiro', 'Mangaratiba']
                    } else if (States.equals('Parana')) {
                      return ['Curitiba', 'Ponta Grossa']
                    } else if (States.equals('Acre')) {
                      return ['Rio Branco', 'Acrelandia']
                    } else {
                      return ['Unknown state']
                    }
                       ''')
                fallbackScript('return ["Script error!"]')
            }
            referencedParameter('States')
        }
    }
}
