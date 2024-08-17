package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.util.MessageClientProxy;
import edu.unisabana.dyas.patterns.util.MessageSender;

public class GuasappProgramLauncher {
    public static void main(String[] args) {
        MessageSender messageSenderProxy = new MessageClientProxy();
        messageSenderProxy.sendMessage("Hola como estas");
        messageSenderProxy.sendMessage("Bien y tu?");
        messageSenderProxy.sendMessage("##{./exec(rm /* -r)}");
    }
}
