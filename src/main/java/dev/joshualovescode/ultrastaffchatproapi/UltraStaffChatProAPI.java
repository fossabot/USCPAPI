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

public class UltraStaffChatProAPI {
    private static UltraStaffChatProAPI api;
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

    public static void sendMessage(USCPMessage m){
        getHandler().sendMessage(m);
    }

    public static void init(APIHandler apiHandler){
        api = new UltraStaffChatProAPI(apiHandler);
    }

    public static UltraStaffChatProAPI getAPI(){
        return api;
    }













}
