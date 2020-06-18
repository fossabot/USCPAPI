/**
 * UltraStaffChatProAPI
 * Copyright (c) 2020 Joshua Sing & Myles Newton.
 * All Rights Reserved.
 *
 * License: BSD-3-Clause License
 */

package dev.joshualovescode.ultrastaffchatproapi.connection;

import dev.joshualovescode.ultrastaffchatproapi.UltraStaffChatProAPI;
import dev.joshualovescode.ultrastaffchatproapi.utils.EventManager;

public class APIReceiver {
    /**
     * Triggers Events. (Called by USCP)
     * @return Boolean (IsCancelled)
     */
    public Boolean receiveMessage(USCPMessage m){
        return !UltraStaffChatProAPI.getEventManager().runMessageEvent(m).isCanceled();
    }
}
