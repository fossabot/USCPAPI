/**
 * UltraStaffChatProAPI
 * Copyright (c) 2020 Joshua Sing & Myles Newton.
 * All Rights Reserved.
 *
 * License: BSD-3-Clause License
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
    private USCPMessage(String player, String server, String message){
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
    private USCPMessage(String channelName, String player, String server, String message){
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
