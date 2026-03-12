def call(String url , String) {
      echo 'Cloning the Code...'
                git url: url ,  branch: branch
                echo 'Code cloning Successfully....'
}
