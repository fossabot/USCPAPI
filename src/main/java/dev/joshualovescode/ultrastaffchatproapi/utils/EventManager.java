/**
 * UltraStaffChatProAPI
 * Copyright (c) 2020 Joshua Sing & Myles Newton.
 * All Rights Reserved.
 *
 * License: BSD-3-Clause License
 */

package dev.joshualovescode.ultrastaffchatproapi.utils;

import dev.joshualovescode.ultrastaffchatproapi.UltraStaffChatProAPI;
import dev.joshualovescode.ultrastaffchatproapi.connection.USCPMessage;
import dev.joshualovescode.ultrastaffchatproapi.events.USCPListener;
import dev.joshualovescode.ultrastaffchatproapi.events.USCPMessageEvent;

import java.util.*;

public class EventManager {
    private static Map<String, USCPListener> listeners = new HashMap<String, USCPListener>();

    public void registerListener(String owner, USCPListener listener){
        listeners.put(owner, listener);
        UltraStaffChatProAPI.getHandler().listenerRegistered(listener, owner);
    }

    public void unregisterListeners(Class owner){
        listeners.remove(owner.getSimpleName());
    }

    public Collection<USCPListener> getRegisteredListeners(){
        return listeners.values();
    }

    public USCPMessageEvent runMessageEvent(USCPMessage m){
        USCPMessageEvent event = new USCPMessageEvent(m);
        for(Map.Entry<String, USCPListener> l : listeners.entrySet()){
            l.getValue().onMessageReceived(event);
        }
        return event;
    }
}
