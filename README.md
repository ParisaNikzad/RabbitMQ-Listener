# RabbitMQ-Listener

If we want the application to be RabbitMQ consumer, we need to take care of:

- A class which implements MessageListener: This class will receive the message when it arrives.
- A configuration to define the queue, make the connection, and a container for messageListener. 

After running the application, we can see the queue in the RabbitMQ dashboard. 
<br /> 

We can publish message from the queue in the dashboard.
