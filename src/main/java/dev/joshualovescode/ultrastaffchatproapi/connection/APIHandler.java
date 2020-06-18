/**
 *    UltraStaffChatProAPI (USCPAPI) - The official Developer API of UltraStaffChatPro.
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
    public abstract void listenerRegistered(USCPListener listener, String belongsTo);
}
