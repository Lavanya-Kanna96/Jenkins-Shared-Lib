// vars/mypipeline.groovy
def call(String message = "Hello People") {
    echo "${message}, from shared library!"
}
