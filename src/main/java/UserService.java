public interface UserService {

    void registerUser(UserDTO userDTO);
    boolean loginUser(String username, String password);
}
