package com.github.serenity1994.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.serenity1994.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
