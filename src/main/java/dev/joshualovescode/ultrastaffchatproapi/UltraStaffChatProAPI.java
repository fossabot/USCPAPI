/**
 *    UltraStaffChatProAPI (USCPAPI) - The official Develoepr API of UltraStaffChatPro.
 *    Copyright (C) 2020  Joshua Sing & Myles Newton. <contact@joshualovescode.dev>
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU Affero General Public License as published
 *    by the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Affero General Public License for more details.
 *
 *    You should have received a copy of the GNU Affero General Public License
 *    along with this program.  If not, see <https://www.gnu.org/licenses/>.
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

    /**
     * Constructor
     * USED BY ULTRASTAFFCHATPRO, You do not need to do anything with this!
     * @param APIHandler - APIHandler
     */
    public UltraStaffChatProAPI(APIHandler APIHandler){
        handler = APIHandler;
        receiver = new APIReceiver();
    }

    /**
     * get Handler
     * USED BY ULTRASTAFFCHATPRO, You do not need to do anything with this!
     * @return APIHandler
     */
    public static APIHandler getHandler() { return handler; }

    /**
     * Get Receiver
     * USED BY ULTRASTAFFCHATPRO, You do not need to do anything with this!
     * @return APIReceiver
     */
    private static APIReceiver getReceiver(){
        return receiver;
    }

    /**
     * Send Message
     * @param m - USCPMessage
     */
    public void sendMessage(USCPMessage m){
        getHandler().sendMessage(m);
    }

    /**
     * Handle Message
     * USED BY ULTRASTAFFCHATPRO, You do not need to do anything with this!
     * @param m - USCPMessage
     */
    public static void handleMessage(USCPMessage m) { getReceiver().receiveMessage(m); }

    /**
     * Init
     * USED BY ULTRASTAFFCHATPRO, You do not need to do anything with this!
     * @param apiHandler - APIHandler
     */
    public static void init(APIHandler apiHandler){
        api = new UltraStaffChatProAPI(apiHandler);
        em = new EventManager();
    }

    /**
     * Get EventManager
     * @return EventManager
     */
    public static EventManager getEventManager() {
        return em;
    }

    /**
     * Get UltraStaffChatProAPI
     * @return UltraStaffChatProAPI
     */
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
