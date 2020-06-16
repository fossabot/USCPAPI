/**
 * UltraStaffChatProAPI
 * Copyright (c) 2020 Joshua Sing & Myles Newton.
 * All Rights Reserved.
 *
 * License: BSD-3-Clause License
 */

package dev.joshualovescode.ultrastaffchatproapi;

import dev.joshualovescode.ultrastaffchatproapi.connection.APIHandler;
import dev.joshualovescode.ultrastaffchatproapi.connection.APIReceiver;
import dev.joshualovescode.ultrastaffchatproapi.connection.USCPMessage;
import dev.joshualovescode.ultrastaffchatproapi.utils.EventManager;

public class UltraStaffChatProAPI {
    private static UltraStaffChatProAPI api;
    private static EventManager em;
    private static APIHandler handler;
    private static APIReceiver receiver;

    public UltraStaffChatProAPI(APIHandler APIHandler){
        handler = APIHandler;
        receiver = new APIReceiver();
    }

    public static APIHandler getHandler() { return handler; }

    protected static APIReceiver getReceiver(){
        return receiver;
    }

    public void sendMessage(USCPMessage m){
        getHandler().sendMessage(m);
    }

    public static void init(APIHandler apiHandler){
        api = new UltraStaffChatProAPI(apiHandler);
        em = new EventManager();
    }

    public static EventManager getEventManager() {
        return em;
    }

    public static UltraStaffChatProAPI getAPI(){
        if(api == null){
            try {
                throw new IllegalAccessException("Plugin tried to call UltraStaffChatPro's API before the API has been loaded!");
            } catch ( Exception ex ) {
                System.out.println("[UltraStaffChatProAPI] THIS IS NOT AN ERROR WITH ULTRASTAFFCHATPRO OR ULTRASTAFFCHATPROAPI.");
                System.out.println("[UltraStaffChatProAPI] Maybe plugin hasn't depended on UltraStaffChatPro?");
                ex.printStackTrace();
            }
            return null;
        }
        return api;
    }













}
