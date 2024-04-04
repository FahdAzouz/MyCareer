package Dm;

public class Inbox {
    int i, j, n;
    Message temp;

    public Message Search_message(Message[] messages, Message toLook) {
        //this method takes an array of type Message and returns the corresponding message if found after searching the array
        for (Message message : messages) {
            if (message.equals(toLook)) return toLook;
        }
        return null; //handle it in main -> if the message is not found prompt a message in the main
    }

    //for this method we also need to use aggregation
    public Message[] sort_message(Message[] messages) {
        for (i = 0; i < messages.length; i++) {
            for (j = 0; j < messages.length - i; j++) {
                if (messages[j].Message.compareTo(messages[j + 1].Message) > 0) {
                    //swap elements
                    temp.Message = messages[j].Message;
                    messages[j].Message = messages[j + 1].Message;
                    messages[j].Message = temp.Message;
                }
            }
        }
        return messages;
    }
}
