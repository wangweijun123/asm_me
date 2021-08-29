package com.darren.optimize.plugin

import com.darren.optimize.TinkerPatchParams
import org.gradle.api.Plugin
import org.gradle.api.Project

class ImageMonitorPlugin implements Plugin<Project> {
    public static final String EXT_NAME = "tinkerPatch"
    @Override
    void apply(Project project) {
        // 传递参数
//        project.extensions.create(EXT_NAME, TinkerPatchParams)
        println "Hello Plugin: " + project
        // 这里怎么写？
    }
}
