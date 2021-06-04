import java.util.Scanner;

public class Disciplina {
    
    Aluno[] aluno = new Aluno[10];
    
    public void media_notas(){
        aluno[1] = new Aluno();
        aluno[1].nota1 = 2.5;
        aluno[1].nota2 = 8;

        aluno[2] = new Aluno();
        aluno[2].nota1 = 7; 
        aluno[2].nota2 = 8;

        aluno[3] = new Aluno();
        aluno[3].nota1 = 5; 
        aluno[3].nota2 = 3;
        
        int i = 0;
        double m1 = 0;
        while (i < 10){
            i = i + 1;
            if (aluno[i] != null){
                m1 = m1 +  aluno[i].nota1;
                System.out.println( m1/i );
            }
        }

    }
    public void entrada(){
        aluno[1] = new Aluno();
        aluno[1].nota1 = 2.5;
        aluno[1].nota2 = 8;
        aluno[1].alt_nome("PAULO");

        aluno[2] = new Aluno();
        aluno[2].nota1 = 7; 
        aluno[2].nota2 = 8;
        aluno[2].alt_nome("ANDRE");

        aluno[3] = new Aluno();
        aluno[3].nota1 = 5; 
        aluno[3].nota2 = 3;
        aluno[3].alt_nome("CARLOS");

        Scanner ler = new Scanner(System.in);
        int a=ler.nextInt();
        aluno[a-1].imp_nome(); 
        aluno[a+1].imp_nome();
    }
}


