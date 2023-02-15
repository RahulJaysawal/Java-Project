package com.example.webapp;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller
{
    @RequestMapping("cources")


    public String courses(HttpServletRequest req)
    {
        String cname=req.getParameter("cname");
        System.out.println("the courseis "+cname);
       /* HttpSession session=req.getSession();
        session.setAttribute("cname",cname);*/

        return "course";
    }
}
