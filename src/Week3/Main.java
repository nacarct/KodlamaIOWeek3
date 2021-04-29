package Week3;

public class Main {

    public static void main(String[] args) {
        Instructor egitmen = new Instructor();
        egitmen.setId(1);
        egitmen.setUsername("engin.demirog");
        egitmen.setPassword("321");
        egitmen.setEmail("engin.demirog@gmail.com");
        egitmen.setInstructorName("Engin Demiroğ");

        Student ogrenci = new Student();
        ogrenci.setId(2);
        ogrenci.setUsername("temucin.nacar");
        ogrenci.setPassword("123");
        ogrenci.setEmail("nacarct@gmail.com");
        ogrenci.setStudentName("Temuçin nacar");

        User[] users = {egitmen, ogrenci};

        UserManager userManager = new UserManager();

        userManager.addMultiple(users);

        userManager.login(egitmen);

        userManager.login(ogrenci);

        userManager.changePassword(ogrenci,"123456");

        Course course = new Course();
        course.setId(1);
        course.setName("Java & React");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addCourse(egitmen,course);

        StudentManager studentManager = new StudentManager();
        studentManager.enroll(ogrenci,course);

        userManager.comment(egitmen,course,"Ödevler yüklendi!");

        userManager.comment(ogrenci,course, "Teşekkürler hocam... :)");

        userManager.logout(egitmen);
        userManager.logout(ogrenci);

    }
}
