package Week3;

public class UserManager {
    public void add(User user){
        System.out.println(user.getUsername()+ " Kullanıcısı eklendi...");
    }

    public void addMultiple(User[] users){
        for (User user:users){
            add(user);
        }
    }

    public void changePassword(User user,String newPassword){
        System.out.println(user.getUsername() + " Şifresini değiştirildi.");
    }

    public void login(User user){
        System.out.println(user.getUsername() + " Giriş yaptı.");
    }

    public void logout(User user){
        System.out.println(user.getUsername() + " Çıkış yaptı.");
    }

    public void comment(User user,Course course,String message){
        System.out.println(course.getName() + "\n" + user.getUsername() + ": " + message);
    }
}
