package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplication {

private MessageService messageService;

    public SimpleApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            this.messageService.send(message, receiver);
        }
    }

    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}




                                                        // Jeżeli to nie działa prawidłowo to i processMessage nie zadziała
                                                        //a moznaby potrakowac messageService jak mock'a(nie o to chodzi)
//  private MessageService messageService = new MessageService();
//    public void processMessage(String message, String receiver){
//        if (checkReceiver(receiver)) {
//            this.messageService.send(message,receiver);
//        }
//    }
//
//    private boolean checkReceiver(String receiver){
//        return receiver != null && !receiver.isEmpty();
//    }
//  }
