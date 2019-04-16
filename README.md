# envex - Environment Variable Explorer

I've see a lot of people struggle with environment variables. For better or worse, people use environment variables for a lot of things, between differentiating among local and production environments to injecting credentials during a build pipeline there's a lot of room for error. 

Additionally not understanding the way environment variables are set is likely to result in a lot of frusteration. Environment variables are hierarchical, a child process inherits it's environment variables from it's parent process. So for example if you're ssh'd into a machine and are attempting to correct some environment variables in your shell, you might be puzzled as to why it's not working -- It's likely not working because your shell is not the parent process of the build process. 

Problems like these can be hard to pin down without the appropriate context.

The aim of this project is to give you a binary that you can throw on a machine, this binary will help you see the process tree and each of the associated environment variables. [MVP]

Additionally:
+ The MVP will just give you information about the current state of your machine. In the future this application can attempt to answer:
	+ What changed? By whom? When? To help you further diagnose misbehavior.
+ Once we have this tree of processes, it might be easy to list metrics about those processes alongside the PID. Things like:
	+ Hardware utilization: cpu, ram, network, disk, etc.
