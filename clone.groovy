def call(String url , String) {
    echo "Cloning repository"
    git url: "${url}", branch: "${branch}"
   echo " Code cloning Successfully....."
}
