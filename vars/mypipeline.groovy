// vars/mypipeline.groovy
def call(string message = "Hello People") {
    echo "${message}, from shared library!"
}
