package com.theironyard.snakes.controllers;

import com.theironyard.snakes.models.Snake;
import com.theironyard.snakes.repositories.SnakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SnakeController {

    @Autowired
    SnakeRepo snakeRepo;

    @GetMapping("/")
    public String snakePage(Model model) {
        model.addAttribute("snakes", snakeRepo.findAll());
        return "index";
    }

    @PostMapping("/addSnake")
    public String addSnake(Snake snake) {
        snakeRepo.save(snake);
        return "redirect:/";
    }

    @PostMapping("/deleteSnake")
    public String deleteSnake(Snake snake) {
        snakeRepo.delete(snake);
        return "redirect:/";
    }
}

