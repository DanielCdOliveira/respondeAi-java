public class User {
  String name;
  private String cpf;
  String email;
  String plan;

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void registerUser() {
    System.out.println("O aluno " + this.name + " foi cadastrado!");
  }

  public void watchClass(Class classObject) {
    System.out.println(this.name + " assistiu a aula: " + classObject.name + " do professor " + classObject.teacher);
  }
}
