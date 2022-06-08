package im.kny.jacksonspeedup

import org.apache.commons.lang3.time.StopWatch

class StopWatchUtil constructor(
    val message: String,

    ) : AutoCloseable {

    val sw = StopWatch.createStarted()

    override fun close() {
        sw.stop()
        println(toString())
    }

    override fun toString(): String {
        return "$message: $sw"
    }
}