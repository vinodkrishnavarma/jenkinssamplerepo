pipelineJob('scale-pods') {
  definition {
    cps {
        script(readFileFromWorkspace('jobdsl/testjob1.groovy'))
        sandbox()
    }
  }
    // parameters {
    //     choice(choices: ['Scale Up', 'Scale Down'], description: 'Select scaling action', name: 'scalingAction')
    //     choice(choices: ['cluster-one', 'cluster-two'], description: 'Select target Kubernetes cluster', name: 'clusterName')
    //     stringParam(description: 'Name of the deployment to scale', name: 'deploymentName')
    //     stringParam(defaultValue: '1', description: 'Desired number of replicas', name: 'replicaCount')
    }
}
