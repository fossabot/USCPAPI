/**
 * UltraStaffChatProAPI
 * Copyright (c) 2020 Joshua Sing & Myles Newton.
 * All Rights Reserved.
 *
 * License: BSD-3-Clause License
 */

package dev.joshualovescode.ultrastaffchatproapi.events;

import dev.joshualovescode.ultrastaffchatproapi.connection.USCPMessage;
import dev.joshualovescode.ultrastaffchatproapi.utils.Event;

public class USCPMessageEvent extends Event {
    private USCPMessage message;

    public USCPMessageEvent(USCPMessage m){
        this.message = m;
    }

    public USCPMessage getMessage() { return message; }

    public boolean isCanceled() {
        return false;
    }

    public void setCancelled(Boolean cancelled) {

    }
}
