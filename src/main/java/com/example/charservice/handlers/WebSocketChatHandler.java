package com.example.charservice.handlers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Slf4j
@Component // 빈으로 등록해줘야함.
public class WebSocketChatHandler extends TextWebSocketHandler {
    // 웹소켓 클라이언트가 서버로 연결 시
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        log.info("{} conntection", session.getId());
    }
    // 웹소켓 클라이어트에서 메시지 왔을 때 처리
    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        super.handleMessage(session, message);
    }
    // 서버에 접속한 웹소켓 클라이언트가 연결 종료 시
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        log.info("{} disconnection", session.getId());
    }
}
