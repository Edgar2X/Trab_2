//Edgar Enthony Ferreira Lima

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();  
        Disciplina disc = new Disciplina();

        aluno1.alt_nome("Douglas");
        aluno1.alt_id(1);

        aluno1.nota1 = 3.5;
        aluno1.nota2 = 6.5;

        aluno1.retornaMedia();
        
        aluno1.passou(); 
        
        disc.add_alu();
        disc.media_notas();
        disc.entrada();
     }
}
 

