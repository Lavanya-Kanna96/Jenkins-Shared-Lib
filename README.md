# Jenkins Shared Library:

A Jenkins shared library is a set of reusable scripts that can be used across multiple pipelines, eliminating the need to duplicate code. 
Instead of writing the same logic multiple times, we create reusable modules or functions and call them whenever needed. 
This approach saves time, ensures consistency across projects, and makes pipelines easier to maintain.
The shared library is stored in a Git repository and follows a defined structure:
## vars Folder:
For simple, directly callable pipeline functions.
## src Folder: 
For structured and complex classes and packages.

(root)
├── vars/
│   └── myPipeline.groovy
└── src/
    └── com/example/HelperClass.groovy


