public interface UserRepository {

    void addUser(User user);
    User getUserByUsername(String username);
    boolean isUsernameToken(String username);
}
