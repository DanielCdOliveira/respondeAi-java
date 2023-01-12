public class App {
    public static void main(String[] args) {
        User aluno = new User();
        aluno.name = "Daniel";
        aluno.setCpf("123.456.789-12");
        aluno.email = "email@email.com";
        aluno.registerUser();
        Class java = new Class();
        java.name = "Introdução ao java";
        java.teacher = "Frank";
        aluno.watchClass(java);
    }
}
