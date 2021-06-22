package io.omnipede.accesslog

import java.net.InetAddress
import java.net.UnknownHostException

internal class HostName {

    val hostName: String = try {
        InetAddress.getLocalHost().hostName
    } catch (e: UnknownHostException) {
        "Unknown"
    }
}
