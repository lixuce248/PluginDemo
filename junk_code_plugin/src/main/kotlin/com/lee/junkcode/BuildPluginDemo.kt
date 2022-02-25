package com.lee.junkcode

import org.gradle.api.Plugin
import org.gradle.api.Project

class BuildPluginDemo:Plugin<Project> {
    override fun apply(p0: Project) {
        println("使用独立BuildPluginDemo方式创建")
    }
}