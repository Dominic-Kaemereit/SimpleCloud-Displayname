package me.d151l.displayname.listener

import eu.thesimplecloud.api.event.service.CloudServiceStartedEvent
import eu.thesimplecloud.api.eventapi.CloudEventHandler
import eu.thesimplecloud.api.eventapi.IListener
import me.d151l.displayname.DisplaynameModule


class CloudServiceStartedListener(
    private val displaynameModule: DisplaynameModule
): IListener {

    @CloudEventHandler
    fun handle(event: CloudServiceStartedEvent) {
        val cloudService = event.cloudService
        this.displaynameModule.checkAndUpdateService(cloudService)
    }
}