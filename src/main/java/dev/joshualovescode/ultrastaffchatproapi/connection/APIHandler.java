/**
 * UltraStaffChatProAPI
 * Copyright (c) 2020 Joshua Sing & Myles Newton.
 * All Rights Reserved.
 *
 * License: BSD-3-Clause License
 */

package dev.joshualovescode.ultrastaffchatproapi.connection;

import dev.joshualovescode.ultrastaffchatproapi.events.USCPListener;

public abstract class APIHandler {

    /**
     * Send a message to USCP.
     * @param m - USCPMessage
     */
    public abstract void sendMessage(USCPMessage m);

    /**
     * Lets USCP know that there has been a listener registered.
     * @param listener - The Listener that has been registered.
     * @param belongsTo - The owner of the Listener.
     */
    public abstract void listenerRegistered(USCPListener listener, Class belongsTo);

}
