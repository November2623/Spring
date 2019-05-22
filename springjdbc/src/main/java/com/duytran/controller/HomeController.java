package com.duytran.controller;

public class HomeController {
    @Controller
    public class Homecontroller {
        private UserService userService;
        @GetMapping(value="/user")
        public String getUser(HttpServletRequest rq){
            List<User> listUser = userService.getAllUser();
            rq.setAttribute("listUser", listUser);
            return "user";
        }
    }
}



