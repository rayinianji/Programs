println("Clonning the application...")
dir('appl') {
    git(
        url: "https://github.com/rayinianji/Programs.git",
        branch: "master"
    )
}
println("Completed"
