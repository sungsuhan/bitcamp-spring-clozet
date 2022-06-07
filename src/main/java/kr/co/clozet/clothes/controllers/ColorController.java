package kr.co.clozet.clothes.controllers;

import kr.co.clozet.clothes.services.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

/**
 * packageName:kr.co.clozet.clothes.controllers
 * fileName        :ColorController.java
 * author          : sungsuhan
 * date            :2022-06-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-07           sungsuhan      최초 생성
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping("/colors")
public class ColorController {

    private final ColorService service;


}
