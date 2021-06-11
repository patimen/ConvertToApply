package com.github.patimen.converttoapply.services

import com.github.patimen.converttoapply.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
