package com.zmurilao.chatbot.whatsappbot.service;

import com.zmurilao.chatbot.whatsappbot.model.Message;
import com.zmurilao.chatbot.whatsappbot.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ChatbotService {
    @Autowired
    private MessageRepository messageRepository;

    public void setMessageRepository(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public MessageRepository getMessageRepository() {
        return messageRepository;
    }

    public Message saveMessage(Message message) {
        messageRepository.save(message);
        return message;
    }

    public List<Message> buscarTodasMensagens() {

        List<Message> messages =  messageRepository.findAll();

        return  messages;

    }

    public Optional<Message> buscarId(long id) {
        Optional<Message> ids = messageRepository.findById(id);
        return  ids;
    }

    public void excluirMensagem(long id) {
        messageRepository.deleteById(id);
    }

    public Message atualizarMensagem(Long id, Message messageAtualizada) {
        Optional<Message> verificar =  messageRepository.findById(id);

        messageRepository.findById(id);
        if (verificar.isPresent()) {
            messageRepository.save(messageAtualizada);
        }
        return  messageAtualizada;
    }


}
