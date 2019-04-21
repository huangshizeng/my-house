package com.huang.myhouse.controller;

import com.huang.myhouse.common.ApiStatusCodeEnum;
import com.huang.myhouse.common.ResponseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author hsz
 */

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/center")
    public String center() {
        return "admin/center";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "admin/welcome";
    }

    @GetMapping("/loginPage")
    public String loginPage() {
        return "admin/login";
    }

    @GetMapping("/addHousePage")
    public String addHousePage() {
        return "admin/house-add";
    }

    @PostMapping("/upload/photo")
    @ResponseBody
    public ResponseResult upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseResult.error(ApiStatusCodeEnum.NO_FILE_NULL);
        }
        String fileName = file.getOriginalFilename();
        File target = new File("E:" + File.separator + "my-house photo" + File.separator + fileName);
        try {
            file.transferTo(target);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseResult.error(ApiStatusCodeEnum.SYSTEM_INNER_ERROR);
        }
        return ResponseResult.result(ApiStatusCodeEnum.SUCCESS, true);
    }
}
