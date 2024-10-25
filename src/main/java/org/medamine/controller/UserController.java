package org.medamine.controller;

import org.medamine.model.User;
import org.medamine.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    // Constructor-based injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Show list of users
    @GetMapping("/list")
    public String listUsers(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "listUsers"; // returns listUsers.jsp
    }

    // Show form to add a user
    @GetMapping("/add")
    public String showAddUserForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "addUser"; // returns addUser.jsp
    }

    // Handle adding a user
    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/users/list";
    }

    // Show form to update a user
    @GetMapping("/update")
    public String showUpdateUserForm(@RequestParam("userId") long id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "addUser";
    }

    // Handle deleting a user
    @GetMapping("/delete")
    public String deleteUser(@RequestParam("userId") long id) {
        userService.deleteById(id);
        return "redirect:/users/list";
    }
}
