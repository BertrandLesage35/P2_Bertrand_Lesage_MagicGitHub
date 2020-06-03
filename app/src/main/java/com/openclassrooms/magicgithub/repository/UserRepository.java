package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.api.FakeApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // Bertrand: utiliser apiservice

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() { //Bertrand - retour de la liste des users par apple de la méthode getuser de apiService
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // Bertrand: génère un utilisateur de manière aléatoire
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // Bertrand: Efface l'utilisateur passé en paramètre
        apiService.deleteUser(user);
    }
}
