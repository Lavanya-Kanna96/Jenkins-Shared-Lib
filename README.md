# Jenkins Shared Library:

A Jenkins shared library is a set of reusable scripts that can be used across multiple pipelines, eliminating the need to duplicate code. 
Instead of writing the same logic multiple times, we create reusable modules or functions and call them whenever needed. 
This approach saves time, ensures consistency across projects, and makes pipelines easier to maintain.
The shared library is stored in a Git repository and follows a defined structure:
## vars Folder:
For simple, directly callable pipeline functions.
## src Folder: 
For structured and complex classes and packages.

## Repository Structure: Shared libraries follow a specific directory structure:

(root)
├── vars/
│ └── <script>.groovy
└── myPipeline.groovy
└── src/
└── <package>/<class>.groovy

## vars/: Contains global Groovy scripts accessible in Jenkins pipelines. Each script here is accessible as a function or variable in your pipeline.
## src/: Contains classes and packages, allowing you to structure your library more formally.


