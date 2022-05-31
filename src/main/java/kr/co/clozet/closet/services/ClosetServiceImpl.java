package kr.co.clozet.closet.services;

import kr.co.clozet.closet.repositories.ClosetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName:kr.co.clozet.closet.services
 * fileName        :ClosetServiceImpl.java
 * author          : sungsuhan
 * date            :2022-05-29
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-29           sungsuhan      최초 생성
 **/
@Service
@RequiredArgsConstructor
public class ClosetServiceImpl implements ClosetService {

    private final ClosetRepository repository;
}
