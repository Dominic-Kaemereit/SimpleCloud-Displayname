package me.d151l.displayname

import eu.thesimplecloud.api.CloudAPI
import eu.thesimplecloud.api.external.ICloudModule
import eu.thesimplecloud.api.service.ICloudService
import me.d151l.displayname.config.DisplaynameConfig
import me.d151l.displayname.config.DisplaynameConfigHandler

class DisplaynameModule: ICloudModule {

    private val displaynameConfigHandler = DisplaynameConfigHandler()

    lateinit var displaynameConfig: DisplaynameConfig

    override fun onDisable() {

    }

    override fun onEnable() {
        this.displaynameConfig = this.displaynameConfigHandler.getDisplaynameConfig()

        CloudAPI.instance.getCloudServiceManager().getAllCachedObjects().forEach { service ->
            this.checkAndUpdateService(service)
        }
    }

    override fun isReloadable(): Boolean {
        return true
    }

    fun checkAndUpdateService(service: ICloudService) {
        val displaynameEntriesByName = this.displaynameConfig.services.filter { it.target == service.getName() }
        val displaynameEntriesByGroupName = this.displaynameConfig.groups.filter { it.target == service.getGroupName() }

        if (!displaynameEntriesByGroupName.isEmpty()) {
            val displaynameEntry = displaynameEntriesByGroupName[0]
            service.setDisplayName(displaynameEntry.displayname)
            service.update()
        }

        if (!displaynameEntriesByName.isEmpty()) {
            val displaynameEntry = displaynameEntriesByName[0]
            service.setDisplayName(displaynameEntry.displayname)
            service.update()
        }
    }
}
