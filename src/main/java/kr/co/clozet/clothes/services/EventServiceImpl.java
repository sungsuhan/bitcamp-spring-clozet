package kr.co.clozet.clothes.services;

import kr.co.clozet.clothes.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName:kr.co.clozet.clothes.services
 * fileName        :EventServiceImpl.java
 * author          : sungsuhan
 * date            :2022-06-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-07           sungsuhan      최초 생성
 **/
@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService{
    private final EventRepository repository;
}
