package com.jmsmessagingmaven.demo.receiver;

import com.jmsmessagingmaven.demo.model.Email;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/*The @JmsListener annotation defines the name
  of the Destination that this method should listen
  to and the reference to the JmsListenerContainerFactory
  to use to create the underlying message listener container.
  Strictly speaking that last attribute is not necessary unless
  you need to customize the way the container is built as Spring
  Boot registers a default factory if necessary.
*/

@Component
public class Receiver {

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage(Email email) {
        System.out.println("Received <" + email + ">");
    }

}
