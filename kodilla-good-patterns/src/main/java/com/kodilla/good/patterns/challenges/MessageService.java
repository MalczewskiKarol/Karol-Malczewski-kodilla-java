package com.kodilla.good.patterns.challenges;

public class MessageService implements InformationService {

    public void inform(User user) {
        MessageService messageService = new MessageService();
        messageService.inform(user);
    }
}
