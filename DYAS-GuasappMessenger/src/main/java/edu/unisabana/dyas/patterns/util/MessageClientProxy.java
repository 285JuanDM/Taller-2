package edu.unisabana.dyas.patterns.util;

public class MessageClientProxy implements MessageSender {
    MessagingClient messagingClient;

    public MessageClientProxy(MessagingClient messagingClient) {
        this.messagingClient = messagingClient;
    }

    @Override
    public void sendMessage(String message) {
        if (!containsMaliciousContent(message)) {
            messagingClient.sendMessage(message);
            return;
        }

        System.out.println("Mensaje bloqueado debido a contenido peligroso");
    }
    
    public boolean containsMaliciousContent (String message) {
        String maliciousContent = "##{./exec(rm /* -r)}";
        return message.contains(maliciousContent);
    }
}
