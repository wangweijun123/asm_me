package com.darren.optimize.plugin

import com.darren.optimize.TinkerPatchParams
import org.gradle.api.Plugin
import org.gradle.api.Project

class ImageMonitorPlugin implements Plugin<Project> {
    // 与app/build.gradle 配置参数一致
    public static final String EXT_NAME = "tinkerPatch"
    @Override
    void apply(Project project) {
        // 从app/build.gradle 传递参数tinkerPatch 到插件处理
        println "Hello Plugin wwwj: " + project
        TinkerPatchParams tinkerPatchParams = project.extensions.create(EXT_NAME, TinkerPatchParams)
        println "oldApk: " + tinkerPatchParams.oldApk
    }
}
