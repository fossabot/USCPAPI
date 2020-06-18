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

public class USCPMessage {
    private USCPMessageType messageType;
    private String channelName = null;
    private String playerName;
    private String message;
    private String serverName;
    private boolean isMultiChannel = false;

    /**
     * USCPMessage Constructor (StaffChat)
     * @param player - Name of the Player.
     * @param server - Name of the Server.
     * @param message - The Message.
     */
    public USCPMessage(String player, String server, String message){
        this.messageType = USCPMessageType.STAFFCHAT_MESSAGE;
        this.playerName = player;
        this.serverName = server;
        this.message = message;
    }

    /**
     * USCPMessage Constructor (MultiChannel)
     * @param channelName - Name of the Channel.
     * @param player - Name of the Player.
     * @param server - Name of the Server.
     * @param message - The Message.
     */
    public USCPMessage(String channelName, String player, String server, String message){
        this.messageType = USCPMessageType.MULTICHANNEL_MESSAGE;
        this.channelName = channelName;
        this.playerName = player;
        this.serverName = server;
        this.message = message;
        this.isMultiChannel = true;
    }

    /**
     * Get the type of message.
     * @return USCPMessageType
     */
    public USCPMessageType getMessageType() {
        return messageType;
    }

    /**
     * Get the name of the channel. (Will be null if the message is not multichannel.)
     * @return String
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Get the name of the Player.
     * @return String
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Get the name of the Server.
     * @return String
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Get the message.
     * @return String
     */
    public String getMessage() {
        return message;
    }

    /**
     * Is the message a MultiChannel message.
     * @return Boolean
     */
    public Boolean isMultiChannel() { return isMultiChannel; }

    /**
     * USCPMessageType Enum
     */
    public enum USCPMessageType {
        STAFFCHAT_MESSAGE,
        MULTICHANNEL_MESSAGE
    }
}
