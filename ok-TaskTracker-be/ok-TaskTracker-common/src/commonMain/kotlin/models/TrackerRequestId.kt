package models

import kotlin.jvm.JvmInline

@JvmInline
value class TrackerRequestId(private val id: String) {
    fun asString() = id

    companion object {
        val NONE = TrackerRequestId("")
    }
}
