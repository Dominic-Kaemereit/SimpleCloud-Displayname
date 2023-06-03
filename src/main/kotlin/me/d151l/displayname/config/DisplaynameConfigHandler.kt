package me.d151l.displayname.config

import eu.thesimplecloud.jsonlib.JsonLib
import me.d151l.displayname.config.entry.DisplaynameEntry
import java.io.File

class DisplaynameConfigHandler {

    private val displaynameFile = File("modules/displayname/displayname.json")

    fun getDisplaynameConfig(): DisplaynameConfig {
        if (!this.displaynameFile.exists())
            JsonLib.fromObject(this.createConfig()).saveAsFile(this.displaynameFile)

        return JsonLib.fromJsonFile(displaynameFile)!!.getObject(DisplaynameConfig::class.java)
    }

    private fun createConfig(): DisplaynameConfig {
        return DisplaynameConfig(
            listOf(DisplaynameEntry("SkyPVP-1", "SkyPVP")),
            listOf()
        )
    }
}