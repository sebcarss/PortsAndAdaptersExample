# Ports And Adapters Example

This repository contains some sample code to understand how ports and adapters work.

## How to run it

Clone the repository to your machine.

`git clone https://github.com/sebcarss/PortsAndAdaptersExample.git`

Open up a terminal window and go to the `PortsAndAdaptersExample/` directory.

```
mkdir bin
cd src
javac -d ../bin Main.java
cd ../bin
java Main
```

You should now see the output in the terminal window. 

## Test data

Currently there are only 2 items in the stubbed database. You can see these in the PriceDAO.java, which contains a prices Map that is acting as our DynamoDB. To change which one gets displayed you can change the ID that is passed into the PriceResource.java

## Side note

As this is only to help my understanding of ports and adapters I haven't implemented any mappers between the boundaries but in a real world situation you would want mappers to make the code more readable and to separate concerns. 