package org.apache.kafka.clients.consumer;

import org.apache.kafka.common.Configurable;
import org.apache.kafka.common.TopicPartition;

import java.io.Closeable;

public interface LatencyTime extends Configurable, Closeable {
    /**
     * Get wall clock time given a provided topic and partition. Return wall clock time as a
     * UNIX epoch time in milliseconds of type long.
     */
    public long getWallClockTime(TopicPartition tp);

    /**
     * This is called when the latency time implementation is closed
     */
    public void close();
}
