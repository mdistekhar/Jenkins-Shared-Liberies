def call(String appName, String imageTag, String dockerHubUser) {

    echo "Starting Docker image build for ${dockerHubUser}/${appName}:${imageTag}"

    sh """
        docker build -t ${dockerHubUser}/${appName}:${imageTag} .
    """

    echo "Docker image built successfully"
}
