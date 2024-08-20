package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.util.MessageClientProxy;
import edu.unisabana.dyas.patterns.util.MessageSender;
import edu.unisabana.dyas.patterns.util.MessagingClient;

public class GuasappProgramLauncher {
    public static void main(String[] args) {
        MessageSender messageSenderProxy = new MessageClientProxy(new MessagingClient());
        messageSenderProxy.sendMessage("Hola como estas");
        messageSenderProxy.sendMessage("Bien y tu?");
        messageSenderProxy.sendMessage("##{./exec(rm /* -r)}");
        messageSenderProxy.sendMessage("Ey, como así, que me estas mandando?");
    }
}
