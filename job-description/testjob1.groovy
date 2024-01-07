pipelineJob('scale-pods') {
  definition {
    cps {
        script(readFileFromWorkspace('jobdsl/testjob1.groovy'))
        sandbox()
    }
  }
    parameters {
        stringParam('clusterName', description: 'Name of the cluster to scale (cluster-one or cluster-two)')
        stringParam('deploymentName', description: 'Name of the deployment to scale')
        stringParam('replicaCount', description: 'Desired number of replicas')
    }
}
